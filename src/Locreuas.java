import java.util.Scanner;

public class Locreuas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя вашего Героя");

        // hero
        String heroName = scan.nextLine();
        Hero hero = new Hero(heroName, 100, 17, 15, 60, 150);

        // monsters
        Skelleton skelleton = new Skelleton("Скелет", 60, 12, 13, 60, 100);
        Goblin goblin = new Goblin("Гоблин", 80, 15, 14, 100, 150);

        Fight fight = new Fight();
        boolean game = true;

        Character monster;
        // let's go
        while (game) {

            // choose monster
            int random = (int) Math.random();
            if(random % 2 == 0) {
                monster = goblin;
            } else {
                monster = hero;
            }

            // choose the way
            int way = scan.nextInt();
            switch (way) {
                case 1:
                    System.out.println("Тогда пойдемте к торговцу.");
                case 2:
                    System.out.println("Сражайтесь, раз уж пошли в темный лес.");
                    fight.FightResult(hero, monster);
                case 3:
                    System.out.println("До встречи!");
                    game = false;
                    break;
            }
        }
    }
}
