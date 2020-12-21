package stepDefinitions;

import io.cucumber.java.pt.*;
import pages.LoginWebmotorsPage;

public class LoginInvalidoWebmotorsTestsSteps {

LoginWebmotorsPage loginWebmotors = new LoginWebmotorsPage();
	
	@Quando("eu preencho com dados inválidos")
	public void preenchoDados() {
		loginWebmotors.preencheDadosDeLogin("logininvalido@gmail.com", "amareloepreto");
	}

	@Entao("o login não é realizado")
	public void verificarTela() {
			loginWebmotors.validarTelaDeLogin();
	}

}

