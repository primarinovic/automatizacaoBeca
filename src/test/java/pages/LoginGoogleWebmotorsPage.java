package pages;

import com.everis.beca.CommonsBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LoginGoogleWebmotorsPage extends CommonsBasePage {

	WebDriverWait wait;
	Actions builder;

	WebElement pesquisar;

	String campoPesquisar = "/html/body/div/main/div[2]/div/div[1]/div[2]/div/div/div/div/input";

	public LoginGoogleWebmotorsPage() {
		wait = new WebDriverWait(_Driver(), 15);
		builder = new Actions(_Driver());
	}
	
	public void acessaPaginaLogin() {
		navegarAteSite("https://login.webmotors.com.br");
	}
		
	public void clicaEntrarGoogle(){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnEntrarGoogle"))).click();
	}

	public void validaUrlPerfil() {
		assertTrue("URL contém garagem", wait.until(ExpectedConditions.urlContains("garagem")));
	}
}
