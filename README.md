# 🍽️ Cardápio Digital

Sistema de cardápio digital desenvolvido para permitir o cadastro e a visualização de produtos de forma simples.

## 🚀 Tecnologias Utilizadas

### Backend

* Java
* Spring Boot
* Spring Data JPA
* Maven
* PostgreSQL

### Frontend

* React
* Vite
* TypeScript
* CSS

### Banco de Dados

* PostgreSQL

## ⚙️ Funcionalidades

* Cadastro de produtos
* Listagem de produtos
* Consulta de produtos
* Integração entre frontend e backend
* Persistência de dados em PostgreSQL

## 🛠️ Configuração do Ambiente

### Pré-requisitos

* Java 21+ (ou versão utilizada no projeto)
* Node.js 20+
* PostgreSQL
* Maven
* Git

## 🔧 Configuração do Banco de Dados

Crie um banco PostgreSQL:

```sql
CREATE DATABASE cardapio;
```

Configure as credenciais no arquivo:

```properties
src/main/resources/application.properties
```

Exemplo:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/food
spring.datasource.username=postgres
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## ▶️ Executando o Backend

Acesse a pasta:

```bash
cd cardapio-backend
```

Execute:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em:

```text
http://localhost:8080
```

## ▶️ Executando o Frontend

Acesse a pasta:

```bash
cd cardapio-frontend
```

Instale as dependências:

```bash
npm install
```

Execute:

```bash
npm run dev
```

A aplicação estará disponível em:

```text
http://localhost:5173
```

## 🔗 API

Exemplo de endpoint:

```http
GET /food
```

Retorna todos os produtos cadastrados.

## 📸 Demonstração

