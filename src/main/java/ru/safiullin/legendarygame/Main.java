package ru.safiullin.legendarygame;

import ru.safiullin.legendarygame.characters.Character;
import ru.safiullin.legendarygame.characters.CharacterActivity;
import ru.safiullin.legendarygame.characters.Gron;
import ru.safiullin.legendarygame.items.*;
import ru.safiullin.legendarygame.parts.Game;
import ru.safiullin.legendarygame.parts.ShoppingPart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        game.starting();
        game.addingCharacter();
        game.showingpart(game.getPart2());
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
