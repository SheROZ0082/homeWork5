public class Hero {
    private int helth;
    private int damage;
    private String superPuwer;

    public int getHelth() {
        return helth;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPuwer() {
        return superPuwer;
    }

    public Hero(int helth, int damage, String superPuwer) {
        this.helth = helth;
        this.damage = damage;
        this.superPuwer = superPuwer;
    }

    public Hero(int helth, int damage) {
        this.helth = helth;
        this.damage = damage;
    }
}