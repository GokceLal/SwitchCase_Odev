package org.example;

public class Pattern_Matching {
    public static void main(String[] args) {
        /**
         * instanceOf -> bir objenin hangi sınıfa ait olduğunu boolean bir
         * değer döndürerek kontrol eder.
         */
        Object o = 8;
        double result;
        if (o instanceof Integer) {
            result = ((Integer) o).doubleValue();
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();
        } else if (o instanceof String) {
            result = Double.parseDouble(((String) o));
        } else {
            result = 0;
        }
        System.out.println(result);
    }
}
