package gacha.banner;
import java.util.*;

import gacha.GachaRegistry;
import gacha.User;
import gacha.items.GachaItem;
import gacha.items.Weapon;

public class LimitedWeaponBanner extends Banner {
    public LimitedWeaponBanner(User user, String bannerName, BannerType type, List<Weapon> featuredFiveStars, List<Weapon> featuredFourStars){
        super(user, bannerName, type);

        this.featuredFiveStars = new ArrayList<>(featuredFiveStars);
        this.standardFiveStars = new ArrayList<>(GachaRegistry.STANDARDFIVESTARWEAPONS);
        // Featured readded to standard to imitate a known hidden pity mechanic.
        standardFiveStars.addAll(featuredFiveStars);
        this.featuredFourStars = new ArrayList<>(featuredFourStars);
        this.standardFourStarsCharacters = new ArrayList<>(GachaRegistry.STANDARDFOURSTARCHARACTERS);
        this.standardFourStarsWeapons = new ArrayList<>(GachaRegistry.STANDARDFOURSTARWEAPONS);
        this.standardThreeStars = new ArrayList<>(GachaRegistry.STANDARDTHREESTARWEAPONS);

        // Weapon banners differ from character banners rates and pities.
        this.baseChance = 0.008;
        this.fourStarChance = 0.066;
        this.fourStarPity = 10;
        this.hardPity = 80;
        this.softPity = 64;
    }

    // Featured 50:50 mechanics becomes 75:25 while keeping guaranteed pity.
    @Override
    protected GachaItem getFiveStar() {
        if (guaranteedFeaturedFiveStar || rand.nextDouble() < 0.75) {
            guaranteedFeaturedFiveStar = false;
            return getRandom(featuredFiveStars);
        } else {
            guaranteedFeaturedFiveStar = true;
            return getRandom(standardFiveStars);
        }
    }

    @Override
    protected GachaItem getFourStar(){
        if(guaranteedFeaturedFourStar || rand.nextDouble() < 0.75){
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
}
