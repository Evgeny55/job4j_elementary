package ru.job4j.condition;

public class MultipleSwitchWeek {
    public int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday1" -> 1;
            case "Вторник", "Monday2" -> 2;
            case "Среда", "Monday3" -> 3;
            case "Четвверг", "Monday4" -> 4;
            case "Пятница", "Monday5" -> 5;
            case "Суббота", "Monday6" -> 6;
            case "Воскресенья", "Monday7" -> 7;
            default -> -4;
        };
    }
}
