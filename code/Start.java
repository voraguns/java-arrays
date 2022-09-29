import java.util.LinkedList;

class Start {
    public static void main(String[] data) {
        
        var list = new LinkedList<Player>();
        
        list.add(new Player("David B", 7));
        list.add(new Player("Michael O", 10));
        list.add(new Player("Frank L", 8));
        list.add(new Player("David J", 1));
        
        var result = list.stream().map(x ->  
                new Player(x.name(), x.number() + 3))
                .toList();
        System.out.println(result);
        
        var a = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) a.add(i);
        // Write code to convert by multiple by 2
        var b = a.stream().map(x -> (double)(2 * x)).toList();
        System.out.println(b);
    }
}

record Player(String name, int number) { }