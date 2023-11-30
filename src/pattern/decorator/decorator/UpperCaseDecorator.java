package pattern.decorator.decorator;

import pattern.decorator.interfaces.Formateable;

public class UpperCaseDecorator extends TextDecorator {

    public UpperCaseDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String format() {
        return text.format().toUpperCase();
    }
}
