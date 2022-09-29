import java.util.LinkedList;

class Start {
    public static void main(String[] data) {
        
        var list = new LinkedList<Player>();
        
        list.add(new Player("David B", 7));
        list.add(new Player("Michael O", 10));
        list.add(new Player("Frank L", 8));
        list.add(new Player("David J", 1));
        
        var a = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) a.add(i);
        Integer total = a.stream().reduce(0, (result, value) -> result + value);
        System.out.println(total);
    }
}

record Player(String name, int number) { }