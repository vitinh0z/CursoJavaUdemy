# Meus Projetos e Exercícios do Curso de Java da Udemy

Bem-vindo ao meu repositório de estudos de Java! Este espaço é dedicado a armazenar todos os exercícios, projetos e anotações que desenvolvi durante o curso de Java na plataforma Udemy. O objetivo é registrar meu progresso e criar um portfólio prático com os conceitos aprendidos.

## 🚀 Sobre o Repositório

Este repositório contém uma coleção de pequenos projetos e algoritmos que abordam desde os fundamentos da linguagem Java até tópicos mais avançados de Orientação a Objetos. Cada pasta representa um conceito ou um módulo específico do curso.

## 📚 Tópicos Abordados

A estrutura de pastas reflete os principais temas estudados. Aqui estão alguns dos conceitos que você encontrará nos projetos:

* **Sintaxe Básica:**
    * Manipulação de Strings (`FunçõesParaString`).
    * Estruturas de controle e lógica.

* **Orientação a Objetos (OOP):**
    * Criação de Classes e Objetos (`Triangulo`, `Produto`, `Funcionario`).
    * Construtores, Sobrecarga e Encapsulamento.
    * Membros estáticos (`MetodosEstaticos`).

* **Estruturas de Dados:**
    * **Vetores (Arrays):** Exercícios de média, números negativos, dados de pessoas, etc.
    * **Listas:** Uso de `ArrayList`, manipulação de listas, expressões lambda e `stream`.
    * **Matrizes:** Lógica para manipulação de matrizes bidimensionais.

* **Pilares da OOP:**
    * **Herança:** Relacionamentos entre superclasses e subclasses (`Animal`, `Pessoa`, `Account`).
    * **Polimorfismo:** Sobrescrita de métodos (`@Override`).
    * **Composição:** Relação "tem-um" entre objetos (`Pedido` contendo `Cliente` e `ItensPedido`).

* **Tópicos Adicionais:**
    * **Enumerações (`enum`):** Criação de tipos seguros como `StatusPedido`.
    * **Upcasting e Downcasting:** Conversão de tipos entre classes na herança.
    * **Boxing e Unboxing:** Uso de Wrapper Classes.

## ✨ Projetos em Destaque

Alguns projetos mais completos que demonstram a combinação de vários conceitos:

### 1. 📝 Lista de Tarefas (`Listas/ListaDeTarefas`)
Um sistema de gerenciamento de tarefas via console.
* **Funcionalidades:** Adicionar, editar e excluir tarefas.
* **Conceitos aplicados:** `ArrayList`, manipulação de objetos, entrada de dados com `Scanner`, e organização do código em múltiplas classes.

### 2. 🛍️ Sistema de Pedidos (`Composicao/PedidoCliente`)
Simulação de um sistema de e-commerce para registrar pedidos de clientes.
* **Funcionalidades:** Cadastra um cliente, um pedido e múltiplos itens dentro desse pedido.
* **Conceitos aplicados:** **Composição** (um `Pedido` "tem-um" `Cliente` e "tem-vários" `ItensPedido`), `enum` para o status do pedido, e formatação de datas.

### 3. 🔐 Gerador de Senhas (`GeradorDeSenha`)
Uma ferramenta de console para gerar senhas seguras com base em critérios definidos pelo usuário.
* **Funcionalidades:** O usuário escolhe o tamanho da senha e os tipos de caracteres a incluir (maiúsculas, minúsculas, números, símbolos). A senha gerada é salva em um arquivo `senha.txt`.
* **Conceitos aplicados:** Manipulação de Strings, lógica condicional, `Random` para aleatoriedade e manipulação de arquivos (`FileWriter`).

## ⚙️ Como Executar um Projeto

A maioria dos projetos pode ser executada diretamente pela linha de comando. Siga os passos abaixo como exemplo:

1.  **Navegue até a pasta do projeto:**
    ```bash
    cd OrientaçãoAObjetos/Exercicios/
    ```
2.  **Compile os arquivos `.java`:**
    ```bash
    javac Triangulo.java areaTrianguloSemOOP.java
    ```
3.  **Execute a classe principal que contém o método `main`:**
    ```bash
    java areaTrianguloSemOOP
    ```
