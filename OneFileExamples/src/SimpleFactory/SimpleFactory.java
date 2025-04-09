package SimpleFactory;

public class SimpleFactory {


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

        // Step 3: Simple Factory
        class SimpleFactoryExample {
            public Product createProduct(String type) {
                if ("A".equalsIgnoreCase(type)) {
                    return new ConcreteProductA();
                } else if ("B".equalsIgnoreCase(type)) {
                    return new ConcreteProductB();
                } else {
                    throw new IllegalArgumentException("Unknown product type: " + type);
                }
            }
        }

        // Step 4: Test / main method
        public void main(String[] args) {
            SimpleFactoryExample simpleFactory = new SimpleFactoryExample();
            Product productA = simpleFactory.createProduct("A");
            productA.use(); // Output: Using Product A

            Product productB = simpleFactory.createProduct("B");
            productB.use(); // Output: Using Product B
        }


}
