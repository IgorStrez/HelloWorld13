package Bobr.l35;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        List<Bobr> bobrList = new ArrayList<>();
        bobrList.add( new Bobr("Богдан", 3,6));
        bobrList.add( new Bobr("Барабан", 1,8));
        bobrList.add( new Bobr("Дундук", 13,4));

        System.out.println("Исходный список:");
        printBobrList(bobrList);

        // Сортировка с использованием Comparable
        Collections.sort(bobrList);
        System.out.println("\nСписок после сортировки с использованием Comparable:");
        printBobrList(bobrList);


        // Сортировка с использованием Comparator по количеству родственников
        Collections.sort(bobrList, new RelativesCountComparator());
        System.out.println("\nСписок после сортировки с использованием RelativesCountComparator:");
        printBobrList(bobrList);

        // Сортировка с использованием лямбда-выражений
        // Collections.sort(bobrList, (bobr1, bobr2) -> Integer.compare(bobr1.getAge(), bobr2.getAge()));
        Collections.sort(bobrList, Comparator.comparingInt(Bobr::getAge));
        System.out.println("\nСписок после сортировки с использованием лямбда-выражений:");
        printBobrList(bobrList);


        // Формирование Map
        Map<String, Integer> bobrMap = new HashMap<>();
        for (Bobr bobr : bobrList) {
            bobrMap.put(bobr.getName(), bobr.getRelativesCount());
        }

        // Вывод Map
        System.out.println("\nMap с данными:");
        for (Map.Entry<String, Integer> entry : bobrMap.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", Количество родственников: " + entry.getValue());
        }
    }

    private static void printBobrList(List<Bobr> bobrList) {
        for (Bobr bobr : bobrList) {
            System.out.println("Имя: " + bobr.getName() + ", Возраст: " + bobr.getAge() + ", Число родни: " + bobr.getRelativesCount());
        }
    }
}
