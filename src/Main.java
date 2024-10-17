import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "Wiktor";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Podaj swoje imie");
        String imie = scanner.nextLine();
        System.out.println("Twoje imie to " + imie +"a nazwisko to "+  nazwisko );

        System.out.println("To ja " + name + " Sprawdzam co się dzieje u siostry Kacpra");
        System.out.println("Jestem na branch Wiktor");

    }
}