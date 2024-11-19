public class Skeleton extends Boss {
    private int arrowCount;

    public Skeleton(int health, int damage, Weapon weapon, int arrowCount) {
        super(health, damage, weapon);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public void printInfo() {
        System.out.println("Скелет:");
        System.out.println("Здоровье: " + getHealth());
        System.out.println("Урон: " + getDamage());
        System.out.println("Оружие: " + getWeapon().getType());
        System.out.println("Стрел: " + arrowCount);
        System.out.println("--------------");
    }
}
