package ru.safiullin.legendarygame;

import ru.safiullin.legendarygame.characters.Character;
import ru.safiullin.legendarygame.npc.Npc;
import ru.safiullin.legendarygame.parts.FightingPart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Character player = new Character(0,1000,100,50);
        Npc npc = new Npc(600,100,50);
        FightingPart part1 = new FightingPart(0,0,player,npc);
        part1.action();
        System.out.println(player);
        System.out.println();
        player.useItem(readingInt());
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

//    System.out.println("Всем привет");
//    System.out.print("\033[H\033[J");
//    System.out.println("сосите хуй");
}
