package FactoryMethod;

public class FactoryMethod {

    // Step 1: Product interface
    interface Product {
        void use();
    }

    // Step 2: Concrete Products
    static class ConcreteProductA implements Product {
        public void use() {
            System.out.println("Using Product A");
        }
    }

    static class ConcreteProductB implements Product {
        public void use() {
            System.out.println("Using Product B");
        }
    }

    // Step 3: Creator (Factory)
    abstract static class Creator {
        abstract Product createProduct();
    }

    // Step 4: Concrete Factories
    static class ConcreteCreatorA extends Creator {
        Product createProduct() {
            return new ConcreteProductA();
        }
    }

    static class ConcreteCreatorB extends Creator {
        Product createProduct() {
            return new ConcreteProductB();
        }
    }

    // Step 5: Test / main method
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.use(); // Output: Using Product A

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.use(); // Output: Using Product B
    }
}
