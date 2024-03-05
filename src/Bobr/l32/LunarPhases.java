package Bobr.l32;

import java.util.Scanner;

enum LunarPhases {

    NEW_MOON ("\uD83C\uDF11"),
    WAXING_CRESCENT ("\uD83C\uDF12"),
    FIRST_QUARTER ("\uD83C\uDF13"),
    WAXING_GIBBOUS ("\uD83C\uDF14"),
    FULL_MOON ("\uD83C\uDF15"),
    WANING_GIBBOUS ("\uD83C\uDF16"),
    LAST_QUARTER ("\uD83C\uDF17"),
    WANING_CRESCENT ("\uD83C\uDF18");

    private final String description;

    LunarPhases(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

class Main {
    public static void main(String[] args) {
        for (LunarPhases lunarPhases : LunarPhases.values()) {
            System.out.println(lunarPhases + ": " + lunarPhases.getDescription());
        }
    }
}

class Main3 {
    public static void main(String[] args) {
        for (LunarPhases lunarPhases : LunarPhases.values()) {
            System.out.println(lunarPhases + ": " + lunarPhases.getDescription());
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название фазы луны:");
        String lunarPhasesName = scanner.nextLine();
        LunarPhases lunarPhases = LunarPhases.valueOf(lunarPhasesName);

        switch (lunarPhases) {
            case NEW_MOON:
                System.out.println("Прилив");
                break;
            case FULL_MOON:
                System.out.println("Отлив" + lunarPhases.getDescription());
                break;
            default:
                System.out.println("Штиль");
        }
    }
}
