Desafio desenvolvido para práticas de POO com Java!

---

# 💳 Sistema de Registro de Compras no Cartão de Crédito

Projeto desenvolvido como parte do desafio da **Alura**, simulando o controle de compras em um cartão de crédito utilizando Java.

---

## ✅ Descrição do Projeto

Este programa permite registrar compras feitas em um cartão de crédito, verificando o limite disponível e exibindo as compras realizadas em ordem crescente de valor.

O usuário informa:

* Limite inicial do cartão
* Descrição da compra
* Valor da compra

O sistema então:

* ✅ Registra a compra se houver limite disponível
* ❌ Bloqueia caso o saldo seja insuficiente

Ao final, o programa exibe:

* Lista de compras realizadas (ordenadas pelo valor)
* Saldo restante no cartão

---

## 🎯 Objetivos do Desafio

* Criar uma classe `Compra` com descrição e valor
* Criar uma classe `CartaoDeCredito` com:

  * Limite
  * Saldo
  * Lista de compras
  * Método para registrar compra
* Criar a classe principal com:

  * Entrada de dados via `Scanner`
  * Laço para registrar múltiplas compras
  * Ordenação das compras
  * Exibição do saldo final

---

## 🛠️ Tecnologias Utilizadas

* Java
* Scanner para input
* Collections e Comparator para ordenação
* Programação Orientada a Objetos (POO)

---

## 📂 Estrutura

```
src/
 ├── Compra.java
 ├── CartaoDeCredito.java
 └── Menu.java
```

---

## ▶️ Como Executar

Clone este repositório:

```bash
git clone https://github.com/usuario/repositorio.git
```

Compile e execute:

```bash
javac Menu.java
java Menu
```

---

## 📌 O que foi praticado

* Entrada de dados com `Scanner`
* Construtores em classes
* Encapsulamento
* Estruturas de repetição
* Ordenação de listas
* Regras de negócio
* POO com Java

---

## 🚀 Possíveis Melhorias Futuras

* Interface gráfica (JavaFX)
* Persistência das compras em arquivo
* API REST para registro de compras
* Sistema com login e múltiplos cartões

---

## 👤 Autor

Desafio realizado como parte da formação em Java na **Alura**.

---

