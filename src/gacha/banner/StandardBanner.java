package gacha.banner;
import java.util.*;

import gacha.GachaRegistry;
import gacha.User;
import gacha.items.GachaItem;

public class StandardBanner extends Banner {
    public StandardBanner(User user, String bannerName, BannerType type){
        super(user, bannerName, type);

        this.featuredFiveStars = new ArrayList<>(GachaRegistry.STANDARDFIVESTARCHARACTERS);
        this.standardFiveStars = new ArrayList<>(GachaRegistry.STANDARDFIVESTARWEAPONS);
        this.standardFourStarsCharacters = new ArrayList<>(GachaRegistry.STANDARDFOURSTARCHARACTERS);
        this.standardFourStarsWeapons = new ArrayList<>(GachaRegistry.STANDARDFOURSTARWEAPONS);
        this.standardThreeStars = new ArrayList<>(GachaRegistry.STANDARDTHREESTARWEAPONS);
    }

    // Standard banners do not contain featured characters and is overriden to be 50:50 between standard characters and weapons.
    @Override
    protected GachaItem getFourStar(){
        if(guaranteedFeaturedFourStar || rand.nextBoolean()){
            guaranteedFeaturedFourStar = false;
            return getRandom(standardFourStarsCharacters);
        }
        else{
            guaranteedFeaturedFourStar = true;
            return getRandom(standardFourStarsWeapons);
        }
    }
}
