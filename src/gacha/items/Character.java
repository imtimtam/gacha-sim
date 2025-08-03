package gacha.items;

import gacha.Element;
import gacha.Path;

public class Character extends GachaItem implements HasElement, HasPath{
    protected final Path path;
    protected final Element element;
    
    public Character(String name, int rarity, String description, Path path, Element element){
        super(name, rarity, description);
        this.path = path;
        this.element = element;
    }

    @Override
    public Path getPath(){
        return this.path;
    }

    @Override
    public Element getElement(){
        return this.element;
    }

    @Override
    public Type getType(){
        return Type.CHARACTER;
    }

    @Override
    public String toString(){
        return getName() + " (" + getRarity() + "*)" + " (" + getPath() + ")";
    }
}