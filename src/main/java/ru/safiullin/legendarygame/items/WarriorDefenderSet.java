package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class WarriorDefenderSet extends Item implements Itemreference{
    public WarriorDefenderSet(Character character) {
        super("WarriorDefenderSet",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setDexterity(character.getDexterity()+5);
        character.setHp(character.getHp()+100);
        character.setArmor(character.getArmor()+20);
    }
}
