import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите 3 числа\n");
        Scanner in = new Scanner(System.in);
        int[] array = new int[3];
        String[] array1 = new String[]{"a", "b", "c"};

        for (int i = 0; i < 3; i++) {
            array[i] = in.nextInt();
        }

        int check = 0;
        for (int i = 0; i < 3; i++) {
            if (array[i] % 5 == 0 || array[i] % 5 == 5) {
                System.out.print( array1[i]+ "=" + array[i] + " ");
                check++;
            }

        }
        if (check == 0) System.out.print("нет значений, кратных 5");

        System.out.print("\nРезультат целочесленного деления a на b: " + array[0]/array[1]);
        float d = (float)array[0]/array[1];
        System.out.print("\nРезультат деления a на b: " + d);
        System.out.print("\nРезультат целочесленного деления a на b: " + array[0]/array[1]);
        System.out.print("\nРезультат деления a на b с округлением в большую сторону: " + (int)Math.ceil(d));
        System.out.print("\nРезультат деления a на b с округлением в меньшую сторону: " + (int)Math.floor(d));
        System.out.print("\nРезультат деления a на b с математическим округлением: " + Math.round(d));
        System.out.print("\nОстаток от деления b на c:" + array[1]%array[2]);
        System.out.print("\nНаименьшее значение из a и b:" + Math.min(array[0], array[1]));
        System.out.print("\nНаименьшее значение из b и c:" + Math.max(array[1], array[2]));
    }
}