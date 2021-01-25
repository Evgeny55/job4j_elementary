package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean false = (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
        return false;
    }

    public void whenExist() {
        boolean result = Triangle.exist(2.0, 2.0, 2.0);
        assertThat(result, is(true));
    }
}
