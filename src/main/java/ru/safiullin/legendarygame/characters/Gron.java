package ru.safiullin.legendarygame.characters;

import ru.safiullin.legendarygame.items.Item;
import ru.safiullin.legendarygame.npc.Npc;

public class Gron extends Character implements  CharacterActivity {
    public Gron() {
        super(0,1000,154,7,100);
        name = "Gron";
    }
    @Override
    public void ability1(Npc npc) {
        npc.setArmorsecurity(npc.getArmor());
        npc.setArmor(0);
    }
    @Override
    public void ability2() {
        setDamagesecurity(getDamage());
        setDamage(getDamage()*2);
    }

    @Override
    public Item[] getItems() {
        return new Item[0];
    }

}
