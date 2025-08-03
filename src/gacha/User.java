package gacha;
import java.util.*;

import gacha.items.GachaItem;

public class User {
    private String username;
    private int currency;
    private Inventory inventory;
    private final Map<String, LinkedList<GachaItem>> pullHistory;

    public User(String name, int initialCurrency){
        this.username = name;
        this.currency = initialCurrency;
        this.inventory = new Inventory();
        this.pullHistory = new HashMap<>();
    }
    
    public String getUserName(){
        return username;
    }

    public int getCurrency(){
        return currency;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public Map<String, LinkedList<GachaItem>> getPullHistory(){
        return pullHistory;
    }

    // Unused purchase simulator
    public void topUp(){
        currency += 6480;
    }

    public void displayPullHistory(String bannerName, GachaRegistry registry){
        if(!registry.getAllBannerNames().contains(bannerName)){
            System.out.println("Error: Invalid Banner Name");
            return;
        }

        LinkedList<GachaItem> history = pullHistory.get(bannerName);
        if(history == null || history.isEmpty()){
            System.out.println("No pull history recorded.");
            return;
        }

        System.out.println("Pull History for: " + bannerName);
        for(GachaItem item : history){
            System.out.println(item.getType() + "     " + item);
        }
    }
}