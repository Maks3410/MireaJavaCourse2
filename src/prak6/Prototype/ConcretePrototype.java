package prak6.Prototype;

public class ConcretePrototype implements Prototype {
    private String attribute;

    public ConcretePrototype(String attribute) {
        this.attribute = attribute;
    }

    // Метод клонирования
    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.attribute);
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }
}
