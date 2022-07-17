import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1);
        for (int x : list) {
            if (x > 0 && x % 2 ==0) {
                list1.add(x);
            }
        }
        Collections.sort(list1);
        System.out.println(list1);
    }
}
