package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class ShadowDancersGloves extends Item implements Itemreference{
    public ShadowDancersGloves(Character character) {
        super("ShadowDancersGloves",400,null);
        setCharacter(character);
    }
    public void effect() {
        character.setDexterity(character.getDexterity()+10);
    }
}
