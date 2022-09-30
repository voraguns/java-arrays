import java.util.LinkedList;

class Start {
    public static void main(String[] data) {
        
        var list = new LinkedList<Player>();
        
        list.add(new Player("David B", 7));
        list.add(new Player("Michael O", 10));
        list.add(new Player("Frank L", 8));
        list.add(new Player("David J", 1));
        
        list.stream().forEach(p -> System.out.println(p.name()));
        
        // Write code to find the total of number of each player
        var w = list.stream().map(p -> p.number()).reduce(0, (result, p) -> result + p);
        System.out.println(w);
        
        var a = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) a.add(i);
        Integer total = a.stream().reduce(0, (result, value) -> result + value);
        System.out.println(total);
        
        // from the variable a, write chain code to print only even value
        a.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));
        
    }
}

record Player(String name, int number) { }