package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class Healingselve extends Item implements Itemreference {

    public Healingselve(Character character) {
        super("Healingselve",400,null);
        setCharacter(character);
    }
    public void effect() {
        character.setHp(character.getHp()+300);
    }
}
