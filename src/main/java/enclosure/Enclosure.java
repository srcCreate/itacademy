package enclosure;

public abstract class Enclosure {
    private final String name;

    public Enclosure(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
