package pattern.decorator.decorator;

import pattern.decorator.interfaces.Formateable;

public class UnderlinedDecorator extends TextDecorator{

    public UnderlinedDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String format() {
        int numChar = text.format().length();
        StringBuilder sb = new StringBuilder(text.format());
        sb.append("\n");
        for (int i = 0; i < numChar; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
}
