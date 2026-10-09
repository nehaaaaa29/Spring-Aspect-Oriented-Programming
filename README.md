# 🍃 Spring Boot Aspect-Oriented Programming (AOP) & Advanced Capabilities

A comprehensive, production-grade repository demonstrating the core principles of **Aspect-Oriented Programming (AOP)** in Spring Boot, alongside real-world integration patterns including **Spring AI Advisors**, **Vector Stores (PGVector)**, and **Cross-Cutting Concerns**.

---

## 📌 Features & Key Concepts Covered

### 1. Aspect-Oriented Programming (AOP) Core
* **JoinPoints & Pointcut Expressions:** Decoupling business logic from secondary concerns using execution and annotation-based pointcuts.
* **Advices Implementation:** Hands-on examples of `@Before`, `@After`, `@AfterReturning`, `@AfterThrowing`, and `@Around` advices.
* **Custom Annotations & Service Proxies:** Intercepting execution flows for centralized logging, execution timing, performance monitoring, and security checks.

### 2. Spring AI & Advisors Integration
* **Chat Memory Advisors:** Implementing short-term memory (`MessageWindowChatMemory`) using JDBC-backed chat memory repositories.
* **Vector Store Chat Memory:** Long-term contextual retrieval using **PGVector** for semantic memory augmentation.
* **Question-Answering Advisors:** Enterprise RAG (Retrieval-Augmented Generation) patterns over structured context documents (PDF/Knowledge bases).

---

## 🛠 Tech Stack

* **Java:** 21+ / 25
* **Framework:** Spring Boot 3.3.x, Spring AI
* **Database & Persistence:** PostgreSQL with PGVector extension, Spring Data JPA, JDBC
* **LLM Orchestration:** Ollama (`qwen2.5-coder`, `nomic-embed-text`)
* **Build Tool:** Apache Maven

---

## 🚀 Getting Started

### Prerequisites

1. **PostgreSQL with PGVector installed & running locally:**
   ```sql
   CREATE EXTENSION IF NOT EXISTS vector;
