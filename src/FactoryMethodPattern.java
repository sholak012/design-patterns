// GUIFactoryCreator using Factory Method pattern to select factory
class GUIFactoryCreator {

    // Factory Method to return the appropriate factory based on OS type
    public static GUIFactory getFactory(String osType) {
        if (osType.equalsIgnoreCase("MacOS")) {
            return MacOSFactory.getInstance();  // Singleton usage
        } else if (osType.equalsIgnoreCase("Windows")) {
            return WindowsFactory.getInstance();  // Singleton usage
        } else {
            throw new IllegalArgumentException("Unknown OS type.");
        }
    }
}

// Client Code
public class AbstractFactoryDemo {
    public static void main(String[] args) {

        // Dynamically selecting the factory using Factory Method
        GUIFactory guiFactory = GUIFactoryCreator.getFactory("Windows");

        // Creating Windows GUI components
        Button windowsButton = guiFactory.createButton();
        Checkbox windowsCheckbox = guiFactory.createCheckbox();

        windowsButton.paint();
        windowsCheckbox.paint();

        // If you want to switch to MacOS, you can do so by changing the OS type:
        // GUIFactory guiFactory = GUIFactoryCreator.getFactory("MacOS");
    }
}
