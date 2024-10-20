package com.zqqiliyc.patterns.gui;

/**
 * @author zqqiliyc
 * @since 2024-10-20
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
