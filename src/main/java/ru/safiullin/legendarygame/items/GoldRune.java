package ru.safiullin.legendarygame.items;

public class GoldRune extends Item implements Itemreference{
    public int effect(int money) {
        return money+200;
    }
}

