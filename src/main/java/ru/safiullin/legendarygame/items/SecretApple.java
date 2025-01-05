package ru.safiullin.legendarygame.items;

import java.util.Random;

public class SecretApple extends Item implements Itemreference{

    public SecretApple() {
        super("SecretApple");
    }
    public int effect(int hp) {
        Random random= new Random(3);
        int x = random.nextInt();
        switch (x){
            case 1: return effect1(hp);
            case 2: return effect2(hp);
            case 3: return effect3(hp);
        };
        return 0;
    }

    public int effect1(int hp) {
        return hp+600;
    }
    public int effect2(int hp) {
        return hp-100;
    }

    public int effect3(int hp) {
        return hp-300;
    }
}
