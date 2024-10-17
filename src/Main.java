import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int variably = 45;
        System.out.println(variably);
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int var2 = scanner.nextInt();
        System.out.println(variably + var2);

    }
}