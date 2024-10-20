package com.zqqiliyc.patterns.gui;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        String os = System.getProperty("os.name");
        if (os.startsWith("Win")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
