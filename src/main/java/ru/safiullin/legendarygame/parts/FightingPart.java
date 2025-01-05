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
                break;
            }
            npc.hit(player);
            if (player.getHp() <= 0) {
                System.out.println("Вы погибли");
                return;
            }
            System.out.println("Ваше здоровье: " + player.getHp() + " Здоровье противника: " + npc.getHp());
        }
        System.out.println(player.getHp());
    }


}
