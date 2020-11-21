package animals;

public enum AnimalType {
    UNGULATA("Копытное"),
    FEATHERY("Пернатое"),
    WATERFOWL("Водоплавающие"),
    RETILES("Рептилия");

    String typeName;

    AnimalType(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return typeName;
    }
}
