package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class AmuletofLifeForce extends Item implements Itemreference{
    public AmuletofLifeForce(Character character) {
        super("AmuletofLifeForce",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setHp(character.getHp()+200);
    }
}
