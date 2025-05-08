# 🎉 Event API – API de Gerenciamento de Eventos com Spring Boot

Este projeto é uma API REST desenvolvida com **Java Spring Boot**, focada no gerenciamento de eventos. A aplicação permite criar, listar, atualizar e deletar eventos com persistência em banco de dados PostgreSQL, versionamento via Flyway e integração com AWS S3 para upload de arquivos.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Flyway** – controle de versão do banco
- **Lombok** – para reduzir boilerplate
- **AWS S3** – armazenamento de arquivos
- **Swagger/OpenAPI** – documentação da API
- **Maven** – gerenciamento de dependências

---

## 📦 Funcionalidades

- ✅ Cadastro de eventos
- 🔍 Listagem com paginação
- ✏️ Atualização de eventos
- ❌ Exclusão lógica
- 📂 Upload de imagens para AWS S3
- 📄 Documentação interativa com Swagger

---

## 📁 Estrutura do Projeto

```
event-api/
├── src/
│   └── main/
│       ├── java/com/nataliataira/eventapi/
│       │   ├── controller/
│       │   ├── dto/
│       │   ├── entity/
│       │   ├── repository/
│       │   ├── service/
│       │   └── config/
│       └── resources/
│           ├── application.yml
│           └── db/migration/
├── pom.xml
└── README.md
```

---

## 🧪 Como Executar Localmente

1. **Clone o repositório:**

```bash
git clone https://github.com/nataliataira/event-api.git
cd event-api
```

2. **Configure as credenciais no `application.yml` (PostgreSQL e AWS):**

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/eventdb
    username: seu_usuario
    password: sua_senha

aws:
  s3:
    bucket: seu-bucket
    access-key: SUA_ACCESS_KEY
    secret-key: SUA_SECRET_KEY
```

3. **Execute o projeto:**

```bash
./mvnw spring-boot:run
```

---

## 🔍 Acesse a documentação Swagger

Após subir o projeto, acesse:

```
http://localhost:8080/swagger-ui.html
```

---

## 📜 Licença

Este projeto está licenciado sob os termos do arquivo [LICENSE](LICENSE).

---

> Projeto desenvolvido por [Natalia Taira](https://github.com/nataliataira) com Spring Boot, PostgreSQL, Flyway, Lombok e AWS S3.
