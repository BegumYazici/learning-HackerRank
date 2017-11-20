package HackerRankExamples.JavaTutorial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaComparator {

    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Player[] players = new Player[n];
        Checker checker = new Checker();

        for(int i=0; i<n ; i++){
            players[i] = new Player(scanner.nextInt(),scanner.next());
        }
        scanner.close();

        Arrays.sort(players,checker);

        for(int i = 0; i < players.length; i++){
            System.out.printf("%s %s\n", players[i].name, players[i].score);
        }
    }

    class Player{

        int score;
        String name;

        public Player(int score, String name) {
            this.score = score;
            this.name = name;
        }
    }

    class Checker implements Comparator<Player>{

        public int compare(Player a, Player b) {
            if(a.score == b.score){
                // Order alphabetically by name
                return a.name.compareTo(b.name);
            }

            return ((Integer) b.score).compareTo(a.score);
        }
    }
}
