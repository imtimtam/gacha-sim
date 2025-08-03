package gacha;
import java.util.*;

import gacha.items.Character;
import gacha.items.GachaItem;
import gacha.items.Weapon;

public class Inventory{
    // Count map for gacha-able characters and weapons.
    private Map<Character, Integer> characters = new HashMap<>();
    private Map<Weapon, Integer> weapons = new HashMap<>();

    public void addItem(GachaItem i){
        if(i instanceof Character){
            addCharacter((Character) i);
        }
        else{
            addWeapon((Weapon) i);
        }
    }
    
    private void addCharacter(Character c){
        characters.put(c, characters.getOrDefault(c, 0) + 1);
    }

    private void addWeapon(Weapon w){
        weapons.put(w, weapons.getOrDefault(w, 0) + 1);
    }

    public void displayAll(){
        displayCharacters();
        System.out.println();
        displayWeapons();
    }

    public void displayCharacters(){
        List<Character> list = new ArrayList<>(characters.keySet());
        System.out.println("Characters");
        if(list.isEmpty()){
            System.out.println("No characters recorded.");
            return;
        }
        list.sort((a, b) -> b.getRarity() - a.getRarity());
        for(Character c : list){
            System.out.println(c + " : " + characters.get(c));
        }
    }

    public void displayWeapons(){
        List<Weapon> list = new ArrayList<>(weapons.keySet());
        System.out.println("Light Cones");
        if(list.isEmpty()){
            System.out.println("No Light Cones recorded.");
            return;
        }
        list.sort((a, b) -> b.getRarity() - a.getRarity());
        for(Weapon w : list){
            System.out.println(w + " : " + weapons.get(w));
        }
    }
}