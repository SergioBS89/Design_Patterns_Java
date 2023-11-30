package pattern.decorator.decorator;

import pattern.decorator.interfaces.Formateable;

public class ReverseDecorator extends TextDecorator{

    public ReverseDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String format() {
        StringBuilder sb = new StringBuilder(text.format());
        return sb.reverse().toString();
    }
}
