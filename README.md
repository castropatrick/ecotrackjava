
# 🌱 EcoTrack Java API

API REST desenvolvida em **Java + Spring Boot** para gerenciar atividades sustentáveis, usuários e categorias.  
O objetivo do projeto é registrar ações ecológicas, calcular seu impacto ambiental e incentivar práticas sustentáveis, aplicando **validações, relacionamentos, persistência em banco de dados H2 e boas práticas de arquitetura**.

## 📚 Índice
- [📌 Sobre o Projeto](#-sobre-o-projeto)
- [🛠️ Tecnologias Utilizadas](#️-tecnologias-utilizadas)
- [📁 Estrutura do Projeto](#-estrutura-do-projeto)
- [🚀 Como Executar o Projeto](#-como-executar-o-projeto)
- [📡 Endpoints da API](#-endpoints-da-api)
- [🧪 Exemplos de Requisição](#-exemplos-de-requisição)

## 📌 Sobre o Projeto

A **EcoTrack API** é um sistema backend REST que permite:

- ✅ Cadastrar e gerenciar **usuários** com pontuação acumulada.  
- ✅ Registrar **atividades sustentáveis** e calcular a redução de CO₂.  
- ✅ Organizar ações em diferentes **categorias** (Reciclagem, Transporte, Energia etc).  
- ✅ Aplicar **validações automáticas** e garantir a integridade dos dados.  

## 🛠️ Tecnologias Utilizadas

- ☕ **Java 17+**  
- 🌱 **Spring Boot 3+**  
- 🐘 **H2 Database** (em memória)  
- 📦 **Maven**  
- 🧰 **Lombok**  
- 🔒 **Jakarta Validation**  
- 🔄 **Spring Data JPA**

## 📁 Estrutura do Projeto

```
src/
├── main/
│   ├── java/com/example/ecotrackjava/
│   │   ├── controller/     # Endpoints REST
│   │   ├── model/          # Entidades (Usuario, Atividade, Categoria)
│   │   ├── repository/     # Interfaces JPA
│   │   ├── validation/     # Validações personalizadas
│   │   └── service/        # (Opcional) Lógica de negócio
│   └── resources/
│       ├── application.properties
│       └── data.sql       # Dados iniciais (opcional)
└── test/                  # Testes automatizados
```

## 🚀 Como Executar o Projeto

### 1️⃣ - Clonar o repositório:
```bash
git clone https://github.com/seu-usuario/ecotrack-java.git
```

### 2️⃣ - Entrar na pasta do projeto:
```bash
cd ecotrack-java
```

### 3️⃣ - Rodar a aplicação:
```bash
mvn spring-boot:run
```

A aplicação estará disponível em:  
👉 `http://localhost:8080`

## 📡 Endpoints da API

### 👤 Usuários
| Método | Endpoint         | Descrição                       |
|--------|------------------|-------------------------------|
| POST   | `/usuarios`      | Cria um novo usuário         |
| GET    | `/usuarios`      | Lista todos os usuários      |

### 🌿 Atividades
| Método | Endpoint          | Descrição                         |
|--------|-------------------|-----------------------------------|
| POST   | `/atividades`     | Cria uma nova atividade          |
| GET    | `/atividades`     | Lista todas as atividades       |

### 🏷️ Categorias
| Método | Endpoint          | Descrição                      |
|--------|-------------------|------------------------------|
| POST   | `/categorias`     | Cria uma nova categoria      |
| GET    | `/categorias`     | Lista todas as categorias    |

## 🧪 Exemplos de Requisição

### 📤 Criar Usuário

```json
POST /usuarios
{
  "nome": "Pedro Silva",
  "email": "pedro@email.com",
  "pontuacaoTotal": 0
}
```

### 📤 Criar Categoria

```json
POST /categorias
{
  "nome": "Reciclagem",
  "descricao": "Atividades relacionadas à reciclagem de materiais"
}
```

### 📤 Criar Atividade

```json
POST /atividades
{
  "tipo": "RECICLAGEM",
  "pontos": 50,
  "co2Evitado": 12.5,
  "descricao": "Coleta seletiva de resíduos",
  "usuario": { "id": 1 },
  "categoria": { "id": 1 }
}
```
