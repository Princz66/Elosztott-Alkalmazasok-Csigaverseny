import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A verseny hamarosan kezdődik!");
        System.out.println("Fogadj egy csigára (piros, zöld, kék):");
        String userBet = scanner.nextLine().toLowerCase();

        Race race = new Race(userBet);
        race.start();
    }
}
/*
Princz Dominik Z4E211
*/