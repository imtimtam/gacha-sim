<<<<<<< HEAD
package gacha.banner;
import java.util.*;

import gacha.GachaRegistry;
import gacha.User;
import gacha.items.Character;

public class LimitedCharacterBanner extends Banner {
    public LimitedCharacterBanner(User user, String bannerName, BannerType type, List<Character> featuredFiveStars, List<Character> featuredFourStars){
        super(user, bannerName, type);

        this.featuredFiveStars = new ArrayList<>(featuredFiveStars);
        this.standardFiveStars = new ArrayList<>(GachaRegistry.STANDARDFIVESTARCHARACTERS);
        // Featured readded to standard to imitate a known hidden pity mechanic.
        standardFiveStars.addAll(featuredFiveStars);
        this.featuredFourStars = new ArrayList<>(featuredFourStars);
        this.standardFourStarsCharacters = new ArrayList<>(GachaRegistry.STANDARDFOURSTARCHARACTERS);
        this.standardFourStarsWeapons = new ArrayList<>(GachaRegistry.STANDARDFOURSTARWEAPONS);
        this.standardThreeStars = new ArrayList<>(GachaRegistry.STANDARDTHREESTARWEAPONS);
    }
}
=======
package gacha.banner;
import java.util.*;

import gacha.GachaRegistry;
import gacha.User;
import gacha.items.Character;

public class LimitedCharacterBanner extends Banner {
    public LimitedCharacterBanner(User user, String bannerName, BannerType type, List<Character> featuredFiveStars, List<Character> featuredFourStars){
        super(user, bannerName, type);

        this.featuredFiveStars = new ArrayList<>(featuredFiveStars);
        this.standardFiveStars = new ArrayList<>(GachaRegistry.STANDARDFIVESTARCHARACTERS);
        // Featured readded to standard to imitate a known hidden pity mechanic.
        standardFiveStars.addAll(featuredFiveStars);
        this.featuredFourStars = new ArrayList<>(featuredFourStars);
        this.standardFourStarsCharacters = new ArrayList<>(GachaRegistry.STANDARDFOURSTARCHARACTERS);
        this.standardFourStarsWeapons = new ArrayList<>(GachaRegistry.STANDARDFOURSTARWEAPONS);
        this.standardThreeStars = new ArrayList<>(GachaRegistry.STANDARDTHREESTARWEAPONS);
    }
}
>>>>>>> 67c6e43da4a346ede2d80f03966a825c93951621
