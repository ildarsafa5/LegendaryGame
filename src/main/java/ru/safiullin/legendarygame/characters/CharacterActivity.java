package ru.safiullin.legendarygame.characters;

import ru.safiullin.legendarygame.items.Item;
import ru.safiullin.legendarygame.items.Itemreference;
import ru.safiullin.legendarygame.npc.Npc;

public interface CharacterActivity {
    public void useItem(int index);
    public void hit(Npc npc);
    public void ability1(Npc npc);
    public void ability2();
    public int getHp();
    public int getDamage();
    public int getDexterity();
    public String getName();
    public int getArmor();
    public int getMoney();
    public Item[] getItems();
    public int getDamagesecurity();
    public void setHp(int x);
    public void setDamage(int x);
    public void setDexterity(int x);
    public void setName(String name);
    public void setArmor(int x);
    public void setMoney(int x);
    public void setItems(Itemreference iten,int index);
    public void setDamagesecurity(int x);
    public String toString();
}
