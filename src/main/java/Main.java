import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Integer> test = new PriorityQueue<>();

        test.add(-2);
        test.add(0);
        test.add(16);
        test.add(-7);
        test.add(-74);
        test.add(4);
        test.add(15);
        test.add(74);

        Integer item = test.poll();
        System.out.println("Pobrany element z koejki to "+ item);
        Integer item1 = test.poll();
        System.out.println("Pobrany kolejny element z koejki to "+ item1);
        while (!test.isEmpty()){
            System.out.println(test.poll());
        }

        System.out.println("///////////////////////////////////////");

        PriorityQueue<String> test1 = new PriorityQueue<>();

        test1.add("Ewa");
        test1.add("Adam");
        test1.add("Piotr");
        test1.add("Marek");
        test1.add("Anna");
        test1.add("Ewa");

        while (!test1.isEmpty()){
            System.out.println(test1.poll());
        }

        System.out.println("//////////////////////////////////////");

        PriorityQueue<Integer> test2 = new PriorityQueue<>(new MyComparatorAscending());

        test2.add(4);
        test2.add(1);
        test2.add(6);
        test2.add(10);
        test2.add(2);

        while (!test2.isEmpty()){
            System.out.println(test2.poll());
        }

        System.out.println("//////////////////////////////////////");

        PriorityQueue<Integer> test3 = new PriorityQueue<>(new MyComparatorDescending());

        test3.add(4);
        test3.add(1);
        test3.add(6);
        test3.add(10);
        test3.add(2);

        while (!test3.isEmpty()){
            System.out.println(test3.poll());
        }
    }
}
