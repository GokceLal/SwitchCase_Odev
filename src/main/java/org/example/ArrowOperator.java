package org.example;

import java.util.Scanner;

public class ArrowOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day (Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday)");
        String day = sc.next();
// -> yerine yield de kullanılabilir
        String type = switch (day) {
            case "Monday"-> "Week day";
            case "Tuesday"-> "Week day";
            case "Wednesday"->"Week day";
            case "Thursday"->"Week day";
            case "Friday"->"Week day";
            case "Saturday"-> "Weekend";
            case "Sunday"-> "Weekend";
            default->"Unknown";
        };

        /**
         * String type = switch (day) {
         *                 case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "Week day";
         *                 case "Saturday", "Sunday" -> "Weekend";
         *                 default->"Unknown";
         * };
         * Şeklinde de yazılabilir
         */
    }
}
