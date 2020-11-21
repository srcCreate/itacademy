package enclosure;

public class Aquarium extends Enclosure{
    protected Aquarium(String name) {
        super(name);
    }

    public Aquarium() {
        this("аквариум");
    }
}
