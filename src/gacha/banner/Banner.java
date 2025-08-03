package gacha.banner;
import java.util.*;

import gacha.Inventory;
import gacha.User;
import gacha.items.GachaItem;

/**
 * Abstract base class resembling a gacha banner.
 * Handles pulling, pity tracking, and rate-ups.
 * Subclasses define systemic changes for different banner types.
 */

public abstract class Banner {
    protected User user;
    private String bannerName;
    private BannerType type;

    protected List<GachaItem> featuredFiveStars;
    protected List<GachaItem> standardFiveStars;
    protected List<GachaItem> featuredFourStars;
    protected List<GachaItem> standardFourStarsCharacters;
    protected List<GachaItem> standardFourStarsWeapons;
    protected List<GachaItem> standardThreeStars;

    protected boolean guaranteedFeaturedFiveStar = false;
    protected boolean guaranteedFeaturedFourStar = false;

    // Chances and pities defaulted to rates found in character banners.
    protected double baseChance = 0.006;
    protected double fourStarChance = 0.051;
    protected double fourStarPity = 10;
    protected int hardPity = 90;
    protected int softPity = 74;

    private int totalCount = 0;
    private int fivePityCount = 0;
    private int fourPityCount = 0;

    protected static Random rand = new Random();

    public Banner(User user, String bannerName, BannerType type){
        this.user = user;
        this.bannerName = bannerName;
        this.type = type;
    }

    public String getBannerName(){
        return this.bannerName;
    }

    public BannerType getBannerType(){
        return this.type;
    }

    public int getTotalCount(){
        return totalCount;
    }

    public String pullOnce(){
        Inventory inventory = user.getInventory();
        Map<String, LinkedList<GachaItem>> pullHistory = user.getPullHistory();
        GachaItem pulledGachaItem;

        totalCount += 1;
        fivePityCount += 1;
        fourPityCount += 1;

        if(fivePityCount >= hardPity){
            pulledGachaItem = getFiveStar();
            fivePityCount = 0;
        }
        else if(fourPityCount >= fourStarPity){
            pulledGachaItem = getFourStar();
            fourPityCount = 0;
        }
        else{
            double fiveStarChance = getFiveStarChance(fivePityCount);
            double roll = rand.nextDouble();

            if(roll < fiveStarChance){
                pulledGachaItem = getFiveStar();
                fivePityCount = 0;
            }
            else if(roll < fourStarChance + fiveStarChance){
                pulledGachaItem = getFourStar();
                fourPityCount = 0;
            }
            else{
                pulledGachaItem = getRandom(standardThreeStars);
            }
        }

        inventory.addItem(pulledGachaItem);
        pullHistory.putIfAbsent(bannerName, new LinkedList<>());
        pullHistory.get(bannerName).addFirst(pulledGachaItem);
        return pulledGachaItem.toString();
    }

    public void pullTen(){
        for(int i = 0; i < 10; i++){
            pullOnce();
        }
    }

    protected GachaItem getFiveStar(){
        if(guaranteedFeaturedFiveStar || rand.nextBoolean()){
            guaranteedFeaturedFiveStar = false;
            return getRandom(featuredFiveStars);
        }
        else{
            guaranteedFeaturedFiveStar = true;
            return getRandom(standardFiveStars);
        }
    }

    protected GachaItem getFourStar(){
        if(guaranteedFeaturedFourStar || rand.nextBoolean()){
            guaranteedFeaturedFourStar = false;
            return getRandom(featuredFourStars);
        }

        guaranteedFeaturedFourStar = true;
        if(rand.nextBoolean()){
            return getRandom(standardFourStarsCharacters);
        }
        else{
            return getRandom(standardFourStarsWeapons);
        }
    }

    protected GachaItem getRandom(List<GachaItem> pool){
        return pool.get(rand.nextInt(0, pool.size()));
    }

    // Imitates soft pity chances and mechanics commonly found in gachas
    protected double getFiveStarChance(int currentPity){
        if(currentPity < softPity){
            return baseChance;
        }
        int pullsPastSoft = currentPity - softPity;
        double currentChance = baseChance + pullsPastSoft * ((1.0 - baseChance) / (hardPity - softPity));

        return Math.min(currentChance, 1.0);
    }
}
