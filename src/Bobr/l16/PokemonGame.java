package Bobr.l16;

class Pokemon {

    String name;

    int hp;

    int attack;

    int defence;

    int specialAttack;

    int specialDefense;
    int speed;

    public void fight() {
    System.out.println(name + " дерётся...");
    }

    public void sleep() {
        System.out.println(name + " спит...");
    }

    // конструктор
    Pokemon (String name, int hp, int attack, int defence, int specialAttack, int specialDefense, int speed) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

}

public class PokemonGame {
    public static void main (String [] args) {
        Pokemon Pikacu = new Pokemon("Pikacu", 100, 30, 20, 60, 40, 50);
        Pokemon Bulbasavr = new Pokemon("Bulbasavr", 140, 20, 40, 40, 60, 30);

        // Бой!
        System.out.println("Бой начался!");
        Pikacu.fight();
        Bulbasavr.fight();
        System.out.println();

        //Сон!
        System.out.println("Покемоны устали и уснули!");
        Pikacu.sleep();
        Bulbasavr.sleep();
        System.out.println();
    }
}
