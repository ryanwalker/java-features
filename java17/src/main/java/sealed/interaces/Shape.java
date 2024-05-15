package sealed.interaces;

// Pretty much the same as sealed classes
public interface Shape {}

record Octagon(int i) implements Shape {}
