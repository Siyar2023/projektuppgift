package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


// Importera Scanner klassen från java.util paketet för att läsa in data från en sträng
import java.util.Scanner;

public class ScannerTest {

    // Annotering för att markera detta som en testmetod som ska köras av testverktyget
    @Test
    // Annotering för att ge en beskrivning av testet som kommer att visas i testresultaten
    @DisplayName("Test nextLine()")
    public void testScannerNextLine() {

        // Skapa en sträng som kommer att användas som indata för Scanner objektet
        String nextLineString = "Test nextLine-method!";

        // Skapa en ny Scanner instans med strängen som indata istället för standard System.in
        Scanner scanner = new Scanner(nextLineString);

        // Använd Assertions klassen från JUnit för att kontrollera att nextLine() metoden
        // returnerar samma sträng som vi satte in som indata
        Assertions.assertEquals(nextLineString, scanner.nextLine());
    }
}















/*import java.util.Scanner;

public class ScannerTest {

    @Test
    @DisplayName("Test nextLine()")
    public void testScannerNextLine() {
        // Skapa en Scanner instans med en sträng istället för System.in
        String nextLineString = "Test nextLine-method!";
        Scanner scanner = new Scanner(nextLineString);

        // Testa att readLine() metoden ger tillbaka förväntad data
        Assertions.assertEquals(nextLineString, scanner.nextLine());
    }
}*/