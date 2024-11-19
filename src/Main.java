public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.Кувалда);
        Boss boss = new Boss(500, 100, bossWeapon);
        boss.printInfo();

        Weapon skeletonWeapon1 = new Weapon(WeaponType.Лук);
        Skeleton skeleton1 = new Skeleton(120, 20, skeletonWeapon1, 30);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.Арбалет);
        Skeleton skeleton2 = new Skeleton(120, 40, skeletonWeapon2, 15);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}
