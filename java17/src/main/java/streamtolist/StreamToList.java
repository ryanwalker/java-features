package streamtolist;

import java.util.List;
import java.util.stream.Collectors;

public class StreamToList {

  public void square(List<Integer> ints) {

    List<Integer> old = ints.stream()
        .map(i -> i * i)
        // IDEA suggesting to change it
        .collect(Collectors.toList());

    List<Integer> nuevo = ints.stream()
        .map(i -> i * i)
        // Returns an unmodifiable List
        .toList();

  }
}
