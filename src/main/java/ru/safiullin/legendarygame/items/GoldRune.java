package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class GoldRune extends Item implements Itemreference{
    public GoldRune(Character character) {
        String name = "GoldRune";
        setCharacter(character);
    }
    public void effect() {
        character.setMoney(character.getMoney()+200);
    }
}

