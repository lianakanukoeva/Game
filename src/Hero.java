public class Hero extends Character {
    public Hero(String name, int life, int power, int dexterity, int experience, int gold) {
        super(name, life, power, dexterity, experience, gold);
    }

    // в main сделать реализацию метода, где при вызове функции с зельем теряются деньги
    // но если зелье было куплено (нужна переменная булеан), то приумножать силу в случае если она меньше 10 или другого числа
}
