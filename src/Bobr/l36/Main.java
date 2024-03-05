package Bobr.l36;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаем список бобров
        List<Bobr> bobrList = new ArrayList<>();
        bobrList.add(new Bobr("Богдан", 3, 6));
        bobrList.add(new Bobr("Барабан", 1, 8));
        bobrList.add(new Bobr("Дундук", 13, 4));

        // Кладём (или Ложим) в мешок двух бобров
        Set<Bobr> meshok = new HashSet<>();
        meshok.add(new Bobr("Богдан", 3, 6));
        meshok.add(new Bobr("Дундук", 13, 4));

        // Итерируемся по списку бобров и смотрим, есть ли каждый бобр в мешке
        for (Bobr bobr : bobrList) {
            if (meshok.contains(bobr)) {
                System.out.println(bobr.getName() + " есть в мешке!");
            } else {
                System.out.println(bobr.getName() + " нет в мешке!");
            }
        }
    }
}