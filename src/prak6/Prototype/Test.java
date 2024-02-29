package prak6.Prototype;

public class Test {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Original Attribute");

        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println("Original Attribute: " + original.getAttribute());
        System.out.println("Clone Attribute: " + clone.getAttribute());

        original.setAttribute("Modified Attribute");
        System.out.println("Original Attribute After Modification: " + original.getAttribute());
        System.out.println("Clone Attribute After Modification of Original: " + clone.getAttribute());
    }
}
