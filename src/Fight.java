public class Fight {

    public void FightResult(Character hero, Character monster) {
        // очередь на удар
        boolean turn = true;

        while(true) {
            if(turn == true) {
                attack(hero, monster);
                turn = false;
                if(attack(hero, monster) == false) {
                    break;
                }
            } else {
                attack(monster, hero);
                turn = true;
                if(attack(monster, hero) == false) {
                    break;
                }
            }
        }
    }

    private boolean attack(Character name, Character enemie) {
        int att_ = name.hit();
        boolean result = true;

        if (att_ == 0) {
            System.out.println(name.getName() + " промазал!");
        } else if (att_ != 0) {
            enemie.setLife(name.life -= att_);
            System.out.println(name.getName() + " нанес удар с силой " + att_);
            System.out.println(enemie.getName() + " потерял " + att_ + " очков из жизни.");
        }

        if (name.getLife() <= 0) {
            System.out.println(name.getName() + " проиграл...");
            result = false;
        } else if (enemie.getLife() <= 0) {
            System.out.println(enemie.getName() + " проиграл игру, а " + name.getName() + "забриает привелегии.");
            name.setGold(name.getGold() + enemie.getGold());
            name.setExperience(name.getExperience() + enemie.getExperience());
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}
