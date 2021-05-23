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

### 46. Teste de mesa com estrutura repetitiva (while)

### 49. Exercícios (while)

### 50. Estrutura repetitiva (for)

### 51. Teste de mesa com estrutura repetitiva for

### 52. Exercícios de testes de mesa com for

### 54. Exercícios (for)

### 55. Estrutura repetitiva (do-while)

Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.

### 57. Restrições e convenções para nomes

• Não pode começar com dígito: use uma letra ou _
• Não usar acentos ou til
• Não pode ter espaço em branco
• Sugestão: use nomes que tenham um significado

Convenções
• Camel Case: lastName
• pacotes
• atributos
• métodos
• variáveis e parâmetros
• Pascal Case: ProductService
• classes

### 58. Operadores bitwise

### 59. Funções interessantes para String

• Formatar: toLowerCase(), toUpperCase(), trim()
• Recortar: substring(inicio), substring(inicio, fim)
• Substituir: Replace(char, char), Replace(string, string)
• Buscar: IndexOf, LastIndexOf
• str.Split(" ")

### 60. Comentários em Java (básico)

### 61. Funções (sintaxe)
• Representam um processamento que possui um significado
  • Math.sqrt(double)
  • System.out.println(string)

• Principais vantagens: modularização, delegação e reaproveitamento

• Dados de entrada e saída
  • Funções podem receber dados de entrada (parâmetros ou argumentos)
  • Funções podem ou não retornar uma saída

• Em orientação a objetos, funções em classes recebem o nome de "métodos"

### 64. Resolvendo um problema sem orientação a objetos

### 65. Criando uma classe com três atributos para representar melhor o triângulo

Classe
  • É um tipo estruturado que pode conter (membros):
  • Atributos (dados / campos)
  • Métodos (funções / operações)
  
  • A classe também pode prover muitos outros recursos, tais como:
    • Construtores
    • Sobrecarga
    • Encapsulamento
    • Herança
    • Polimorfismo
  
  • Exemplos:
    • Entidades: Produto, Cliente, Triangulo
    • Serviços: ProdutoService, ClienteService, EmailService, StorageService
    • Controladores: ProdutoController, ClienteController
    • Utilitários: Calculadora, Compactador
    • Outros (views, repositórios, gerenciadores, etc.)

### 66. Criando um método para obtermos os benefícios de reaproveitamento e delegação

Quais são os benefícios de se calcular a área de um triângulo por meio de um MÉTODO dentro da CLASSE Triangle?

1) Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal.

2) Delegação de responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo. A lógica do cálculo
da área não deve estar em outro lugar.

### 67. Começando a resolver um segundo problema exemplo

Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:
  • Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque)<br>
  • Realizar uma entrada no estoque e mostrar novamente os dados do produto<br>
  • Realizar uma saída no estoque e mostrar novamente os dados do produto<br>

### 68. Object e toString

Toda classe em Java é uma subclasse da classe Object

Object possui os seguintes métodos:
  getClass- retorna o tipo do objeto
  equals - compara se o objeto é igual a outro
  hashCode - retorna um código hash do objeto
  toString - converte o objeto para string(exercício 67)

  Lembrar:
  String.format("%.2f", price)

### 69. Finalizando o programa

### 70. Exercicio de Fixacao

Rectangle, Employee, Student

### 71. Membros estáticos 

São membros que fazem sentido independentemente de objetos. Não precisam de objeto para serem chamados. São chamados a partir do
próprio nome da classe.

Ao criar a classe Calculator, caso não crie os métodos estáticos, será necessário instanciar a classe no programa principal;

Uma classe que possui somente membros estáticos, pode ser uma classe estática também. Esta classe não poderá ser instanciada.

### 73. Exercício conversão dolar

### 76. Construtores

• É uma operação especial da classe, que executa no momento da instanciação do objeto;

• Usos comuns:
  • Iniciar valores dos atributos;
  • Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência);

• Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão: Product p = new Product();

• É possível especificar mais de um construtor na mesma classe (sobrecarga);

### 77. Palavra this

• É uma referência para o próprio objeto;

• Usos comuns:
  • Diferenciar atributos de variáveis locais;
  • Passar o próprio objeto como argumento na chamada de um método ou construtor;

### 78. Sobrecarga

• É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome, porém com diferentes listas de parâmetros.

### 79. Encapsulamento

• É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas operações seguras e que mantenham os objetos em um estado consistente.
• Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

