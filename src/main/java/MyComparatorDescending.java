import java.util.Comparator;

public class MyComparatorDescending implements Comparator<Integer> {
    @Override
    public int compare(Integer x, Integer y) {

        if (x==y) return 0;
        else if (x<y) return 1;
        else return -1;

    }
}
