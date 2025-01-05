package ru.safiullin.legendarygame.items;

import ru.safiullin.legendarygame.characters.Character;

public class DragonsHeart extends Item implements Itemreference{
    public DragonsHeart(Character character) {
        super("DragonsHeart",400,null);
        setCharacter(character);
    }

    public void effect() {
        character.setHp(character.getHp()+150);
        character.setDamage(character.getDamage()+10);
    }
}
