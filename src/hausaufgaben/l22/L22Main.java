package hausaufgaben.l22;

import hausaufgaben.l22.animal.*;
import hausaufgaben.l22.people.*;
import hausaufgaben.l22.transport.*;


public class L22Main {

    public static void main (String[] args) {
        Cat kisa = new Cat(3,"Kisa", 3);
        Cow mura = new Cow(100,"Mura", 100);
        Dog bobik = new Dog(13,"Bobik", 4);
        Man karl = new Man("Karl", 33);
        Woman margo = new Woman("Margo", 24);
        Bike bmw = new Bike("green","BMW", 333);
        Bus mers = new Bus("red","Mers", 60);
        Car vw = new Car("black", "VW", 300);


        System.out.println(kisa);
        System.out.println(mura);
        System.out.println(bobik);
        System.out.println(karl);
        System.out.println(margo);
        System.out.println(bmw);
        System.out.println(mers);
        System.out.println(vw);

    }
}
