package pattern.decorator;

import pattern.decorator.decorator.RemoveSpacesDecorator;
import pattern.decorator.decorator.ReverseDecorator;
import pattern.decorator.decorator.UnderlinedDecorator;
import pattern.decorator.decorator.UpperCaseDecorator;
import pattern.decorator.entities.Text;
import pattern.decorator.interfaces.Formateable;

public class Decorator {
    public static void main(String[] args) {

        Formateable formateable = new Text("Hello world! Here learning design patterns");

        UpperCaseDecorator upperCaseDecorator = new UpperCaseDecorator(formateable);
        ReverseDecorator reverseDecorator = new ReverseDecorator(upperCaseDecorator);
        UnderlinedDecorator underlinedDecorator = new UnderlinedDecorator(reverseDecorator);
        RemoveSpacesDecorator removeSpacesDecorator = new RemoveSpacesDecorator(underlinedDecorator);

        System.out.println(removeSpacesDecorator.format());

    }
}
