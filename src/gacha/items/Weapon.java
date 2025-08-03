package gacha.items;

import gacha.Path;

public class Weapon extends GachaItem implements HasPath{
    protected final Path path;
    
    public Weapon(String name, int rarity, String description, Path path){
        super(name, rarity, description);
        this.path = path;
    }

    @Override
    public Path getPath(){
        return this.path;
    }

    @Override
    public Type getType(){
        return Type.LIGHTCONE;
    }

    @Override
    public String toString(){
        return getName() + " (" + getRarity() + "*)" + " (" + getPath() + ")";
    }
}