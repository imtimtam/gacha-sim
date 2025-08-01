package gacha;
import java.util.*;
import java.util.stream.Collectors;

import gacha.banner.Banner;
import gacha.items.Character;
import gacha.items.GachaItem;
import gacha.items.HasElement;
import gacha.items.HasPath;
import gacha.items.Weapon;

public class GachaRegistry {
    public static final Character BAILU = new Character("Bailu", 5, "A vivacious young lady of the Vidyadhara race, she is known as the \"Healer Lady\" on The Xianzhou Luofu due to her expertise with medicine. She often dishes out unorthodox prescriptions such as \"Stay well hydrated\" and \"Get a good night's rest.\"", Path.ABUNDANCE, Element.LIGHTNING);
    public static final Character BRONYA = new Character("Bronya", 5, "The current Supreme Guardian of Belobog, she is the young and capable commander of the Silvermane Guards. Bronya received rigorous education from an early age, and possesses the grace and affinity as expected of an heir.", Path.HARMONY, Element.WIND);
    public static final Character CLARA = new Character("Clara", 5, "She is a shy young girl orphaned at an early age, accompanied by an ancient mech named Svarog. Her greatest wish is \"to have a family.\"", Path.DESTRUCTION, Element.PHYSICAL);
    public static final Character GEPARD = new Character("Gepard", 5, "The honorable and upstanding captain of the Silvermane Guards who bears the noble Landau family name. In the frost-whipped city of Belobog, life can still go on in normality...", Path.PRESERVATION, Element.ICE);
    public static final Character HIMEKO = new Character("Himeko", 5, "An adventurous scientist who encountered and repaired a stranded train as a child, she now ventures across the universe with the Astral Express as its navigator.", Path.ERUDITION, Element.ICE);
    public static final Character JINGYUAN = new Character("Jing Yuan", 5, "One of the seven Arbiter-Generals of the Xianzhou Alliance's Cloud Knights, and one of the Six Charioteers of the Xianzhou Luofu. Although he appears lazy, Jing Yuan has been a general on the Luofu for centuries, an amount of time exceeding most of his peers.", Path.ERUDITION, Element.LIGHTNING);
    public static final Character SEELE = new Character("Seele", 5, "A spirited and valiant key member of Wildfire who grew up in the perilous Underworld of Belobog. She is accustomed to being on her own.", Path.HUNT, Element.QUANTUM);
    public static final Character TRAILBLAZERD = new Character("Trailblazer", 5, "A (boy/girl), (Trailblazer), decides to travel with the Astral Express to eliminate the threat of the Stellaron.", Path.DESTRUCTION, Element.PHYSICAL);
    public static final Character TRAILBLAZERP = new Character("Trailblazer", 5, "A (boy/girl), (Trailblazer), decides to travel with the Astral Express to eliminate the threat of the Stellaron.", Path.PRESERVATION, Element.FIRE);
    public static final Character WELT = new Character("Welt", 5, "An animator by trade, Welt is a seasoned member of the Astral Express Crew and the former sovereign of Anti-Entropy who has saved Earth from annihilation time and time again. He inherited the name of the world, \"Welt.\"", Path.NIHILITY, Element.IMAGINARY);
    public static final Character YANQING = new Character("Yanqing", 5, "The youngest lieutenant of the Xianzhou Alliance's Cloud Knights on board the Xianzhou Luofu, and General Jing Yuan's retainer. A swordsman gifted with the art of swordplay and war who has a prodigious interest in swords and always collects them from the Artisanship Commission.", Path.HUNT, Element.ICE);

