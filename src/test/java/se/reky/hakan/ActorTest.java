package se.reky.hakan;

// Importerar nödvändiga klasser från JUnit för att skapa och köra test
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Importerar de klasser som behövs för att testa, i detta fall Actor, Goblin och Guard
import se.reky.hakan.model.Actor;
import se.reky.hakan.model.Goblin;
import se.reky.hakan.model.Guard;

// Skapar en testklass för att testa funktionalitet i Actor-klassen
public class ActorTest {


    // Deklarerar en instansvariabel av typen Actor
    Actor actor;

    // Använder JUnit-annotation för att markera denna metod som ett test
    @Test

    // Använder JUnit-annotation för att ge testet en beskrivning
    @DisplayName("Testar attack metod för Actor klass")
    public void testAttackMetod () {

        // Skapar instanser av Goblin och Guard
        Goblin goblin = new Goblin();
        Guard guard = new Guard();

        // Använder goblin-objektets attack-metod för att attackera guard-objektet
        goblin.attack(guard);

        // Använder en assertion för att kontrollera att guard's HP har minskat till 17
        Assertions.assertEquals(17, guard.getHp());
    }
}


/*
Koden syftar till att testa att attack()-metoden hos Actor-klassens subklasser fungerar korrekt genom att
använda Goblin som angripare och Guard som mål. Om testet lyckas, borde det indikera att attack()-metoden
implementeras korrekt för Goblin-objektet och resulterar i att Guard-objektets hälsa minskar till 17 efter attacken
 */

















/*package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Actor;
import se.reky.hakan.model.Goblin;
import se.reky.hakan.model.Guard;

public class ActorTest {

    Actor actor;

    @Test
    @DisplayName("Testar attack metod för Actor klass")
    public void testAttackMetod () {
        Goblin goblin = new Goblin();
        Guard guard = new Guard();

        goblin.attack(guard);

        Assertions.assertEquals(17, guard.getHp());
    }
}*/