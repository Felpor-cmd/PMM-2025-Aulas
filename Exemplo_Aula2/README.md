
# Exemplo Aula 2 - Java

Este exemplo demonstra um programa simples em Java que realiza as seguintes operações:

1. Solicita ao usuário a quantidade de valores que deseja inserir.
2. Lê os valores inteiros informados pelo usuário e armazena em um vetor.
3. Calcula a soma de todos os valores inseridos.
4. Calcula a média dos valores.
5. Exibe a soma e a média na tela.

## Como funciona

O programa utiliza a classe `Scanner` para ler entradas do usuário. O fluxo principal é:

- O usuário informa quantos números deseja inserir.
- Para cada número, o programa solicita o valor e armazena em um vetor.
- Após a leitura, o programa soma todos os valores e calcula a média.
- Por fim, exibe o resultado da soma e da média.

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
Este exemplo serve para ilustrar conceitos básicos de entrada de dados, manipulação de vetores, soma e média em Java, dentro do contexto da disciplina de Programação Modular.