    public static final Character ARLAN = new Character("Arlan", 4, "He is the head of Herta Space Station's security department, often seen with a dog named Peppy.", Path.DESTRUCTION, Element.LIGHTNING);
    public static final Character ASTA = new Character("Asta", 4, "She is the inquisitive lead astronomer responsible for handling the Herta Space Station's affairs, including managing the staff and responding to the Intelligentsia Guild.", Path.HARMONY, Element.FIRE);
    public static final Character DANHENG = new Character("Dan Heng", 4, "The cold and reserved train guard and archivist of the Astral Express. Wielding a spear named Cloud-Piercer, he joined the Express crew to escape his secluded past.", Path.HUNT, Element.WIND);
    public static final Character HERTA = new Character("Herta", 4, "A puppet of Herta, Member #83 of the Genius Society and master of the eponymous Herta Space Station, modeled after her younger self.", Path.ERUDITION, Element.ICE);
    public static final Character HOOK = new Character("Hook", 4, "The self-proclaimed boss of The Moles adventure squad and Fersman's adopted daughter. She views life as an opportunity for freedom and countless adventures.", Path.DESTRUCTION, Element.FIRE);
    public static final Character MARCH7TH = new Character("March 7th", 4, "An enthusiastic girl who was saved from eternal ice by the Astral Express Crew, and has the unique ability of being able to use \"Six-Phased Ice.\" When she awoke, she knew nothing of herself or her past, and decided to name herself after the date of her rebirth, \"March 7th.\"", Path.PRESERVATION, Element.ICE);
    public static final Character NATASHA = new Character("Natasha", 4, "Fastidious and kind, she is one of the few doctors from the Underworld where medical resources are scarce. It is later revealed that Natasha is the true leader of Wildfire, with Oleg as her acting leader.", Path.ABUNDANCE, Element.PHYSICAL);
    public static final Character PELA = new Character("Pela", 4, "The meticulous Intelligence Officer of the Silvermane Guards. While young, she is undeniably brilliant. Whether it relates to maneuvering troops, distributing supplies, or the terrain, Pela can answer any problems with calm certainty.", Path.NIHILITY, Element.ICE);
    public static final Character QINGQUE = new Character("Qingque", 4, "An average Diviner of the Divination Commission on the Xianzhou Luofu, and a librarian. She never slacks off when it comes to slacking off and is about to be demoted to a \"door guardian.\"", Path.ERUDITION, Element.QUANTUM);
    public static final Character SAMPO = new Character("Sampo", 4, "A silver-tongued salesman. Where there is profit to be made, you can be sure Sampo is nearby.", Path.NIHILITY, Element.WIND);
    public static final Character SERVAL = new Character("Serval", 4, "The free and rebellious eldest daughter of the Landau family, once a close friend of Cocolia, her interests has now led her to become a mechanic.", Path.ERUDITION, Element.LIGHTNING);
    public static final Character SUSHANG = new Character("Sushang", 4, "A naive and enthusiastic newcomer to the Cloud Knights who wields a greatsword. She yearns for the historic legends of the Cloud Knights, and is eager to become such a legendary figure herself.", Path.HUNT, Element.PHYSICAL);
    public static final Character TINGYUN = new Character("Tingyun", 4, "A foxian working in the Sky-Faring Commission of the Xianzhou Luofu, she is the Amicassador of the Whistling Flames merchant guild.", Path.HARMONY, Element.LIGHTNING);

    public static final Weapon ADVERSARIAL = new Weapon("Adversarial", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.HUNT);
    public static final Weapon AMBER = new Weapon("Amber", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.PRESERVATION);
    public static final Weapon ARROWS = new Weapon("Arrows", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.HUNT);
    public static final Weapon CHORUS = new Weapon("Chorus", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.HARMONY);
    public static final Weapon COLLAPSINGSKY = new Weapon("Collapsing Sky", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.DESTRUCTION);
    public static final Weapon CORNUCOPIA = new Weapon("Cornucopia", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.ABUNDANCE);
    public static final Weapon DARTINGARROW = new Weapon("Darting Arrow", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.HUNT);
    public static final Weapon DATABANK = new Weapon("Data Bank", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.ERUDITION);
    public static final Weapon DEFENSE = new Weapon("Defense", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.PRESERVATION);
    public static final Weapon FINEFRUIT = new Weapon("Fine Fruit", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.ABUNDANCE);
    public static final Weapon HIDDENSHADOW = new Weapon("Hidden Shadow", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.NIHILITY);
    public static final Weapon LOOP = new Weapon("Loop", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.NIHILITY);
    public static final Weapon MEDIATATION = new Weapon("Mediation", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.HARMONY);
    public static final Weapon MESHINGCOGS = new Weapon("Meshing Cogs", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.HARMONY);
    public static final Weapon MULTIPLICATION = new Weapon("Multiplication", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.ABUNDANCE);
    public static final Weapon MUTUALDEMISE = new Weapon("Mutual Demise", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.DESTRUCTION);
    public static final Weapon PASSKEY = new Weapon("Passkey", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.ERUDITION);
    public static final Weapon PIONEERING = new Weapon("Pioneering", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.PRESERVATION);
    public static final Weapon SAGACITY = new Weapon("Sagacity", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.ERUDITION);
    public static final Weapon SHATTEREDHOME = new Weapon("Shattered Home", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.DESTRUCTION);
    public static final Weapon VOID = new Weapon("Void", 3, "A drop of strength condensed from time itself. All the seemingly insignificant moments come together to form the magnificent choir of fate.", Path.NIHILITY);

