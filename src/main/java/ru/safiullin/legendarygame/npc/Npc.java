package ru.safiullin.legendarygame.npc;

import ru.safiullin.legendarygame.characters.Character;

import java.util.Random;

public class Npc {
    private int hp;
    private int damage;
    private int armor;
    private int armorsecurity=armor;

    public Npc() {
    }

    public Npc(int hp, int damage, int armor) {
        this.hp = hp;
        this.damage = damage;
        this.armor = armor;
    }

    public int getArmorsecurity() {
        return armorsecurity;
    }

    public void setArmorsecurity(int armorsecurity) {
        this.armorsecurity = armorsecurity;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void hit(Character character) {
        Random random = new Random();
        int random1 = random.nextInt(100);
        if (random1 > character.getDexterity()) {
            character.setHp(character.getHp()-(this.damage-character.getArmor()));
        } else {
            return;
        }
    }


}
