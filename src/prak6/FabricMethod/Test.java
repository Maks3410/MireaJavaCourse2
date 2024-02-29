package prak6.FabricMethod;

public class Test {
    public static void main(String[] args) {
        // Используем конкретного создателя для создания продукта
        Creator creator = new ConcreteCreator();
        creator.anOperation();
    }

}

