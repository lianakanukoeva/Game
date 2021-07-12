abstract public class Character {
    String name;
    int life, power, dexterity, experience, gold;
    public Character(String name, int life, int power, int dexterity, int experience, int gold) {
        this.name = name;
        this.life = life;
        this.power = power;
        this.dexterity = dexterity;
        this.experience = experience;
        this.gold = gold;
    }

    public int hit(){
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public int getPower() {
        return power;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }
}
