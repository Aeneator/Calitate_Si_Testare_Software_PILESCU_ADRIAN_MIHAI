package AbstractFactory;

public class AbstractFactory {

    // Step 1: Abstract Products
    interface Button {
        void click();
    }

    interface Checkbox {
        void check();
    }

    // Step 2: Concrete Products - Family 1
    static class WindowsButton implements Button {
        public void click() {
            System.out.println("Windows Button clicked");
        }
    }

    static class WindowsCheckbox implements Checkbox {
        public void check() {
            System.out.println("Windows Checkbox checked");
        }
    }

    // Step 3: Concrete Products - Family 2
    static class MacButton implements Button {
        public void click() {
            System.out.println("Mac Button clicked");
        }
    }

    static class MacCheckbox implements Checkbox {
        public void check() {
            System.out.println("Mac Checkbox checked");
        }
    }

    // Step 4: Abstract Factory
    interface GUIFactory {
        Button createButton();
        Checkbox createCheckbox();
    }

    // Step 5: Concrete Factories
    static class WindowsFactory implements GUIFactory {
        public Button createButton() {
            return new WindowsButton();
        }

        public Checkbox createCheckbox() {
            return new WindowsCheckbox();
        }
    }

    static class MacFactory implements GUIFactory {
        public Button createButton() {
            return new MacButton();
        }

        public Checkbox createCheckbox() {
            return new MacCheckbox();
        }
    }

    // Step 6: Client
    static class Application {
        private Button button;
        private Checkbox checkbox;

        public Application(GUIFactory factory) {
            button = factory.createButton();
            checkbox = factory.createCheckbox();
        }

        public void run() {
            button.click();
            checkbox.check();
        }
    }

    // Step 7: Main method
    public static void main(String[] args) {
        GUIFactory factory;

        String osName = "Windows"; // Change to "Mac" to test Mac family

        if ("Windows".equalsIgnoreCase(osName)) {
            factory = new WindowsFactory();
        } else if ("Mac".equalsIgnoreCase(osName)) {
            factory = new MacFactory();
        } else {
            throw new IllegalArgumentException("Unknown OS: " + osName);
        }

        Application app = new Application(factory);
        app.run();
    }
}
