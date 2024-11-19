public class Weapon {
    private WeaponType type;
    private String name;

    public Weapon(WeaponType type) {
        this.type = type;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

}

