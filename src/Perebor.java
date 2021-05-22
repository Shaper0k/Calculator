public enum Perebor {
    ARABIC,
    ROMAN
}
class Number {

    private int value;
    private Perebor type;

    Number(int value, Perebor type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    Perebor getType() {
        return type;
    }
}