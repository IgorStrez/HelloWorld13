package hausaufgaben.l23;

import hausaufgaben.l23.animal.*;



public class L23Main {

    public static void main (String[] args) {
        Cat kisa = new Cat(3,"Kisa", 3, "black");
        Cow mura = new Cow(100,"Mura", 100,70);
        Dog bobik = new Dog(13,"Bobik", 4, "dvornaga");

        System.out.println(kisa);
        System.out.println(mura);
        System.out.println(bobik);

    }
}
