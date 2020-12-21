# language: pt

Funcionalidade: Testar página de usuário do Webmotors

  Um cliente deseja fazer login no site e verificar se está na página Minha Garagem

  @evidencia
  Cenario: Validar se o usuário faz login
    Dado que eu navego até a página de login do Webmotors
    Quando eu preencho os meus dados
    E clico no botão entrar
    Entao eu estou logado

  @evidencia
  Cenario: Validar se o usuário faz login com conta do Google
    Dado que eu navego até a página de login do Webmotors
    Quando eu clico em Entrar com Google
    Entao eu estou logado

  @evidencia
  Cenario: Validar se o usuário faz login com dados inválidos
    Dado que eu navego até a página de login do Webmotors
    Quando eu preencho com dados inválidos
    E clico no botão entrar
    Entao o login não é realizado

