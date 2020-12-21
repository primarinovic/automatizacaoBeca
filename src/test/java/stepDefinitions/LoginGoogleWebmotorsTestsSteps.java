package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginWebmotorsPage;

public class LoginGoogleWebmotorsTestsSteps {
	
LoginWebmotorsPage loginWebmotors = new LoginWebmotorsPage();

	@Quando("eu clico em Entrar com Google")
	public void clicaEntrarGoogle() {

	}

	@Entao("eu estou logado")
	public void verificarPagina() {
		loginWebmotors.validaUrlPerfil();
	}
	
}

