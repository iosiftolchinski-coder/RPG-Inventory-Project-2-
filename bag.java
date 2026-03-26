import java.util.*;

public class Bag {
    private int max;
    private ArrayList<Item> items;
    private double maxWeight;

    public Bag(int max, double maxWeight) {
        this.max = max;
        this.maxWeight = weight;
        this.items = new ArrayList<Item>();
    }

    public void open() {
        System.out.println("opened");
    }

    public void carry() {
        System.out.println("carrying");
    }

    public void store(Item item) {
            items.add(item);
            System.out.println("You put an item inside");
        
    }

    public void remove(Item item) {
        if (items.remove(item)) {
            System.out.println(item + " is thrown away");
        }
    }

    public void lookfor(String name) {
                System.out.println(item);
                return;
    }

    public void empty() {
        items.clear();
        System.out.println("empty");
    }

    public void show() {
        System.out.println(items);
    }
}
