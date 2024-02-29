package prak6.AbstractFactoryPackage;

public class Test {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA1 = factory1.createProductA();
        AbstractProductB productB1 = factory1.createProductB();

        productA1.operation();
        productB1.operation();

        AbstractFactory factory2 = new ConcreteFactory2();
        AbstractProductA productA2 = factory2.createProductA();
        AbstractProductB productB2 = factory2.createProductB();

        productA2.operation();
        productB2.operation();
    }
}
