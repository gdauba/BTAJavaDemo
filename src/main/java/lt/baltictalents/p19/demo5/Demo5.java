package lt.baltictalents.p19.demo5;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {

    public static void main(String... args) {

        try {
            int a = calc(10, 0);
            System.out.println(a);

            List<Integer> b = new ArrayList<>();
            System.out.println(get(b, 1));

        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Aritmetinė klaida: " + e.getLocalizedMessage());

        } finally {
            System.out.println("bet šiaip tai viskas gerai :)");
        }

    }

    static int calc(int a, int b) {
        if (b == 0) throw new ArithmeticException("Galima dalyba iš nulio");

        return a / b;
    }

    static Integer get(List<Integer> list, int index) {
        return list.get(index);
    }
}
