package com.zqqiliyc.patterns.gui;

/**
 * <p>Base factory class. Note that 'factory' is merely a role for the class.</p>
 * <p>It should hava some core business logic which needs different products to be created.</p>
 *
 * @author zqqiliyc
 * @since 2024-10-20
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button objects.
     *
     * @return {@link Button}
     */
    public abstract Button createButton();
}
