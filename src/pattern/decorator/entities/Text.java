package pattern.decorator.entities;

import pattern.decorator.interfaces.Formateable;

public class Text implements Formateable {
    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String format() {
        return getText();
    }
}
