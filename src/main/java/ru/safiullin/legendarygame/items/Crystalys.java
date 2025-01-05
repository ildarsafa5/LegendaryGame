package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class Crystalys extends Item implements Itemreference {

    public Crystalys(Character character) {
        super("Crystalys",900,null);
        setCharacter(character);
    }
    public void effect() {
        character.setDamage(character.getDamage()+200);
    }
}
