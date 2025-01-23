package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

import java.util.Random;

public class ElixirofUnpredictability extends Item implements Itemreference{
    public ElixirofUnpredictability(Character character) {
        super("ElixirofUnpredictability",400,null);
        setCharacter(character);
    }

    public void effect() {
        Random random = new Random();
        int random1 = random.nextInt(8);
        switch (random1) {
            case 1: character.setDexterity(character.getDexterity()+20);
            return;
            case 2: character.setDexterity(character.getDexterity()-20);
            return;
            case 3: character.setHp(character.getHp()+20);
            return;
            case 4: character.setHp(character.getHp()-20);
            return;
            case 5: character.setDamage(character.getDamage()+20);
            return;
            case 6: character.setDamage(character.getDamage()-20);
            return;
            case 7: character.setArmor(character.getArmor()+20);
            return;
            case 8: character.setArmor(character.getArmor()-20);
            return;
        }

    }
}
