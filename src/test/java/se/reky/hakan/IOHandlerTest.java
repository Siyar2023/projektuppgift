// Paketdeklaration, anger att klassen finns i paketet 'se.reky.hakan'
package se.reky.hakan;

// Importerar nödvändiga klasser från JUnit för testning
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Importerar Scanner-klassen från java.util för att läsa indata
import java.util.Scanner;

// Deklaration av testklassen 'IOHandlerTest'
public class IOHandlerTest {

    // Privat hjälpmetod för att skapa och returnera en instans av IOHandler
    private IOHandler testIOHandler(String dataForScanner) {

        // Skapar en Scanner-instans som läser från strängen 'dataForScanner'
        Scanner scanner = new Scanner(dataForScanner);

        // Skapar en instans av IOHandler med Scanner-instansen som parameter
        IOHandler ioHandler = new IOHandler(scanner);

        // Returnerar den skapade instansen av IOHandler
        return ioHandler;
    }


    // Testmetod markerad med @Test för att visa att detta är en testfall
    @Test
    @DisplayName("nextInt() = true") // Sätter ett beskrivande namn på testet
    public void testIOHandler() {

        // Skapar en instans av IOHandler med strängen "5" som indata
        IOHandler ioHandler = testIOHandler("5");

        // Kontrollera om nästa token som ska läsas är en integer
        boolean hasNextInt = ioHandler.hasNextInt();

        // Verifierar att hasNextInt är sant
        Assertions.assertTrue(hasNextInt);
    }
}



























/*package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class IOHandlerTest {
    private IOHandler testIOHandler(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);

        // Detta är en instans av IOHandler som tar in instansen "scanner" som jag tidigare skapat
        IOHandler ioHandler = new IOHandler(scanner);

        return ioHandler;
    }

    @Test
    @DisplayName("nextInt() = true")
    public void testIOHandler() {
        // Instans av klassen "Scanner". (Skapat ett objekt av Scanner klassen).

        boolean hasNextInt = testIOHandler("5").hasNextInt();

        Assertions.assertTrue(hasNextInt);
    }
}*/