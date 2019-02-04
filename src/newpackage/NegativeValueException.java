package newpackage;

/**
 *
 * @author Arthur Guéneau et Marc Guiocheau
 */
public class NegativeValueException extends Exception{ //exception spécifique étendant la classe Exception
    
    NegativeValueException(double operande)
    {
        System.out.println(operande + " est négatif");
    }
}
