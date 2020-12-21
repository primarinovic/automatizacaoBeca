package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.LoginWebmotorsPage;

public class LoginInvalidoWebmotorsTestsSteps {
	
LoginWebmotorsPage loginWebmotors = new LoginWebmotorsPage();
	
	@Dado("que eu navego até a página de login do Webmotors")
	public void navegarAteLogin(){
		loginWebmotors.acessaPaginaLogin();
	}
	
	@Quando("eu preencho os meus dados")
	public void preenchoDados() {
		loginWebmotors.preencheDadosDeLogin("logininvalido@gmail.com", "amareloepreto");
	}
	
	@E("clico no botão entrar")
	public void clicarEntrar() {
		loginWebmotors.clicarBotaoEntrar();
	}
	
	@Entao("o login não é realizado")
	public void verificarPagina() {
		loginWebmotors.validaUrlPerfil();
	}
	
	
}

