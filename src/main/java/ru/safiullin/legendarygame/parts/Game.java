package ru.safiullin.legendarygame.parts;

import ru.safiullin.legendarygame.Main;
import ru.safiullin.legendarygame.characters.CharacterActivity;
import ru.safiullin.legendarygame.characters.Gron;
import ru.safiullin.legendarygame.npc.Npc;
import ru.safiullin.legendarygame.npc.SpidersMother;

public class Game {
    Npc spider = new SpidersMother();
    CharacterActivity player;
    FightingPart part2 = new FightingPart(player,spider);
    ShoppingPart part1 = new ShoppingPart(player);

    public FightingPart getPart2() {
        return part2;
    }

    public ShoppingPart getPart1() {
        return part1;
    }

    public void setPart1(ShoppingPart part1) {
        this.part1 = part1;
    }

    public void setPart2(FightingPart part2) {
        this.part2 = part2;
    }

    public void starting() {
        System.out.println("Приветствуем! Приготовьтесь к невероятным приключениям в The road of the walking! Вперёд!");
        System.out.println("Добро пожаловать, искатель! Мир перед тобой полон опасностей и тайн. Ты прибыл в Запределье теней, где веками бушует война между светом и тьмой. Легендарная Руна Всемудрия, ключ к окончательной победе над тьмой, скрыта где-то в глубинах этого мира. Для того чтобы достичь её, тебе предстоит пройти суровое испытание. Твой путь будет усеян могущественными существами — боссами, каждый из которых охраняет свой фрагмент древней силы. Покоряя их, ты не только получишь ценные награды, но и приблизишься к разгадке тайны Руны Всемудрия. Тебя ждут сложные подземелья, опасные локации и захватывающие сражения. Готовься к трудной, но увлекательной битве за будущее Запределье теней! Удачи тебе, искатель! Твоё путешествие к Руне Всемудрия начинается сейчас.");
    }

    public void addingCharacter() {
        CharacterActivity[] characters = {new Gron()};
        System.out.println("Выбери воина:");
        System.out.println("1.Gron");
        int x = Main.readingInt();
        setPlayer(characters[x]);
        part2.setPlayer(player);
    }


    public CharacterActivity getPlayer() {
        return player;
    }

    public void setPlayer(CharacterActivity player) {
        this.player = player;
    }

    public void showingpart(FightingPart part) {
        part.action();
    }

    public void gameLogic() {

    }
}
