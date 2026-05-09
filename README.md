# 🚀 API de Foco e Produtividade

API REST desenvolvida em Java com Spring Boot para registrar e analisar sessões de foco e produtividade.

---

## 📋 Requisitos

- Java 17+
- Maven 3.8+

---

## ▶️ Como rodar

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/seu-repositorio.git

# Entre na pasta do projeto
cd api-foco-produtividade

# Rode a aplicação
./mvnw spring-boot:run
```

A aplicação sobe em `http://localhost:8080`.

---

## 🛣 Endpoints

### POST `/registro-foco`

Registra uma nova sessão de foco.

**Body:**
```json
{
  "nivelFoco": 4,
  "tempoMinutos": 45,
  "comentario": "Implementei o módulo de autenticação"
}
```

**Validações:**
- `nivelFoco`: inteiro entre **1 e 5** (1 = muito distraído, 5 = estado de flow)
- `tempoMinutos`: mínimo **1**
- `comentario`: não pode ser vazio

**Resposta (201 Created):**
```json
{
  "id": 1,
  "nivelFoco": 4,
  "tempoMinutos": 45,
  "comentario": "Implementei o módulo de autenticação"
}
```

---

### GET `/diagnostico-produtividade`

Retorna um resumo inteligente de todas as sessões registradas.

**Resposta (200 OK):**
```json
{
  "mediaProdutividade": 3.7,
  "tempoTotalFocado": 320.0,
  "mensagem": "🔥 Ótimo foco! Você está produzindo bem, continue assim e respeite os intervalos."
}
```

**Faixas de feedback:**

| Média | Mensagem |
|-------|----------|
| < 2 | ⚠️ Nível crítico de foco |
| 2 a 3 | 😴 Foco abaixo do esperado |
| 3 a 4 | 👍 Foco moderado |
| 4 a 5 | 🔥 Ótimo foco |
| 5 | 🚀 Estado de flow total |

---

### GET `/listar-tudo`

Lista todas as sessões registradas.

---

## 🏗 Estrutura do projeto

```
src/
├── controller/       # Endpoints REST
├── service/          # Regras de negócio
├── repository/       # Armazenamento em memória
├── model/            # Entidade FocoProdutividade
├── dto/              # Request, Response e StatisticsResponse
```

---

## 🛠 Tecnologias

- Java 17
- Spring Boot
- Jakarta Validation
- Maven