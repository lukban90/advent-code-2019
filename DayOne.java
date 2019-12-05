import java.io.*;

public class DayOne {

    public static void main(String[] args) throws Exception {
        File file = new File("massToFuel.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int result = 0;
        while ((st = br.readLine()) != null) {
            int mass = Integer.parseInt(st);
            int addedFuel = computeMass(mass);
            result += addedFuel;
            // System.out.println(mass + " " + addedFuel);
        }
        System.out.println(result);
    }

    public static int computeMass(int num) {
        int addFuel = 0;
        while (num >= 9) {
            num = num / 3 - 2;
            addFuel += num;
        }
        // System.out.println(addFuel);
        return addFuel;
    }
}