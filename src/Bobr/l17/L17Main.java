package Bobr.l17;

import Bobr.l17.animal.*;
import Bobr.l17.people.*;
import Bobr.l17.transport.*;


public class L17Main {

    public static void main (String[] args) {
        Cat kisa = new Cat("Kisa", 3);
        System.out.println(kisa);

        Cow mura = new Cow("Mura", 100);
        System.out.println(mura);

        Dog bobik = new Dog("Bobik", 13);
        System.out.println(bobik);

        Man karl = new Man("Karl", 33);
        System.out.println(karl);

        Woman margo = new Woman("Margo", 24);
        System.out.println(margo);

        Bike bmw = new Bike("BMW", 333);
        System.out.println(bmw);

        Bus mers = new Bus("Mers", 60);
        System.out.println(mers);

        Car vw = new Car("VW", 300);
        System.out.println(vw);
    }
}
