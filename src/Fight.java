public class Fight {

    // набыдлокодила :(((
    public void FightResult(Character hero, Character monster, boolean isPotion) {
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // очередь на удар
                boolean turn = true;

                while (true) {
                    if (turn == true) {
                        attack(hero, monster, isPotion);
                        turn = false;
                        if (attack(hero, monster, isPotion) == false) {
                            break;
                        }
                    } else {
                        attack(monster, hero, isPotion);
                        turn = true;
                        if (attack(monster, hero, isPotion) == false) {
                            break;
                        }
                    }
                    try {
                        Thread.sleep(800);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    private boolean attack(Character name, Character enemie, boolean isPotion) {
        int att_ = name.hit();
        boolean result = true;

        if (att_ == 0) {
            System.out.println(name.getName() + " промазал!");
        } else if (att_ != 0) {
            enemie.setLife(name.life -= att_);
            System.out.println(name.getName() + " нанес удар с силой " + att_);
            System.out.println(enemie.getName() + " потерял " + att_ + " очков из жизни.");
        }

        // use pinion
        if (name.getLife() <= 20 && name.getLife() > 0) {
            if (isPotion == true) {
                name.setLife(name.getLife() + 70);
                System.out.println("Зелье деат еще шанс, прибавляет к здоровью 70");
            }
            isPotion = false;
        }

        if (enemie.getLife() <= 0) {
            System.out.println(enemie.getName() + " проиграл игру, а " + name.getName() + " забриает привелегии.");
            name.setGold(name.getGold() + enemie.getGold());
            name.setExperience(name.getExperience() + enemie.getExperience());
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
