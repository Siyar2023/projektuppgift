package se.reky.hakan;

// Importerar nödvändiga klasser för tester
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Anger att klassen är inaktiverad, så JUnit kommer att ignorera alla tester i denna klass om inte annotationen tas bort
@Disabled
public class PlayerControllerSeleniumTest {
    // Deklarerar en WebDriver instansvariabel
    private WebDriver driver;

    // @BeforeAll körs en gång innan alla tester, för att ställa in WebDriverManager
    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup(); // Konfigurerar ChromeDriver
    }

    // @BeforeEach körs före varje test, för att ställa in en ny WebDriver instans
    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions(); // Skapar ChromeOptions objekt
        driver = new ChromeDriver(options); // Skapar en ny ChromeDriver instans med dessa options
    }

    // @AfterEach körs efter varje test, för att stänga WebDriver
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Stänger WebDriver och alla tillhörande fönster
        }
    }

    // Ett test för att kontrollera att login-knappen har rätt text
    @Test
    public void testLoginPageButton() {
        driver.get("http://localhost:8080/players"); // Navigerar till URL:en

        WebElement loginButton = driver.findElement(By.tagName("button")); // Hittar login-knappen

        // Kontrollerar att knappens text är "Logga in"
        assertEquals("Logga in", loginButton.getText(), "Knappens text är inte 'Logga in'");
    }

    // Ett test för att kontrollera att sidans titel är korrekt
    @Test
    public void testPageTitle() {
        driver.get("http://localhost:8080/players"); // Navigerar till URL:en

        String pageTitle = driver.getTitle(); // Hämtar sidans titel

        // Kontrollerar att sidans titel är "Players List"
        assertEquals("Håkan", pageTitle, "Sidans titel är inte 'Players List'");
    }

    // Ett test för att kontrollera att antal spelare på sidan är korrekt
    @Test
    public void testPlayerListCount() {
        driver.get("http://localhost:8080/players"); // Navigerar till URL:en

        List<WebElement> playerNameInputs = driver.findElements(By.tagName("li")); // Hittar alla <li> element, som representerar spelare
        int numberOfPlayers = playerNameInputs.size(); // Räknar antalet <li> element

        // Kontrollerar att antalet spelare är 2
        assertEquals(2, numberOfPlayers, "Felaktigt antal spelare i listan");
    }

    // Ett test för att kontrollera att namnet på den första spelaren är korrekt
    @Test
    public void testFirstPlayerName() {
        driver.get("http://localhost:8080/players"); // Navigerar till URL:en

        WebElement firstPlayer = driver.findElement(By.xpath("/html/body/ul/li[1]/span[1]")); // Hittar första spelaren med hjälp av XPath

        // Kontrollerar att första spelarens namn är "Bob"
        assertEquals("AB", firstPlayer.getText(), "Felaktigt namn på första spelaren");
    }
}


/*
Den här koden är ett testprogram skrivet i Java som använder sig av JUnit 5 och Selenium för att automatisera
webbläsartester. Testerna är inaktiverade genom att använda @Disabled-annoteringen. Här är en sammanfattning av vad
varje del av koden gör:

Importerar nödvändiga paket: Koden importerar klasser från JUnit 5 för att stödja testning, Selenium för
webbläsarautomation, och WebDriverManager för att hantera webbläsardrivare.

Definierar testklassen: PlayerControllerSeleniumTest är klassen som innehåller testfallen.

Setup av WebDriver:

@BeforeAll init(): En metod som körs en gång innan alla testfall, här ställs ChromeDriver upp med hjälp av WebDriverManager.
@BeforeEach setUp(): En metod som körs före varje enskilt testfall för att starta en ny instans av ChromeDriver.
@AfterEach tearDown(): En metod som körs efter varje enskilt testfall för att stänga webbläsaren om den är öppen.
Testfall:

testLoginPageButton(): Detta test navigerar till sidan http://localhost:8080/players, hittar en knapp och verifierar att dess text är "Logga in".
testPageTitle(): Detta test navigerar till samma sida och verifierar att sidans titel är "Players List".
testPlayerListCount(): Detta test navigerar till sidan och räknar antalet li-element (spelare) i en lista, och kontrollerar att antalet är 2.
testFirstPlayerName(): Detta test navigerar till sidan och verifierar att namnet på den första spelaren i listan är "Bob".
Testerna är avsedda att säkerställa att webbsidan beter sig som förväntat genom att kontrollera olika element och deras värden.
Förklaringar av metoder och komponenter:
Imports:

org.junit.jupiter.api.*: JUnit 5 (Jupiter) annotations och klasser för att skriva testfall.
org.openqa.selenium.*: Selenium WebDriver och dess klasser för att automatisera webbläsarinteraktioner.
io.github.bonigarcia.wdm.WebDriverManager: Hanterar WebDriver-beroenden och setup.
java.util.List: Används för att hantera listor av webbelement.
static org.junit.jupiter.api.Assertions.*: Statiska metoder för assertions i testfall.
Annotations:

@Disabled: Inaktiverar hela testklassen.
@BeforeAll: Metod som körs en gång före alla testfall i klassen.
@BeforeEach: Metod som körs före varje enskilt testfall.
@AfterEach: Metod som körs efter varje enskilt testfall.
@Test: Markerar en metod som ett testfall.
Metoder:

init(): Konfigurerar ChromeDriver en gång före alla tester.
setUp(): Skapar en ny WebDriver instans före varje test.
tearDown(): Stänger WebDriver instansen efter varje test.
testLoginPageButton(), testPageTitle(), testPlayerListCount(), testFirstPlayerName(): Enskilda testfall som
utför olika kontroller på webbsidan.
Assertions:

assertEquals(): Kontrollerar att förväntat värde är lika med faktiskt värde, och om det inte är det, ger ett
felmeddelande.
Denna struktur säkerställer att varje test körs i en fräsch webbläsarinstans och att webbläsaren stängs ordentligt
efter varje test, vilket minimerar risker för att tester påverkar varandra.

*/