package ru.safiullin.legendarygame.characters;

import ru.safiullin.legendarygame.items.Itemreference;
import ru.safiullin.legendarygame.npc.Npc;

public class Character {
    private int money;
    protected String name;
    private int hp;
    private int damage;
    private int armor;
    private int dexterity;
    protected int damagesecurity = damage;
    public Itemreference[] items = new Itemreference[6];

    public Character() {
    }

    public Character(int money,int hp, int damage, int dexterity,int armor) {
        this.hp = hp;
        this.damage = damage;
        this.money = money;
        this.dexterity = dexterity;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public int getDamagesecurity() {
        return damagesecurity;
    }

    public void setDamagesecurity(int damagesecurity) {
        this.damagesecurity = damagesecurity;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setItems(Itemreference item,int index) {
        this.items[index] = item;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public Itemreference getItems(int index) {
        return items[index];
    }

    public void useItem(int index) {
        if (items[index].getName().contains("Healingselve")) {
            items[index].effect();
        }
        if (items[index].getName().contains("Crystalys")) {
            items[index].effect();
        }
        if (items[index].getName().contains("Butterfly")) {
            items[index].effect();
        }
        if (items[index].getName().contains("SecretApple")) {
            items[index].effect();
        }
        if (items[index].getName().contains("GoldRune")) {
            items[index].effect();
        }
        if (items[index].getName().contains("AmuletofLifeForce")) {
            items[index].effect();
        }
        if (items[index].getName().contains("BeltofEarthsMight")) {
            items[index].effect();
        }
        if (items[index].getName().contains("BootsofSpeed")) {
            items[index].effect();
        }
        if (items[index].getName().contains("DragonsHeart")) {
            items[index].effect();
        }
        if (items[index].getName().contains("ElixirofUnpredictability")) {
            items[index].effect();
        }
        if (items[index].getName().contains("ImpregnableBreastplate")) {
            items[index].effect();
        }
        if (items[index].getName().contains("PantsofSwiftness")) {
            items[index].effect();
        }
        if (items[index].getName().contains("RingofSpeedandEvasion")) {
            items[index].effect();
        }
        if (items[index].getName().contains("ShadowDancersGloves")) {
            items[index].effect();
        }
        if (items[index].getName().contains("WarriorDefenderSet")) {
            items[index].effect();
        }
    }

    public void ability1(Npc npc) {
    }

    public void ability2() {
    }

    public void hit(Npc npc) {
        npc.setHp(npc.getHp()-(this.damage-npc.getArmor()));
    }

    public String toString() {
        return "Деньги: " + money + " Здоровье: " + hp + " Урон: " + damage + " Ловкость: " + dexterity + " Броня: " + armor;
    }
}