package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class BeltofEarthsMight extends Item implements Itemreference{
    public BeltofEarthsMight(Character character) {
        super("BeltofEarthsMight",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setDamage(character.getDamage()+15);
    }
}
