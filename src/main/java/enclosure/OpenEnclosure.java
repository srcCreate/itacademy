package enclosure;

public class OpenEnclosure extends Enclosure {
    protected OpenEnclosure(String name) {
        super(name);
    }

    public OpenEnclosure() {
        this("открытый вольер");
    }
}
