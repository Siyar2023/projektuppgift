// Paketdeklaration som anger att klassen tillhör paketet se.reky.hakan
package se.reky.hakan;

// Importerar nödvändiga klasser från JUnit 5 biblioteket för att skriva och köra tester
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player; // Importerar Player-klassen från det egna paketet
// se.reky.hakan.model

import java.util.Scanner; // Importerar Scanner-klassen från java.util-paketet

// Klass som innehåller testfall för att testa funktionaliteten hos PlayerInteraction-klassen
public class PlayerInteractionTest {

    // Privat metod som skapar och returnerar ett PlayerInteraction-objekt med en given sträng
    // som indata
    private PlayerInteraction playerInteraction(String dataForScanner) {

        // Skapar en ny SimplePlayerInteraction med en IOHandler som tar en Scanner med indata
        // som parameter
        PlayerInteraction playerInteraction = new SimplePlayerInteraction(
                new IOHandler(new Scanner(dataForScanner)));

        // Returnerar det skapade PlayerInteraction-objektet
        return playerInteraction;
    }

    // Privat fält som representerar en spelare
    private Player player;

    // Metod som körs före varje testfall för att initialisera fält
    @BeforeEach
    public void init() {

        // Skapar en ny Player-instans och tilldelar den till fältet player
        player = new Player();
    }

    // Testmetod som verifierar att spelarens namn sätts korrekt
    @Test
    @DisplayName("Player name") // Anger en beskrivning av testfallet
    public void testPlayerName() {

        // Använder playerInteraction-metoden för att skapa ett PlayerInteraction-objekt och anropa setupPlayer med spelaren
        playerInteraction("Player").setupPlayer(player);
        // Kontrollerar att spelarens namn är korrekt satt till "Player"
        Assertions.assertEquals("Player", player.getName());
    }

    // Testmetod som verifierar att spelarens hälsa uppdateras korrekt
    @Test
    @DisplayName("Player health") // Anger en beskrivning av testfallet
    public void testPlayerHealth() {

        // Använder playerInteraction-metoden för att skapa ett PlayerInteraction-objekt och anropa updatePlayerHealth med spelaren och ett nytt hälsovärde

        playerInteraction("Player").updatePlayerHealth(player, 2);
        // Kontrollerar att spelarens hälsa är korrekt uppdaterad till 2
        Assertions.assertEquals(2, player.getHp());
    }
}



























/*package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {

    private PlayerInteraction playerInteraction(String dataForScanner) {

        PlayerInteraction playerInteraction = new SimplePlayerInteraction(
                new IOHandler(new Scanner(dataForScanner)));

        return playerInteraction;
    }

    private Player player;

    @BeforeEach
    public void init() {
        player = new Player();
    }

    @Test
    @DisplayName("Player name")
    public void testPlayerName() {
        playerInteraction("Player").setupPlayer(player);

        Assertions.assertEquals("Player", player.getName());
    }

    @Test
    @DisplayName("Player health")
    public void testPlayerHealth() {
        playerInteraction("Player").updatePlayerHealth(player, 2);

        Assertions.assertEquals(2, player.getHp());
    }
}*/