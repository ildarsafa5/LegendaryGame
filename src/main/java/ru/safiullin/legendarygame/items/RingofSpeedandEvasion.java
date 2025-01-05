package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class RingofSpeedandEvasion extends Item implements Itemreference{
    public RingofSpeedandEvasion(Character character) {
        super("RingofSpeedandEvasion",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setDexterity(character.getDexterity()+15);
        character.setArmor(character.getArmor()+10);
    }
}
