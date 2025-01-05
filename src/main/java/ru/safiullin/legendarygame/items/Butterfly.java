package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class Butterfly extends Item implements Itemreference{

    public Butterfly(Character character) {
        super("Butterfly",1200,null);
        setCharacter(character);
    }
    public void effect() {
        character.setDexterity(character.getDexterity()+200);
    }
}
