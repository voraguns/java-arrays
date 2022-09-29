
import java.util.Arrays;
import java.util.Comparator;

class Start {
    public static void main(String[] data) {
        Player[] team = { new Player("David B", 7),
                           new Player("Michael O", 10),
                           new Player("Frank L", 8)};
        Arrays.sort(team, new PlayerComparator());
        for(Player p : team) {
            System.out.println( p.name());
        }
    }
}

class PlayerComparator implements Comparator {
    public int compare(Object a, Object b) {
        Player p = (Player)a;
        Player q = (Player)b;
        if (p.number() < q.number()) return -1;
        if (p.number() > q.number()) return +1;
        return 0;
    }
}

record Player(String name, int number) { }