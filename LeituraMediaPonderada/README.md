
# Leitura e Cálculo de Média Ponderada - Java

Este exemplo apresenta um programa em Java que realiza as seguintes operações:

1. Lê notas de exercícios, provas e trabalhos informadas pelo usuário.
2. Calcula a média ponderada de cada categoria, considerando pesos específicos.
3. Calcula e exibe a nota final do aluno.

## Como funciona

O programa utiliza a classe `Scanner` para ler as notas do usuário. O fluxo principal é:

- Lê 4 notas de exercícios (máximo 10 cada), 2 notas de provas (máximo 100 cada) e 1 nota de trabalho (máximo 20).
- Calcula a média de cada categoria e aplica o peso correspondente:
  - Exercícios: peso 0.2
  - Provas: peso 0.6
  - Trabalho: peso 0.2
- A nota final é calculada somando as médias ponderadas e multiplicando por 100.
- Exibe a nota final formatada com duas casas decimais.

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
Este exemplo serve para ilustrar conceitos de entrada de dados, manipulação de vetores, cálculo de médias e uso de pesos em Java, dentro do contexto da disciplina de Programação Modular.
