package ru.safiullin.legendarygame;

import ru.safiullin.legendarygame.characters.Character;
import ru.safiullin.legendarygame.items.*;
import ru.safiullin.legendarygame.parts.ShoppingPart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
