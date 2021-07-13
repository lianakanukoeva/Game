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

        // buy onion
        Trader addLife = new Trader();
        boolean isPotion = false;

        Character monster;
        // let's go
        while (game) {

            // choose monster
            int random = (int) (Math.random() * 10);
            if (random % 2 == 0) {
                monster = goblin;
            } else {
                monster = skelleton;
            }

            System.out.println("Куда пойдем?");
            System.out.println("1. К торговцу\n2. В темный лес\n3. На выход");
            // choose the way
            int way = scan.nextInt();
            switch (way) {
                case 1:
                    System.out.println("Тогда пойдемте к торговцу.");
                    addLife.potion(hero);
                    System.out.println("Оставшиеся деньги после покупки зелья:" + hero.getGold());
                    isPotion = true;
                    break;
                case 2:
                    System.out.println("Сражайтесь, раз уж пошли в темный лес.");
                    fight.FightResult(hero, monster, isPotion);
                    game = false;
                    break;
                case 3:
                    System.out.println("До встречи!");
                    game = false;
                    break;
            }
        }
    }
}
