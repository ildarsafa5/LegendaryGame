package ru.safiullin.legendarygame.items;

public class Healingselve extends Item implements Itemreference {
    private String name;

    public Healingselve() {

        super("Healingselve");
    }
    public int effect(int hp) {
        return hp+300;
    }
}
