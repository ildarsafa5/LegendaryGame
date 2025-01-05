package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class PantsofSwiftness extends Item implements Itemreference{
    public PantsofSwiftness(Character character) {
        super("PantsofSwiftness",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setDexterity(character.getDexterity()+20);
        character.setArmor(character.getArmor()-10);
    }
}
