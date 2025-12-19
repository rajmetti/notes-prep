package src;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {

  public static void main(String[] args) {
    String input = "STACK";
    String collect = IntStream.rangeClosed(1, input.length())
        .map(i -> input.charAt(input.length() - i))
        .mapToObj(Character::toString)
        .collect(Collectors.joining());
    System.out.println(collect);
  }

}
