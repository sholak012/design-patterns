// Singleton implementation for MacOSFactory
class MacOSFactory implements GUIFactory {
    private static MacOSFactory instance;

    private MacOSFactory() {} // Private constructor

    public static MacOSFactory getInstance() {
        if (instance == null) {
            instance = new MacOSFactory();
        }
        return instance;
    }

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Singleton implementation for WindowsFactory
class WindowsFactory implements GUIFactory {
    private static WindowsFactory instance;

    private WindowsFactory() {} // Private constructor

    public static WindowsFactory getInstance() {
        if (instance == null) {
            instance = new WindowsFactory();
        }
        return instance;
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

