import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AthleteTests {

    public static void main(String[] args) {

        List<Athlete> athletes = new ArrayList<>(8);
        athletes.add(new Athlete("Jack Nicklaus", 75, 595));
        athletes.add(new Athlete("Lindsey Vonn", 82, 395));
        athletes.add(new Athlete("Mikaela Shiffrin", 82, 232));
        athletes.add(new Athlete("Novak Djokovic", 92, 280));
        athletes.add(new Athlete("Rafael Nadal", 92, 304));
        athletes.add(new Athlete("Caroline Ahumada", 5, 5));
        athletes.add(new Athlete("Roger Federer", 103, 367));
        athletes.add(new Athlete("Serena Williams", 73, 240));
        athletes.add(new Athlete("Erica Hicks", 14, 15));
        athletes.add(new Athlete("Tiger Woods", 82, 395));

        System.out.println("********************************");
        System.out.println("Listing athletes before sorting:");
        System.out.println("********************************");
        int rank = 1;
        for (Athlete a : athletes) {
            System.out.println(rank + ": " + a);
            rank++;
        }

        Collections.sort(athletes, Comparator.reverseOrder());

        System.out.println("*****************************************************************");
        System.out.println("Listing athletes in descending order according to win/loss ratio:");
        System.out.println("*****************************************************************");
        rank = 1;
        for (Athlete a : athletes) {
            System.out.println(rank + ": " + a);
            rank++;
        }

    }

}
