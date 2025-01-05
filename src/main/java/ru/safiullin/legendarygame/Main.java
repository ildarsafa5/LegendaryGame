package ru.safiullin.legendarygame;

import ru.safiullin.legendarygame.characters.Character;
import ru.safiullin.legendarygame.items.Butterfly;
import ru.safiullin.legendarygame.items.Crystalys;
import ru.safiullin.legendarygame.items.Healingselve;
import ru.safiullin.legendarygame.npc.Npc;
import ru.safiullin.legendarygame.parts.AdventurePart;
import ru.safiullin.legendarygame.parts.FightingPart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character player = new Character(0,1000,100,50);
        Npc npc = new Npc(600,100,50);
        FightingPart part1 = new FightingPart(0,0,player,npc);
        AdventurePart part2 = new AdventurePart(player);
        part2.buyingItems(new Healingselve(),new Butterfly(),new Crystalys());
        System.out.println(player.getItems(0));
        part1.action();
        System.out.println(player);
        System.out.println();
    }

    public static int readingInt() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }

    public static String readingString() {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        return x;
    }

}
