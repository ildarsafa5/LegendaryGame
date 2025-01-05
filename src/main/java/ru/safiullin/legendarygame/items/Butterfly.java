package ru.safiullin.legendarygame.items;

public class Butterfly extends Item implements Itemreference{

    public Butterfly() {

        super("Butterfly");
    }
    public int effect(int stamina) {
        return stamina+200;
    }
}
