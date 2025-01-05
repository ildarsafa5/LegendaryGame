package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class BootsofSpeed extends Item implements Itemreference{
    public BootsofSpeed(Character character) {
        super("BootsofSpeed",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setDexterity(character.getDexterity()+15);
    }
}
