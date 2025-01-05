package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

import java.util.Random;

public class SecretApple extends Item implements Itemreference{

    public SecretApple(Character character) {
        super("SecretApple",600,null);
        setCharacter(character);
    }
    public void effect() {
        Random random= new Random(3);
        int x = random.nextInt();
        switch (x){
            case 1:  effect1();
            case 2:  effect2();
            case 3:  effect3();
        };
    }

    public void effect1() {
        character.setHp(character.getHp()+600);
    }
    public void effect2() {
        character.setHp(character.getHp()-100);
    }

    public void effect3() {
        character.setHp(character.getHp()-300);
    }
}
