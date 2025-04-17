# ToDo List API

API RESTful desenvolvida com **Spring Boot** e **MySQL**, que permite o gerenciamento de tarefas (to-dos). Ideal para projetos de produtividade e organização pessoal.

---

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Swagger/OpenAPI

---

## Funcionalidades

- ✅ Criar uma nova tarefa
- 📄 Listar todas as tarefas
- ✏️ Atualizar uma tarefa
- 🗑️ Deletar uma tarefa
- 🔄 Marcar tarefa como concluída
- 🗓️ Listar tarefa por prioridade

---

## ⚙️ Como rodar o projeto localmente

### 1. Pré-requisitos

Certifique-se de ter instalado:

- [Java 17+](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [MySQL 8+](https://dev.mysql.com/downloads/)
- [Maven](https://maven.apache.org/)

### 2. Configuração do banco de dados

Crie um banco de dados no MySQL:

```sql
CREATE DATABASE todolist;
```
### 4.1. Criar uma Nova Tarefa (POST)
Para criar uma nova tarefa, use o método POST para o endpoint /todos:

URL: http://localhost:8080/todos

Corpo da requisição (JSON):

```
{
"title": "Estudar Spring Boot",
"description": "Estudar Spring Boot para entender a criação de APIs",
"priority": "Alta"
}
```

### 4.2. Listar Tarefas (GET)
Para listar todas as tarefas criadas, use o método GET para o endpoint /todos:

URL: http://localhost:8080/todos

Isso retornará todas as tarefas armazenadas no banco de dados.

### 4.3. Atualizar uma Tarefa (PUT)
Para atualizar uma tarefa existente, use o método PUT para o endpoint /todos/{id}:

URL: http://localhost:8080/todos/{id}

### 4.4. Deletar uma Tarefa (DELETE)
Para excluir uma tarefa, use o método DELETE para o endpoint /todos/{id}:

URL: http://localhost:8080/todos/{id}

Substitua {id} pelo ID da tarefa que você deseja deletar.

