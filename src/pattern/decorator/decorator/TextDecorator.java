package pattern.decorator.decorator;

import pattern.decorator.interfaces.Formateable;

abstract public class TextDecorator implements Formateable {

    protected Formateable text;

    public TextDecorator(Formateable text) {
        this.text = text;
    }
}
