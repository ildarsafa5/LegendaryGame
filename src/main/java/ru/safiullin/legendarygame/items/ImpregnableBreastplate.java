package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class ImpregnableBreastplate extends Item implements Itemreference{
    public ImpregnableBreastplate(Character character) {
        super("ImpregnableBreastplate",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setArmor(character.getArmor()+30);
    }
}
