import java.util.LinkedList;

class Start {
    public static void main(String[] data) {
        
        var list = new LinkedList<Player>();
        
        list.add(new Player("David B", 7));
        list.add(new Player("Michael O", 10));
        list.add(new Player("Frank L", 8));
        list.add(new Player("David J", 1));
        
        // ถามทีละตัว
        var result = list.stream()
                .filter(x -> x.number() >= 8)
                .toList();
        System.out.println(list);
        System.out.println(result);
        
        var a = new LinkedList<Integer>();
        for (int i = 0; i < 40000000; i++) a.add(i);
        long start = System.currentTimeMillis();
        long stop = System.currentTimeMillis();
        // write code to fillter only value that can divide by 785
        
        // ทำงานตาม CPU
//        var b = a.parallelStream()
//                .filter(x -> x % 785 == 0)
//                .toList();
//        System.out.println(b);
        System.out.println(start - stop);
    }
}

record Player(String name, int number) { }