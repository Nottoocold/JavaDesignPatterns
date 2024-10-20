package com.zqqiliyc.patterns.gui;

/**
 * HTML Button implementation.
 *
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>HTML Button</button>");
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
        System.exit(0);
    }
}