    public static final Weapon ASECRETVOW = new Weapon("A Secret Vow", 4, "", Path.DESTRUCTION);
    public static final Weapon CARVETHEMOONWEAVETHECLOUDS = new Weapon("Carve the Moon, Weave the Clouds", 4, "", Path.HARMONY);
    public static final Weapon DANCEDANCEDANCE = new Weapon("Dance! Dance! Dance", 4, "", Path.HARMONY);
    public static final Weapon DAYONEOFMYNEWLIFE = new Weapon("Day One of My New Life", 4, "", Path.PRESERVATION);
    public static final Weapon EYESOFTHEPREY = new Weapon("Eyes of the Prey", 4, "", Path.NIHILITY);
    public static final Weapon FERMATA = new Weapon("Fermata", 4, "", Path.NIHILITY);
    public static final Weapon GENIUSESREPOSE = new Weapon("Geniuses' Repose", 4, "", Path.ERUDITION);
    public static final Weapon GOODNIGHTANDSLEEPWELL = new Weapon("Good Night and Sleep Well", 4, "", Path.NIHILITY);
    public static final Weapon LANDAUSCHOICE = new Weapon("Landau's Choice", 4, "", Path.PRESERVATION);
    public static final Weapon MAKETHEWORLDCLAMOR = new Weapon("Make the World Clamor", 4, "", Path.ERUDITION);
    public static final Weapon MEMORIESOFTHEPAST = new Weapon("Memories of the Past", 4, "", Path.HARMONY);
    public static final Weapon NOWHERETORUN = new Weapon("Nowhere to Run", 4, "", Path.DESTRUCTION);
    public static final Weapon ONLYSILENCEREMAINS = new Weapon("Only Silence Remains", 4, "", Path.NIHILITY);
    public static final Weapon PASTANDFUTURE = new Weapon("Past and Future", 4, "", Path.HARMONY);
    public static final Weapon PERFECTTIMING = new Weapon("Perfect Timing", 4, "", Path.ABUNDANCE);
    public static final Weapon PLANETARYRENDEZVOUS = new Weapon("Planetary Rendezvous", 4, "", Path.HARMONY);
    public static final Weapon POSTOPCONVERSATION = new Weapon("Post-Op Conversation", 4, "", Path.ABUNDANCE);
    public static final Weapon QUIDPROQUO = new Weapon("Quid Pro Quo", 4, "", Path.ABUNDANCE);
    public static final Weapon RESOLUTIONSHINESASPEARLSOFSWEAT = new Weapon("Resolution Shines As Pearls of Sweat", 4, "", Path.NIHILITY);
    public static final Weapon RETURNTODARKNESS = new Weapon("Return to Darkness", 4, "", Path.HUNT);
    public static final Weapon RIVERFLOWSINSPRING = new Weapon("River Flows in Spring", 4, "", Path.HUNT);
    public static final Weapon SHAREDFEELING = new Weapon("Shared Feeling", 4, "", Path.ABUNDANCE);
    public static final Weapon SUBSCRIBEFORMORE = new Weapon("Subscribe for More!", 4, "", Path.HUNT);
    public static final Weapon SWORDPLAY = new Weapon("Swordplay", 4, "", Path.HUNT);
    public static final Weapon THEBIRTHOFTHESELF = new Weapon("The Birth of the Self", 4, "", Path.ERUDITION);
    public static final Weapon THEMOLESWELCOMEYOU = new Weapon("The Moles Welcomes You", 4, "", Path.DESTRUCTION);
    public static final Weapon THESERIOUSNESSOFBREAKFAST = new Weapon("The Seriousness of Breakfast", 4, "", Path.ERUDITION);
    public static final Weapon THISISME = new Weapon("This is Me!", 4, "", Path.PRESERVATION);
    public static final Weapon TODAYISANOTHERPEACEFULDAY = new Weapon("Today Is Another Peaceful Day", 4, "", Path.ERUDITION);
    public static final Weapon TRENDOFTHEUNIVERSALMARKET = new Weapon("Trend of the Universal Market", 4, "", Path.PRESERVATION);
    public static final Weapon UNDERTHEBLUESKY = new Weapon("Under the Blue SKy", 4, "", Path.DESTRUCTION);
    public static final Weapon WARMTHSHORTENSCOLDNIGHTS = new Weapon("Warmth Shortens Cold Nights", 4, "", Path.ABUNDANCE);
    public static final Weapon WEAREWILDFIRE = new Weapon("We Are Wildfire", 4, "", Path.PRESERVATION);
    public static final Weapon WEWILLMEETAGAIN = new Weapon("We Will Meet Again", 4, "", Path.NIHILITY);
    public static final Weapon WOOFWALKTIME = new Weapon("Woof! Walk Time!", 4, "", Path.DESTRUCTION);

