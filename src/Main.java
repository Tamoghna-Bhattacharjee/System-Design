import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Stream<Integer> stream = Stream.of(5,6,7,8,9,5,10,7);

        List list = stream.filter(x -> !set.add(x)).toList();
        System.out.println(list.toString());
    }
}
