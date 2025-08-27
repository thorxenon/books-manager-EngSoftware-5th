# Books Manager (EngSoftware 5th)

Este projeto é um gerenciador de livros desenvolvido em Java utilizando o framework Spring Boot. Ele implementa uma API REST para operações CRUD (Create, Read, Update, Delete) sobre uma entidade Livro (Book), persistindo os dados em um banco de dados H2 em memória.

# Este projeto foi realizado durante o 5° Período do curso de Engenharia de Software.

## Estrutura do Projeto

```
src/
  main/
    java/
      com/livros/estudos/
        EstudosApplication.java         # Classe principal da aplicação Spring Boot
        controller/
          BookController.java          # Controlador REST para operações com livros
        entity/
          Book.java                   # Entidade JPA que representa um livro
        repository/
          BookRepository.java         # Interface de repositório JPA para livros
        service/
          BookService.java            # Interface de serviço para lógica de negócio
          impl/
            BookServiceImpl.java      # Implementação da interface de serviço
    resources/
      application.properties          # Configurações da aplicação (porta, banco H2, JPA)
  test/
    java/
      com/livros/estudos/
        EstudosApplicationTests.java  # Teste básico de contexto Spring Boot
```

## Principais Arquivos

- **EstudosApplication.java**: Classe principal que inicializa a aplicação Spring Boot.
- **BookController.java**: Expõe endpoints REST para listar, criar, atualizar e remover livros.
- **Book.java**: Entidade JPA com campos `id` e `title`.
- **BookRepository.java**: Interface que estende JpaRepository para persistência dos livros.
- **BookService.java**: Interface de serviço com métodos para CRUD.
- **BookServiceImpl.java**: Implementação dos métodos de serviço usando o repositório.
- **application.properties**: Configurações do Spring Boot, banco H2 e JPA.
- **EstudosApplicationTests.java**: Teste de contexto da aplicação.

## Endpoints REST

- `GET /books` — Lista todos os livros
- `GET /` — Endpoint de teste (retorna `{ "pongs": true }`)
- `POST /books` — Cria um novo livro
- `PUT /books/{id}` — Atualiza um livro existente
- `DELETE /books/{id}` — Remove um livro

## Configuração do Banco de Dados

O projeto utiliza o banco de dados H2 em memória, configurado em `application.properties`:
- Console H2 disponível em `/h2-console`
- Usuário: `sa`, senha: (vazio)
- URL: `jdbc:h2:mem:bootapp`

## Como Executar

1. Certifique-se de ter o Java 11+ instalado.
2. Execute o comando:
   ```
   ./mvnw spring-boot:run
   ```
3. Acesse a API em `http://localhost:8085`.

## Testes

Os testes estão localizados em `src/test/java/com/livros/estudos/EstudosApplicationTests.java`.

---

Projeto para fins didáticos da disciplina de Engenharia de Software (5º período).
