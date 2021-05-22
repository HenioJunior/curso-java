# Java

### 24. Saída de dados em Java

### 25. Processamento de dados em Java, Casting

<variável> = <expressão>

REGRA:
1) A expressão é calculada;
2) O resultado da expressão é armazenado na variável;

Sempre indique o tipo do número, se a expressão for de ponto flutuante (não inteira).
Para double use: .0
Para float use: f

Casting
É a conversão explícita de um tipo para outro.
É necessário quando o compilador não é capaz de “adivinhar” que o resultado de uma expressão deve ser de outro tipo.

### 27. Entrada de dados em Java

Para ler uma palavra: x = sc.next();

Para ler um número inteiro: x = sc.nextInt();

Para ler um número com ponto flutuante: x = sc.nextDouble();

Para ler um caractere: x = sc.next().charAt(0);

Para ler vários dados na mesma linha:
x = sc.next() -> Lê somente uma palavra.
y = sc.nextInt();
z = sc.nextDouble();

Para ler um texto ATÉ A QUEBRA DE LINHA:
sc.nextLine() -> Lê a linha inteira


ATENÇÃO: quebra de linha pendente

Quando você usa um comando de leitura diferente do nextLine() e dá alguma quebra de linha, essa quebra de linha fica "pendente" na entrada padrão.

Se você então fizer um nextLine(), aquela quebra de linha pendente será absorvida pelo nextLine().

Solução:
Faça um nextLine() extra antes de fazer o nextLine() de seu interesse.

### 28. Funções matemáticas em Java

### 30. Exercícios

### 33. Expressões comparativas

### 34. Expressões lógicas

### 35. Estrutura condicional (if-else)

### 37. Exercícios

### 38. Sintaxe opcional - operadores de atribuição cumulativa

### 39. Sintaxe opcional - switch-case

Quando se tem várias opções de fluxo a serem tratadas com base no valor de uma variável, ao invés de várias estruturas if-else encadeadas, alguns preferem utilizar a estrutura switch-case.

### 40. Expressão condicional ternária

Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.
Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso

### 41. Escopo e inicialização

• Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
• Uma variável não pode ser usada se não for iniciada.

### 45. Estrutura repetitiva enquanto (while)

É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.

Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.

### 46. Teste de mesa com estrutura repetitiva enquanto

### 49. Exercícios - while

### 50. Estrutura repetitiva for

### 51. Teste de mesa com estrutura repetitiva for

### 52. Exercícios de testes de mesa com for

### 54. Exercícios (for)



