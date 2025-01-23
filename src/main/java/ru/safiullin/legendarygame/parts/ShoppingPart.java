package ru.safiullin.legendarygame.parts;


import ru.safiullin.legendarygame.characters.Character;
import ru.safiullin.legendarygame.Main;
import ru.safiullin.legendarygame.characters.CharacterActivity;
import ru.safiullin.legendarygame.items.Itemreference;

public class ShoppingPart {
    CharacterActivity player;

    public ShoppingPart() {
    }

    public ShoppingPart(CharacterActivity player) {
        this.player = player;
    }

    public CharacterActivity getPlayer() {
        return player;
    }

    public void setPlayer(CharacterActivity player) {
        this.player = player;
    }

    public void buyingItems(Itemreference item1, Itemreference item2, Itemreference item3) {
        System.out.println("! НОВАЯ ЛОКАЦИЯ !");
        System.out.println("Приветствую! В моей лавке вы найдёте редкие товары и уникальное снаряжение. Посмотрите, что вас заинтересует!");
        System.out.println("Введите номер предмета, который хотели бы приобрести");
        System.out.println(item1.getName());
        System.out.println(item2.getName());
        System.out.println(item3.getName());
        int x = Main.readingInt();
        System.out.println("Введите ячейку, в которую хотите положить предмет");
        int y = Main.readingInt();
        switch (x) {
            case 1: player.setItems(item1,y-1);
                    player.setMoney(player.getMoney()-item1.getCost());
                    return;
            case 2: player.setItems(item2,y-1);
                    player.setMoney(player.getMoney()-item2.getCost());
                    return;
            case 3: player.setItems(item3,y-1);
                    player.setMoney(player.getMoney()-item3.getCost());
                    return;
        }
    }
}
