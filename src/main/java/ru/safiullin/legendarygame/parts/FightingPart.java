package ru.safiullin.legendarygame.parts;


import ru.safiullin.legendarygame.Main;
import ru.safiullin.legendarygame.characters.Character;
import ru.safiullin.legendarygame.npc.Npc;

public class FightingPart {
    private int characterCounter = 0;
    private int npcCounter = 0;
    private Character player;
    private Npc npc;

    public FightingPart(int npcCounter, int characterCounter, Character player, Npc npc) {
        this.npcCounter = npcCounter;
        this.characterCounter = characterCounter;
        this.player = player;
        this.npc = npc;
    }

    public FightingPart() {
    }

    public Character getPlayer() {
        return player;
    }

    public int getCharacterCounter() {
        return characterCounter;
    }

    public Npc getNpc() {
        return npc;
    }

    public int getNpcCounter() {
        return npcCounter;
    }

    public void setNpc(Npc npc) {
        this.npc = npc;
    }

    public void setCharacterCounter(int characterCounter) {
        this.characterCounter = characterCounter;
    }

    public void setNpcCounter(int npcCounter) {
        this.npcCounter = npcCounter;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public void action() {
        while (true) {
            player.hit(npc);
            if (npc.getHp() <= 0) {
                System.out.println("Противник повержен!");
                characterCounter++;
                break;
            }
            npc.hit(player);
            if (player.getHp() <= 0) {
                System.out.println("Вы погибли");
                npcCounter++;
                return;
            }
            System.out.println("Ваше здоровье: " + player.getHp() + " Здоровье противника: " + npc.getHp());
        }
        System.out.println(player.getHp());
    }

    public void usingItem() {
        System.out.println("Выберите предмет который хотите использовать перед битвой (Введите индекс ячейки с предметом");
        System.out.println("Ничего не использовать: нажмите 0");
        int x = Main.readingInt();
        switch (x) {
            case 0:
                return;
            case 1:
                player.useItem(0);
            case 2:
                player.useItem(1);
            case 3:
                player.useItem(2);
            case 4:
                player.useItem(3);
            case 5:
                player.useItem(4);
            case 6:
                player.useItem(5);
        }
    }

}
