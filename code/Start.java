
import java.util.Arrays;
import java.util.Comparator;

class Start {
    public static void main(String[] data) {
        Player[] team = { new Player("David B", 7),
                           new Player("Michael O", 10),
                           new Player("Frank L", 8),
                            new Player("David J", 1)};
        Arrays.sort(team, new Comparator(){
            public int compare(Object a, Object b) {
                Player p = (Player)a;
                Player q = (Player)b;
                return p.number() - q.number();
            }
        });
        for(Player p : team) {
            System.out.println( p.name() + " " + p.number());
        }
    }
}

class Show {
    void print(int n) {
        if (n == 0) return;
        print(n-1);
        System.out.println(n);
    }
}

class PlayerComparator implements Comparator {
    public int compare(Object a, Object b) {
        Player p = (Player)a;
        Player q = (Player)b;
        return p.number() - q.number();
    }
}

record Player(String name, int number) { }