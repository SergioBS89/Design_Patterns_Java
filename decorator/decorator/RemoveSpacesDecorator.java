package pattern.decorator.decorator;

import pattern.decorator.interfaces.Formateable;

public class RemoveSpacesDecorator extends TextDecorator{

    public RemoveSpacesDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String format() {
        return text.format().replace(" ", "");
    }
}
