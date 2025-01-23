package ru.safiullin.legendarygame.parts;


import ru.safiullin.legendarygame.Main;
import ru.safiullin.legendarygame.characters.Character;
import ru.safiullin.legendarygame.characters.CharacterActivity;
import ru.safiullin.legendarygame.npc.Npc;

public class FightingPart {
    private int characterCounterForSkill1 = 0;
    private int characterCounterForSkill2 = 0;
    private int reloadingskill1 = 0;
    private int reloadingskill2 = 0;
    private int npcCounter = 0;
    private boolean skill1Activated = false;
    private boolean skill2Activated = false;
    private CharacterActivity player;
    private Npc npc;

    public FightingPart(CharacterActivity player, Npc npc) {
        this.player = player;
        this.npc = npc;
    }

    public FightingPart() {
    }

    public CharacterActivity getPlayer() {
        return player;
    }

    public int getCharacterCounterForSkill1() {
        return characterCounterForSkill1;
    }

    public int getCharacterCounterForSkill2() {
        return characterCounterForSkill2;
    }

    public void setCharacterCounterForSkill2(int characterCounterForSkill2) {
        this.characterCounterForSkill2 = characterCounterForSkill2;
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

    public void setCharacterCounterForSkill1(int characterCounterForSkill1) {
        this.characterCounterForSkill1 = characterCounterForSkill1;
    }

    public void setNpcCounter(int npcCounter) {
        this.npcCounter = npcCounter;
    }

    public void setPlayer(CharacterActivity player) {
        this.player = player;
    }

    public void action() {
        while (true) {
            if (characterCounterForSkill1==2) {
                if (player.getName().contains("Gron")) {
                    npc.setArmor(npc.getArmorsecurity());
                }
                characterCounterForSkill1=0;
                skill1Activated=false;
            }
            if (characterCounterForSkill2==2) {
                if (player.getName().contains("Gron")) {
                    player.setDamage(player.getDamagesecurity());
                }
                characterCounterForSkill2=0;
                skill2Activated=false;
            }
            if (reloadingskill2>0 && reloadingskill1>0) {
                System.out.println("1. Атака");
                int x = Main.readingInt();
                player.hit(npc);
            } else if (reloadingskill1>0) {
                System.out.println("Выберите действие");
                System.out.println("1. Атака");
                System.out.println("2. 2-я способность");
                int x = Main.readingInt();
                switch (x) {
                    case 1: player.hit(npc);
                            break;
                    case 2: player.ability2();
                            reloadingskill2++;
                            skill2Activated = true;
                            break;
                }
            } else if (reloadingskill2 > 0) {
                System.out.println("1. Атака");
                System.out.println("2. 1-я способность");
                int x = Main.readingInt();
                switch (x) {
                    case 1: player.hit(npc);
                            break;
                    case 2: player.ability1(npc);
                            reloadingskill1++;
                            skill1Activated = true;
                            break;
                }
            } else {
                System.out.println("1. Атака");
                System.out.println("2. 1-я способность");
                System.out.println("3. 2-я способность");
                int x = Main.readingInt();
                switch (x) {
                    case 1: player.hit(npc);
                            break;
                    case 2: player.ability1(npc);
                            reloadingskill1++;
                            skill1Activated = true;
                            break;
                    case 3: player.ability2();
                            reloadingskill2++;
                            skill2Activated = true;
                            break;
                }
            }
            if (skill1Activated) {
                characterCounterForSkill1++;
            }

            if (skill2Activated) {
                characterCounterForSkill2++;
            }
            if (npc.getHp() <= 0) {
                System.out.println("Противник повержен!");
                break;
            }
            npc.hit(player);
            if (player.getHp() <= 0) {
                System.out.println("Вы погибли");
                return;
            }
            System.out.println("Ваше здоровье: " + player.getHp() + " Здоровье противника: " + npc.getHp() + " Броня противника: " + npc.getArmor());
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
