package org.example;

public class ColorExample_Enum {
    public static void main(String[] args) {
        enum Color {RED, GREEN, BLUE}

        Color color = Color.RED;

        switch (color) {

            case RED -> System.out.println("The color is red.");
            case GREEN -> System.out.println("The color is green.");
            case BLUE -> System.out.println("The color is blue.");
        }
    }
}
