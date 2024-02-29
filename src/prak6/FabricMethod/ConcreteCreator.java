package prak6.FabricMethod;

public class ConcreteCreator extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProduct();
    }

    void anOperation() {
        Product product = factoryMethod();
        product.anOperation();
    }
}
