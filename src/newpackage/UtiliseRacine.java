package newpackage;

/**
 *
 * @author Arthur Guéneau et Marc Guiocheau
 */
public class UtiliseRacine
{
    public static void main(String[] argv)
           
    {
        Racine extracteur = new Racine(0.01);
        double operande= (Double.valueOf(argv[0])).doubleValue();
        double valeurRacine;
        try { //on vérifie ce bloc de code pour vérifier qu'il n'y a pas de valeu négative
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
            (valeurRacine-Math.sqrt(operande)));
            extracteur.setPrecision(0.00001);
            valeurRacine=extracteur.racine(operande);
            System.out.println(valeurRacine);
            System.out.println("precision "+extracteur.getPrecision() + " , erreur =" +
            (valeurRacine-Math.sqrt(operande)));
        }
        catch(NegativeValueException e)
        {
            e.printStackTrace();
        }
        
    }
}