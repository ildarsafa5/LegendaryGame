package ru.safiullin.legendarygame.items;

public class Crystalys extends Item implements Itemreference {

    public Crystalys() {

        super("Crystalys");
    }
    public int effect(int damage) {
        return damage+500;
    }
}
