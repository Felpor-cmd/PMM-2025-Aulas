
# Leitura e Filtragem de Emails por Domínio - Java

Este exemplo apresenta um programa em Java que realiza as seguintes operações:

1. Lê uma quantidade de emails informada pelo usuário.
2. Solicita e armazena os emails em um vetor.
3. Lê o domínio desejado para filtragem.
4. Filtra e exibe apenas os emails que pertencem ao domínio informado.

## Como funciona

O programa utiliza a classe `Scanner` para ler entradas do usuário. O fluxo principal é:

- O usuário informa quantos emails serão lidos.
- Para cada email, o programa solicita o valor e armazena em um vetor.
- O usuário informa o domínio para filtrar (exemplo: gmail.com).
- O programa filtra os emails que possuem o domínio informado e exibe apenas esses na tela.

## Estrutura de Pastas
- `src/`: contém o arquivo `App.java` com o código-fonte do exemplo.
- `bin/`: arquivos compilados.

## Execução
Para executar o programa:
1. Compile o arquivo `App.java`:
	```bash
	javac -d ../bin App.java
	```
2. Execute o programa:
	```bash
	java -cp ../bin App
	```

## Objetivo
Este exemplo serve para ilustrar conceitos de entrada de dados, manipulação de vetores, filtragem de informações e uso de strings em Java, dentro do contexto da disciplina de Programação Modular.
