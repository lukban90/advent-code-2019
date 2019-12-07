import java.util.Arrays;
import java.util.Random;

public class DayTwo {

    public static void main(String[] args) {

        int keyValue = 0, noun = 0, verb = 0;
        while (keyValue != 19690720) {

            int x = (int) (Math.random() * 99);
            int y = (int) (Math.random() * 99);

            int[] intcode = { 1, x, y, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 13, 1, 19, 1, 5, 19, 23, 2, 10, 23, 27,
                    1, 27, 5, 31, 2, 9, 31, 35, 1, 35, 5, 39, 2, 6, 39, 43, 1, 43, 5, 47, 2, 47, 10, 51, 2, 51, 6, 55,
                    1, 5, 55, 59, 2, 10, 59, 63, 1, 63, 6, 67, 2, 67, 6, 71, 1, 71, 5, 75, 1, 13, 75, 79, 1, 6, 79, 83,
                    2, 83, 13, 87, 1, 87, 6, 91, 1, 10, 91, 95, 1, 95, 9, 99, 2, 99, 13, 103, 1, 103, 6, 107, 2, 107, 6,
                    111, 1, 111, 2, 115, 1, 115, 13, 0, 99, 2, 0, 14, 0 };

            int i = 0;
            while (intcode[i] != 99 && i < intcode.length) {

                if (intcode[i] == 1) {

                    int value = intcode[intcode[i + 1]] + intcode[intcode[i + 2]];
                    intcode[intcode[i + 3]] = value;

                }

                else if (intcode[i] == 2) {

                    int value = intcode[intcode[i + 1]] * intcode[intcode[i + 2]];
                    intcode[intcode[i + 3]] = value;
                }

                i += 4;
                keyValue = intcode[0];
            }
            noun = x;
            verb = y;
        }
        System.out.println("Result: " + (100 * noun + verb));
    }
}