    public static final Weapon BEFOREDAWN = new Weapon("Before Dawn", 5, "", Path.ERUDITION);
    public static final Weapon BUTTHEBATTLEISNTOVER = new Weapon("But the Battle Isn't Over", 5, "", Path.HARMONY);
    public static final Weapon CRUISINGINTHESTELLARSEA = new Weapon("Cruising in the Stellar Sea", 5, "", Path.HUNT);
    public static final Weapon INTHENAMEOFTHEWORLD = new Weapon("In the Name of the World", 5, "", Path.NIHILITY);
    public static final Weapon INTHENIGHT = new Weapon("In the Night", 5, "", Path.HUNT);
    public static final Weapon MOMENTOFVICTORY = new Weapon("Moment of Victory", 5, "", Path.PRESERVATION);
    public static final Weapon NIGHTONTHEMILKYWAY = new Weapon("Night on the Milky Way", 5, "", Path.ERUDITION);
    public static final Weapon ONTHEFALLOFANAEON = new Weapon("On the Fall of an Aeon", 5, "", Path.DESTRUCTION);
    public static final Weapon SLEEPLIKETHEDEAD = new Weapon("Sleep Like the Dead", 5, "", Path.HUNT);
    public static final Weapon SOMETHINGIRREPLACEABLE = new Weapon("Something Irreplaceable", 5, "", Path.DESTRUCTION);
    public static final Weapon TEXTUREOFMEMORIES = new Weapon("Texture of Memories", 5, "", Path.PRESERVATION);
    public static final Weapon TIMEWAITSFORNOONE = new Weapon("Time Waits for No One", 5, "", Path.ABUNDANCE);

    public static final List<Character> STANDARDFIVESTARCHARACTERS = List.of(BRONYA, CLARA, GEPARD, BAILU, HIMEKO, WELT, YANQING);
    public static final List<Weapon> STANDARDFIVESTARWEAPONS = List.of(BUTTHEBATTLEISNTOVER, INTHENAMEOFTHEWORLD, MOMENTOFVICTORY, NIGHTONTHEMILKYWAY, SLEEPLIKETHEDEAD, SOMETHINGIRREPLACEABLE, TIMEWAITSFORNOONE);
    public static final List<Character> STANDARDFOURSTARCHARACTERS = List.of(ARLAN, ASTA, DANHENG, HERTA, HOOK, MARCH7TH, NATASHA, PELA, QINGQUE, SAMPO, SERVAL, SUSHANG, TINGYUN);
    public static final List<Weapon> STANDARDFOURSTARWEAPONS = List.of(ASECRETVOW, DANCEDANCEDANCE, DAYONEOFMYNEWLIFE, EYESOFTHEPREY, FERMATA, GENIUSESREPOSE, GOODNIGHTANDSLEEPWELL, LANDAUSCHOICE, MAKETHEWORLDCLAMOR, MEMORIESOFTHEPAST, ONLYSILENCEREMAINS, PASTANDFUTURE, PERFECTTIMING, PLANETARYRENDEZVOUS, POSTOPCONVERSATION, QUIDPROQUO, RESOLUTIONSHINESASPEARLSOFSWEAT, RIVERFLOWSINSPRING, SHAREDFEELING, SUBSCRIBEFORMORE, SWORDPLAY, THEBIRTHOFTHESELF, THEMOLESWELCOMEYOU, THESERIOUSNESSOFBREAKFAST, TRENDOFTHEUNIVERSALMARKET, UNDERTHEBLUESKY, WEAREWILDFIRE, WOOFWALKTIME);
    public static final List<Weapon> STANDARDTHREESTARWEAPONS = List.of(ADVERSARIAL, AMBER, ARROWS, CHORUS, COLLAPSINGSKY, CORNUCOPIA, DARTINGARROW, DATABANK, DEFENSE, FINEFRUIT, HIDDENSHADOW, LOOP, MEDIATATION, MESHINGCOGS, MULTIPLICATION, MUTUALDEMISE, PASSKEY, PIONEERING, SAGACITY, SHATTEREDHOME, VOID);
    
