
# Exemplo Hello World - Java

Este exemplo apresenta um programa simples em Java que realiza as seguintes operações:

1. Lê um nome informado pelo usuário via teclado.
2. Exibe na tela a mensagem "Hello, <nome>".

## Como funciona

O programa utiliza a classe `Scanner` para ler uma linha de texto do usuário. Após a leitura, concatena o nome informado à mensagem de saudação e exibe o resultado no console. Ao final, libera o recurso do scanner.

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
Este exemplo serve para ilustrar conceitos básicos de entrada de dados, manipulação de variáveis e saída de texto em Java, dentro do contexto da disciplina de Programação Modular.
