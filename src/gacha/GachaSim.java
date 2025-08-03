package gacha;
import java.util.*;

import gacha.banner.StandardBanner;
import gacha.banner.Banner;
import gacha.banner.BannerType;
import gacha.banner.LimitedCharacterBanner;
import gacha.banner.LimitedWeaponBanner;

public class GachaSim {
    private final User user;
    private final GachaRegistry registry;
    Scanner scanner = new Scanner(System.in);

    public GachaSim(){
        this.user = new User(null, 19940);
        this.registry = new GachaRegistry();
        preloadBanners();
    }

    // Creates and registers concurrent banners with featured characters and weapons as expected in a patch.
    private void preloadBanners(){
        Banner characterBanner = new LimitedCharacterBanner(user, "Butterfly on Swordtip", BannerType.CHARACTER_EVENT, List.of(GachaRegistry.SEELE), List.of(GachaRegistry.NATASHA, GachaRegistry.HOOK, GachaRegistry.PELA));
        Banner weaponBanner = new LimitedWeaponBanner(user, "Brilliant Fixation", BannerType.LIGHT_CONE_EVENT, List.of(GachaRegistry.INTHENIGHT), List.of(GachaRegistry.THEMOLESWELCOMEYOU, GachaRegistry.GOODNIGHTANDSLEEPWELL, GachaRegistry.POSTOPCONVERSATION));
        Banner standardBanner = new StandardBanner(user, "Stellar Warp", BannerType.STANDARD);

        registry.registerBanner(characterBanner.getBannerName(), characterBanner);
        registry.registerBanner(weaponBanner.getBannerName(), weaponBanner);
        registry.registerBanner(standardBanner.getBannerName(), standardBanner);
    }

    public void runSimulation(){
        while(true){
            runMenu();
        }
    }

    private void runMenu(){
        printSeparator();
        displayMenu();
        int choice = getUserInput(1, 3);

        switch(choice){
            case 1:
                printSeparator();
                displayBanners();
                int bannerChoice = getUserInput(1, registry.getBannerCount());
                String bannerName = new ArrayList<>(registry.getAllBannerNames()).get(bannerChoice - 1);
                runWarp(registry.getBanner(bannerName));
                break;
            case 2:
                printSeparator();
                user.getInventory().displayAll();
                break;
            case 3:
                printSeparator();
                System.out.println("Simulation ended.");
                scanner.close();
                System.exit(0);
                break;
        }
    }

    private void runWarp(Banner banner){
        while(true){
            printSeparator();
            displayWarpMenu();
            int choice = getUserInput(1, 4);

            switch(choice){
                case 1:
                    printSeparator();
                    System.out.println("You pulled:");
                    System.out.println(banner.pullOnce());
                    break;
                case 2:
                    printSeparator();
                    System.out.println("You pulled:");
                    for(int i = 0; i < 10; i++){
                        System.out.println(banner.pullOnce());
                    }
                    break;
                case 3:
                    printSeparator();
                    user.displayPullHistory(banner.getBannerName(), registry);
                    break;
                case 4:
                    return;
            }
            System.out.println();
        }
    }

    private void displayMenu(){
        System.out.println("Honkai: Star Rail Warp Simulator");
        System.out.println("1. Warp");
        System.out.println("2. Show Inventory");
        System.out.println("3. Log out");
    }

    private void displayBanners(){
        List<String> bannerNames = new ArrayList<>(registry.getAllBannerNames());
        for(int i = 0; i < bannerNames.size(); i++){
            String bannerName = bannerNames.get(i);
            Banner banner = registry.getBanner(bannerName);

            System.out.println((i + 1) + ". " + banner.getBannerType() + " - " + bannerName);
        }
    }

    private void displayWarpMenu(){
        System.out.println("1. Warp x1");
        System.out.println("2. Warp x10");
        System.out.println("3. Show Pull History");
        System.out.println("4. Return");
    }

    private int getUserInput(int min, int max){
        while(true){
            try{
                System.out.print("Select a number: ");
                int input = Integer.parseInt(scanner.nextLine());
                System.out.println();
                if(min <= input && input <= max) return input;
                else{
                    printSeparator();
                    System.out.println("Invalid. Enter a number between " + min + "-" + max + ".");
                }
            } catch (NumberFormatException e){
                printSeparator();
                System.out.println("Invalid. Enter a valid number.");
            }
        }
    }

    private void printSeparator(){
        System.out.println("--------------------------------");
    }
}