package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginInvalidoWebmotorsPage extends CommonsBasePage {

    WebDriverWait wait;
    Actions builder;

    WebElement pesquisar;

    String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";

    public LoginInvalidoWebmotorsPage() {
        wait = new WebDriverWait(_Driver(), 15);
        builder = new Actions(_Driver());
    }

    public void acessaPaginaLogin() {
        navegarAteSite("https://login.webmotors.com.br");
    }

    public void preencheDadosDeLogin(String email, String senha) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email"))).sendKeys(email);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("senha"))).sendKeys(senha);
    }

    public void clicarBotaoEntrar() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"btnEntrar\"]"))).click();
    }

    public void validarTelaDeLogin() {
        assertTrue("Usuário ou senha inválidos.", wait.until(ExpectedConditions.attributeContains(By.xpath("/html/body/div[1]/div/main/section/div/div/form[1]/div[2]/div/input"), "name", "email" )));
    }
}
