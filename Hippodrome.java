package CodeGymTasks.Level_21.G_2113_HippodromeGame;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private static List<Horse> horses = new ArrayList<>();

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(horses);

        Horse horse1 = new Horse("Fasty", 3.5, 0.0);
        Horse horse2 = new Horse("Bigy", 3.2, 0.0);
        Horse horse3 = new Horse("Blacky", 3.3, 0.0);
        Horse horse4 = new Horse("Whity", 3.1, 0.0);
        Horse horse5 = new Horse("Beauty", 3.0, 0.0);
        Horse horse6 = new Horse("Strongy", 3.4, 0.0);

        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        horses.add(horse4);
        horses.add(horse5);
        horses.add(horse6);

        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }

    public void print() {
        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = null;
        double distance = 0;
        for (Horse h : horses) {
            if (h.getDistance() > distance) {
                winner = h;
                distance = h.getDistance();
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println(String.format("The winner is %s!", getWinner().getName()));
    }
}
