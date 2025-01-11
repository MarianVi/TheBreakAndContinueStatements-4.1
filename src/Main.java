import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        boolean numarPozitiv = true;

        while (numarPozitiv) {
            int numar = scanner.nextInt();
            int reverse = 0;
            if (numar < 0) {
                break;
            }
            while (numar != 0) {
                reverse = (reverse * 10) + (numar % 10);
                numar /= 10;
            }
            if (reverse % 10 == 3 || reverse % 10 == 7 || reverse % 10 == 9) {
                continue;
            }
            System.out.println(reverse);
        }
    }
}