# 🌱 EcoTrack Java

Projeto desenvolvido em **Spring Boot** para monitoramento de atividades sustentáveis.  
As informações são salvas no **H2 Database (em memória)** e podem ser acessadas via API REST ou pelo console web do H2.

---

## 🚀 Tecnologias utilizadas
- Java 17  
- Spring Boot (Web, Data JPA, Validation)  
- H2 Database  
- Maven  
- Lombok  

---

## ▶️ Como rodar o projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/SEU-USUARIO/ecotrackjava.git
cd ecotrackjava
```

### 2. Rodar aplicação
Com Maven instalado:
```bash
mvn spring-boot:run
```

Ou com o wrapper:
```bash
./mvnw spring-boot:run
```

A aplicação iniciará em:
```
http://localhost:8080
```

---

## 📌 Endpoints disponíveis

### 🔹 Listar todas as atividades
```http
GET http://localhost:8080/atividades
```

### 🔹 Criar nova atividade
```http
POST http://localhost:8080/atividades
Content-Type: application/json

{
  "tipo": "Transporte Sustentável",
  "pontos": 30,
  "co2Evitado": 8.2,
  "descricao": "Uso de bicicleta em vez de carro"
}
```

### 🔹 Atualizar atividade existente
```http
PUT http://localhost:8080/atividades/1
Content-Type: application/json

{
  "tipo": "Reciclagem Atualizada",
  "pontos": 45,
  "co2Evitado": 15.0,
  "descricao": "Atividade revisada de coleta seletiva"
}
```

### 🔹 Remover atividade
```http
DELETE http://localhost:8080/atividades/1
```

---

## 🗄️ Console do H2 Database

1. Acesse no navegador:
```
http://localhost:8080/h2-console
```

2. Configure os dados de conexão:
- **JDBC URL:** `jdbc:h2:mem:testdb`  
- **User:** `sa`  
- **Password:** *(vazio)*  

3. Rode consultas SQL, por exemplo:
```sql
SELECT * FROM ATIVIDADE;
```

---

## 🎯 Demonstração rápida para a aula
1. Enviar `POST /atividades` com JSON acima.  
2. Fazer `GET /atividades` e mostrar o retorno.  
3. Abrir `H2 Console` e rodar:
   ```sql
   SELECT * FROM ATIVIDADE;
   ```
   → Mostrar os dados persistidos no banco.

---

## 👨‍💻 Autor
Desenvolvido por **[SEU NOME]** – Projeto acadêmico FIAP 🌱
