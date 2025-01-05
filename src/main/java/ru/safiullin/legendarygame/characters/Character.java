package ru.safiullin.legendarygame.characters;

import ru.safiullin.legendarygame.items.Itemreference;
import ru.safiullin.legendarygame.npc.Npc;

public class Character {
    private int money;
    private int hp;
    private int damage;
    private int armor;
    private int dexterity;
    public Itemreference[] items = new Itemreference[6];

    public Character() {
    }

    public Character(int money,int hp, int damage, int dexterity) {
        this.hp = hp;
        this.damage = damage;
        this.money = money;
        this.dexterity = dexterity;
    }

    public int getHp() {
        return hp;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getMoney() {
        return money;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setItems(Itemreference[] items) {
        this.items = items;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public Itemreference[] getItems() {
        return items;
    }

    public void useItem(int index) {
        if (items[index].getName().contains("Healingselve")) {
            hp = items[index].effect(hp);
        }
        if (items[index].getName().contains("Crystalys")) {
            damage = items[index].effect(damage);
        }
        if (items[index].getName().contains("Butterfly")) {
            dexterity = items[index].effect(dexterity);
        }
        if (items[index].getName().contains("SecretApple")) {
            hp = items[index].effect(hp);
        }
        if (items[index].getName().contains("GoldRune")) {
            money = items[index].effect(money);
        }
    }

    public void hit(Npc npc) {
        npc.setHp(npc.getHp()-(this.damage-npc.getArmor()));
    }

    public String toString() {
        return "Деньги: " + money + " Здоровье: " + hp + " Урон: " + damage + " Ловкость: " + dexterity + " Броня: " + armor;
    }
}