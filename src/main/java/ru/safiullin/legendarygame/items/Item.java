package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class Item {
    protected Character character;
    private String name;
    private int cost;

    public Item() {
    }

    public Item(String name, int cost,Character character) {
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public String toString() {
        return name;
    }
}

