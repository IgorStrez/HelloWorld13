package hausaufgaben.l21;

import hausaufgaben.l21.animal.*;
import hausaufgaben.l21.people.*;
import hausaufgaben.l21.transport.*;
import hausaufgaben.l21.trees.*;

import java.util.ArrayList;


public class L21Main {

    public static void main (String[] args) {
        Cat kisa = new Cat("Kisa", 3);
        Cow mura = new Cow("Mura", 100);
        Dog bobik = new Dog("Bobik", 13);
        Man karl = new Man("Karl", 33);
        Woman margo = new Woman("Margo", 24);
        Bike bmw = new Bike("BMW", 333);
        Bus mers = new Bus("Mers", 60);
        Car vw = new Car("VW", 300);
        Beech vasa = new Beech("Vasa", 13);
        Birch lena = new Birch("Lena", 10);
        Oak artem = new Oak("Artem", 17);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("VAZ", 130));
        cars.add(new Car("KAMAZ", 100));
        cars.add(new Car("YAZ", 30));
        cars.add(new Car("OKA", 140));
        cars.add(new Car("AURUS", 300));

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println(kisa);
        System.out.println(mura);
        System.out.println(bobik);
        System.out.println(karl);
        System.out.println(margo);
        System.out.println(bmw);
        System.out.println(mers);
        System.out.println(vw);
        System.out.println(vasa);
        System.out.println(lena);
        System.out.println(artem);
    }
}
