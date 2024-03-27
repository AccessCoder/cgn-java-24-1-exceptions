package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void mainTest(){
        /**
         * Test ob "bei falschem Input" die Methode imstande ist ihre Exception zu werfen.
         * Ein wichtiger Test, damit wir sicherstellen können das wir die Exception korrekt
         * implementiert haben :-)
         */
        try {
            String actual = Main.orderFromWaiter();
            Assertions.fail(); //<- "Manueller" Abbruch des Tests inkl Fehlschlag. DENN: An diese Codestelle sollte er niemals kommen!
        }catch (WarmBeerException e){
            assertTrue(true); //<- Schnell "geschummelt" um den Test Grün zu bekommen, wir wollten nur testen ob eine Exception fliegt.
        }
    }

}