    public static List<Character> getAllCharacters(){
        return List.of(BAILU, BRONYA, CLARA, GEPARD, HIMEKO, JINGYUAN, SEELE, TRAILBLAZERD, TRAILBLAZERP, WELT, YANQING, ARLAN, ASTA, DANHENG, HERTA, HOOK, MARCH7TH, NATASHA, PELA, QINGQUE, SAMPO, SERVAL, SUSHANG, TINGYUN);
    }

    public static List<Weapon> getAllWeapons(){
        return List.of(ADVERSARIAL, AMBER, ARROWS, CHORUS, COLLAPSINGSKY, CORNUCOPIA, DARTINGARROW, DATABANK, DEFENSE, FINEFRUIT, HIDDENSHADOW, LOOP, MEDIATATION, MESHINGCOGS, MULTIPLICATION, MUTUALDEMISE, PASSKEY, PIONEERING, SAGACITY, SHATTEREDHOME, VOID, ASECRETVOW, CARVETHEMOONWEAVETHECLOUDS, DANCEDANCEDANCE, DAYONEOFMYNEWLIFE, EYESOFTHEPREY, FERMATA, GENIUSESREPOSE, GOODNIGHTANDSLEEPWELL, LANDAUSCHOICE, MAKETHEWORLDCLAMOR, MEMORIESOFTHEPAST, NOWHERETORUN, ONLYSILENCEREMAINS, PASTANDFUTURE, PERFECTTIMING, PLANETARYRENDEZVOUS, POSTOPCONVERSATION, QUIDPROQUO, RESOLUTIONSHINESASPEARLSOFSWEAT, RETURNTODARKNESS, RIVERFLOWSINSPRING, SHAREDFEELING, SUBSCRIBEFORMORE, SWORDPLAY, THEBIRTHOFTHESELF, THEMOLESWELCOMEYOU, THESERIOUSNESSOFBREAKFAST, THISISME, TODAYISANOTHERPEACEFULDAY, TRENDOFTHEUNIVERSALMARKET, UNDERTHEBLUESKY, WARMTHSHORTENSCOLDNIGHTS, WEAREWILDFIRE, WEWILLMEETAGAIN, WOOFWALKTIME, BEFOREDAWN, BUTTHEBATTLEISNTOVER, CRUISINGINTHESTELLARSEA, INTHENAMEOFTHEWORLD, INTHENIGHT, MOMENTOFVICTORY, NIGHTONTHEMILKYWAY, ONTHEFALLOFANAEON, SLEEPLIKETHEDEAD, SOMETHINGIRREPLACEABLE, TEXTUREOFMEMORIES, TIMEWAITSFORNOONE);
    }

    public static <T extends GachaItem> List<T> filterByRarity(List<T> items, int rarity){
        return items.stream().filter(c -> c.getRarity() == rarity).collect(Collectors.toList());
    }

    public static <T extends HasElement> List<T> filterByElement(List<T> characters, Element filter){
        return characters.stream().filter(c -> c.getElement() == filter).collect(Collectors.toList());
    }

    public static <T extends HasPath> List<T> filterByPath(List<T> items, Path filter){
        return items.stream().filter(c -> c.getPath() == filter).collect(Collectors.toList());
    }

    protected  Map<String, Banner> banners = new LinkedHashMap<>();

    public void registerBanner(String bannerName, Banner banner){
        banners.putIfAbsent(bannerName, banner);
    }

    public Banner getBanner(String bannerName){
        return banners.get(bannerName);
    }

    public Set<String> getAllBannerNames(){
        return banners.keySet();
    }

    public Collection<Banner> getAllBanners(){
        return banners.values();
    }

    public int getBannerCount(){
        return banners.size();
    }
}