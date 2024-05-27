package se.reky.hakan;

// Importerar nödvändiga klasser från JUnit biblioteket för att skriva och köra tester.
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

// Importerar egna klasser från projektet
import se.reky.hakan.GameException;
import se.reky.hakan.util.GameUtil;

public class GameUtilTest {

    // Använder @Test för att markera att detta är en testmetod
    @Test
    // @DisplayName används för att ge en mer beskrivande namn till testet som visas när tester körs
    @DisplayName("Should throw exception if null in method")
    public void testGameUtilMethod() throws GameException {

        // Skapar en instans av GameUtil klassen
        GameUtil gameUtil = new GameUtil();

        // Använder Assertions.assertThrows för att verifiera att en GameException kastas
        // när metoden toLowerCaseButFirstLetterCapitalized anropas med null som parameter
        Assertions.assertThrows(GameException.class, () -> {
            gameUtil.toLowerCaseButFirstLetterCapitalized(null);
        });
    }
}

/*
Denna kod är ett enhetstest för en metod i klassen GameUtil. Testet kontrollerar om metoden
toLowerCaseButFirstLetterCapitalized kastar en GameException om den anropas med en null-parameter.
 */





















/*package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;
import se.reky.hakan.util.GameUtil;

public class GameUtilTest {

    @Test
    @DisplayName("Should throw exception if null in method")
    public void testGameUtilMethod() throws GameException {
        GameUtil gameUtil = new GameUtil();

        Assertions.assertThrows(GameException.class, () -> {gameUtil.toLowerCaseButFirstLetterCapitalized(null);});
    }
}*/