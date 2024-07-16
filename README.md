> # Hubforum - Criação de API - ALura Next Education  
---
> ## Challenge do Curso de springboot3 - Criação de API 
---

<p align="center">
   <img src="https://img.shields.io/badge/ STATUS-LANÇADO -brightgreen"/>
</p>
<p align="center">
   <img src="https://img.shields.io/badge/ STATUS-VERSÃO 1.2-brightgreen"/>
</p>

---
No curso de Back end do curso de springboot 3 o desafio a concluir uma API..

Projeto de forum, chamado HubForum que é uma API Rest desenvolvida em Java e Spring Boot. Conta com controle de autenticação e autorização utilizando Spring Security. Teste unitários é utilizado OpenAPI e para teste das requisições foi usado Insomnia.

o Hubforum foi desenvolvido para que o usuário tenha faça cadastros, edite e exclua registros de tópicos, estando autenticado e salva os dados em um banco de dados MySQL local.

---

> ## * Funcionalidades *
---

> ### Funções com autenticação JWT
- Cadastro de autor
- Cadastro de tópicos.
- Lista de tópicos salvos.
- Detalhes de tópicos salvos.
- Edição no registro de tópicos.
- Exclusão lógica do registro de tópicos. (mantém no banco e desabilita a visualização pela requisição)
---
> ### Funções sem autenticação JWT
- Cadastro de usuário (salva senha utilizando criptografia Bcrypt)
- Login na API
---
>#### * Para acessar a API, após configurar o Banco de Dados MySQL e rodar a API, basta acessar o endereço (http://"server:port/context-path"/swagger-ui.html) pelo navegador.
---
> ## Tecnologias utilizadas
---
> #### Configuração do projeto
- Java (JDK 17 "17.0.10")
- Spring Boot 3
- Maven 4.0.0
---
> #### Dependências controladas por Maven
- Spring Boot DevTools
- Spring Web
- Lombok
- Spring Data Jpa 3.3.1
- Flyway Migration
- MySQL Driver 8.0
- Validation
- Java JWT 4.4.0
- Spring Security
- Springdoc OpenAPI Swagger 2.6.0
---
>#### Desenvolvimento
-Rafael Frank

Agradeço muito a minha familia por ter suportado a luz do computador acesa na madrugada, enquanto esse tempo incrivel de aprendizagem passou.
Espero que eu possa criar novos projetos e desenvolver ainda mais minhas capacidades.
Obrigado Deus por me permitir chegar até aqui

