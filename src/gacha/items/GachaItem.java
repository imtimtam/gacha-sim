package gacha.items;

import java.util.Objects;

/**
 * Abstract base class for items in-game, mainly pullable ones.
 * Defines name, rarity, and description commonly found in all items in-game.
 */

public abstract class GachaItem{
    protected final String name;
    protected final int rarity;
    protected final String description;

    public GachaItem(String name, int rarity, String description){
        this.name = name;
        this.rarity = rarity;
        this.description = description;
    }

    public GachaItem(String name, int rarity){
        this.name = name;
        this.rarity = rarity;
        this.description = "";
    }

    public String getName(){
        return this.name;
    }

    public int getRarity(){
        return this.rarity;
    }

    public String getDescription(){
        return this.description;
    }

    public abstract String getType();
    
    public String toString(){
        return getName() + " (" + getRarity() + "*)";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || this.getClass() != obj.getClass()) return false;
        GachaItem other = (GachaItem) obj;
        return rarity == other.rarity && Objects.equals(name, other.name) && Objects.equals(description, other.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rarity, description);
    }
}