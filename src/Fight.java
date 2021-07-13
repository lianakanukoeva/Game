public class Fight {

    // реализовать функцию с очередью на удар
    // в зависимости от очереди реализовать удар
    public void FightResult(int monsterPower, int monsterLife, int heroPower, int heroLife) {
        boolean turn = true;
        if (turn == true) {

        } else if (turn == false) {

        }
        // жизненная сила одного(кого именно определит очередь) = его жизненная сила - сила удара соперника
    }

    public void attack(Character name, Character enemie, Character att) {
        int att_ = att.hit();

        if(att_ == 0) {
            System.out.println(name.name + " промазал!");
        } else if(att_ != 0) {
            enemie.setLife(name.life -= att_);
            System.out.println(name.getName() + " нанес удар с силой " + att_);
            System.out.println(enemie.getName() + " потерял " + att_ + " очков из жизни.");
        }

        if(name.getLife() <= 0) {
            System.out.println(name.getName() + " проиграл...");
        } else if(enemie.getLife() <= 0) {
            System.out.println(enemie.getName() + " проиграл игру, а " + name.getName() + "забриает привелегии.");
            name.setGold(name.getGold() + enemie.getGold());
            name.setExperience(name.getExperience() + enemie.getExperience());
        }
    }
}
