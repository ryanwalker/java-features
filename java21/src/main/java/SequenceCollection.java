import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SequencedMap;
import java.util.SortedSet;
import java.util.TreeSet;

void main() {

  System.out.println("""
      Motivation for Sequenced collections
      * Absence of a universal supertype for collections with a defined encounter order 
      * Lack of uniform methods for accessing first and last elements, and iterating in reverse order.
      """);

}

// Non-unoform Collections API
void listOperations() {
  List<String> list = Arrays.asList("one", "two", "three");

  list.get(0);
  list.get(list.size() - 1);
}

void sortedSetOperations() {
  SortedSet<String> sortedSet = new TreeSet<>();
  sortedSet.add("uno");
  sortedSet.add("dos");

  sortedSet.getFirst();
  sortedSet.getLast();
}

void sequencedCollection() {
  List<String> sequencedCollection = new ArrayList<>();

  sequencedCollection.addFirst("one");
  sequencedCollection.addLast("two");

  sequencedCollection.reversed();

  sequencedCollection.getFirst();
  sequencedCollection.getLast();

  sequencedCollection.removeFirst();
  sequencedCollection.removeLast();
}

void sequencedSet() {
  // Same methods as SequencedCollection
}

void sequencedMap() {
  SequencedMap<String, String> sequencedMap = new LinkedHashMap<>();

  sequencedMap.putFirst("hello", "there");
  sequencedMap.putLast("Goodbye", "Now");

  sequencedMap.firstEntry();
  sequencedMap.lastEntry();
  sequencedMap.pollFirstEntry();
  sequencedMap.pollLastEntry();

  sequencedMap.reversed();
  sequencedMap.sequencedKeySet();
  sequencedMap.sequencedValues();
  sequencedMap.sequencedEntrySet();

}




