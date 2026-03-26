import java.util.*;

public class Bag {
    private int max;
    private ArrayList<Item> items;
    private double maxWeight;

    public Bag(int max, double maxWeight) {
        this.max = max;
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }

    public void open() {
        System.out.println("opened");
    }

    public void carry() {
        System.out.println("carrying");
    }

    public void store(Item item) {
        if (items.size() >= max) {
            System.out.println("can't put in, no space");
            return;
        }

        items.add(item);
        System.out.println(item + " is putted inside");
    }

    public void remove(Item item) {
        if (items.remove(item)) {
            System.out.println(item + " is thrown away");
        }
    }

    public void lookfor(String name) {
        for (Item item : items) {
            if (item.toString().equalsIgnoreCase(name)) {
                System.out.println("item);
                return;
            }
        }
        System.out.println("nothing");
    }

    public void empty() {
        items.clear();
        System.out.println("empty");
    }

    public void show() {
        System.out.println(items);
    }
}
