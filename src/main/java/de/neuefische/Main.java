package de.neuefische;

public class Main {
    public static void main(String[] args) {
        System.out.println("Kunde: DURST!");
        String beverage = null;
        //Es wird versucht einen Codeteil auszuführen
        try {
            beverage = orderFromWaiter();
        }//Schlägt dieser fehl, also "fliegt" eine Exception, fangen wir diese ab und handeln nach "Plan B"
        catch (Exception e) {
            beverage = "ein kaltes Bier in einem anderen Lokal";
        }
        System.out.println("Kunde: Genießt " + beverage);

    }

    public static String orderFromWaiter() throws WarmBeerException { //<- Checked Exceptions müssen angezeigt werden!
        System.out.println("Kellner: Bestellung aufgenommen");
        String beverage = getBeverageFromFridge();
        System.out.println("Kellner: " + beverage + " geholt");
        return "ein eiskaltes " + beverage;
    }

    public static String getBeverageFromFridge() throws WarmBeerException { //<- Checked Exceptions müssen angezeigt werden!
        //Exceptions werden "geworfen"
        throw new WarmBeerException("Kühlschrank defekt");
    }
}