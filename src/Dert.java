package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Dert {

  public static void main(String[] args) {

    List<Integer> ints = new ArrayList<>();
    ints.add(1);
    ints.add(2);
    ints.add(3);
    ints.add(2);
    ints.add(4);
    ints.add(4);
    ints.add(4);

    Map<Integer, Long> collect = ints.stream()
        .collect(Collectors.groupingBy(v -> v, Collectors.counting()));
    System.out.println(collect);

  }

}
