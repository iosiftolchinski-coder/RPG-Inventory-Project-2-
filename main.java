import java.util.*;

public class Main {
    public static void main(String[] args) {

        Bag bag = new Bag(5, 20);

        bag.open();
        bag.carry();

        Weapon hammer = new Weapon("hammer", "big axe", 5, 15);
        Food olivie = new food("olivie", "regenerates", 1, 20);
        Gun pistol = new Gun("pistol", "ammo", 1, 3);
        Key key = new Key("goodkey", "opens", 1);

        bag.store(hammer);
        bag.store(olivie);
        bag.store(pistol);
        bag.store(goodkey);

        bag.show();

        sword.use();
        potion.use();
        arrow.use();
        key.use();

        bag.lookfor("olivie");
        bag.remove(olivie);
        bag.show();

        bag.empty();
        bag.show();
    }
}
