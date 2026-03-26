import java.util.*;

abstract class Item {
    protected String name;
    protected String description;
    protected double weight;
    protected boolean usable;
    protected String type;

    public Item(String name, String description, double weight, boolean usable, String type) {
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.use = use;
        this.type = type;
    }

    public abstract void use();

    public void stats() {
        System.out.println(name);
        System.out.println(description);
        System.out.println(weight);
        System.out.println(type);
    }

    public void drop() {
        System.out.println("dropped");
    }

    public String toString() {
        return name;
    }
}

class Weapon extends Item {
    private int damage;

    public Weapon(String name, String description, double weight, int damage) {
        super(name, description, weight, true, "weapon");
        this.damage = damage;
    }

    public void use() {
        System.out.println("used" + name + " to give " + damage + " pain");
    }
}

class Food extends Item {
    private int nutrients;

    public Food(String name, String description, double weight, int nutrients) {
        super(name, description, weight, true, "food");
        this.nutrients = nutrients;
    }

    public void use() {
        System.out.println("You used " + name + " and gained " + nutrients + " health!");
    }
}

class Gun extends Item {
    private int amnt;

    public Gun(String name, String description, double weight, int amnt) {
        super(name, description, weight, true, "Gun");
        this.amnt = amnt;
    }

    public void use() {
        if (amnt > 0) {
            System.out.println("used " + name + "; now you are left with " + amnt + ", aaahaahahah");
        } else {
            System.out.println("you wasted all of your " + name + ", aaahahaah");
        }
    }
}

class Key extends Item {
    public Key(String name, String description, double weight) {
        super(name, description, weight, false, "key");
    }

    public void use() {
        System.out.println("can't use " + name);
    }
}
