import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Race {
    private List<Snail> snails;
    private static final int ROUNDS = 5;
    private String userBet;

    public Race(String userBet) {
        this.userBet = userBet;
        snails = new ArrayList<>();
        snails.add(new Snail("piros"));
        snails.add(new Snail("zöld"));
        snails.add(new Snail("kék"));
    }

    public void start() {
        Random random = new Random();
        for (int i = 1; i <= ROUNDS; i++) {
            System.out.println("Kör " + i);
            for (Snail snail : snails) {
                boolean hasBoost = random.nextDouble() < 0.2; 
                snail.race(hasBoost);
                System.out.println(snail.getColor() + " csiga távolsága: " + snail.getDistance());
            }
            System.out.println();
        }
        determineWinner();
    }

    private void determineWinner() {
        Snail winner = snails.stream().max((s1, s2) -> Integer.compare(s1.getDistance(), s2.getDistance())).orElse(null);
        if (winner != null) {
            System.out.println("A győztes csiga színe: " + winner.getColor());
            if (winner.getColor().equals(userBet)) {
                System.out.println("Gratulálok, helyesen tippeltél!");
            } else {
                System.out.println("Sajnos nem a csigád nyert.");
            }
        }
    }
}
