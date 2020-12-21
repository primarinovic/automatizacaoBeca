package com.everis.beca;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonsBasePage extends DriverFactory {

	WebDriverWait wait = new WebDriverWait(_Driver(), 15);

    public WebElement validarElementoEmTela(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void clicarElemento(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void preencherTextoElemento(By by, String texto){
        wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(texto);
    }

    public void navegarAteSite(String site){
        _Driver().get(site);
        _Driver().manage().window().maximize();
    }

    public void rolarAteElemento(WebElement elemento){
        ((JavascriptExecutor)_Driver()).executeScript("arguments[0].scrollIntoView(true);", elemento);
    }

    public void validaCondicaoVerdadeira(String mensagemFalha, Boolean condicao){
        assertTrue(mensagemFalha, condicao);
    }

}
