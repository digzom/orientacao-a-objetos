# Laboratório de Orientação a Objetos

- Objeto -> Guarda dentro de si os dados e o códigos dos dados. Ao invés de dados espalhados, temos os dados separados, encapsulados junto com o código que manipula esses dados. Isso é um objeto.
- Dados -> Variáveis e atributos
- Código -> Funções e métodos
- Uma classe é uma fábrica de objetos. Instanciação de objetos.

**Quando um método de uma classe A está chamando a execução de um método de uma classe B, esse método da classe A está enviando uma mensagem**. Enviando "pula" para o método da classe B, ele procurará um método com esse nome para executá-lo. O método executado pode ou não retornar alguma mensagem.

Quando o sistema cria a classe bola, **a classe já aloca memória para suas variáveis de classe**. Dessa forma, os valores das variáveis de classe são _compartilhados_ entre as instâncias das classes. Já para as variáveis de instância, a memória não é alocada na definição da classe, mas na instanciação do objeto da classe.

## Herança 

Herança é uma forma de evitar duplicação e promover o reúso de código. Quando uma classe herda da outra, ela pode herdar certos atributos e adicionar os seus próprios. A relação entre herança é "é-um". Se a Classe B herda da Classe A, dizemos que Classe B é uma Classe A. É possível reimplementar certos atributos/métodos da classe mãe.

Quando, a partir da classe filha, chamamos um método, a linguagem vai primeiro procurar o método no escopo mais próximo (na classe que está invocando o método). Se não existir, será buscado na classe mãe.

Superclasse -> Subclasse => Especialização
Subclasse -> Superclasse => Generalização

**This** referencia o próprio objeto/classe. Com ele podemos 
UML -> útil para definir arquitetura de sistemas; 

## Linguagens interpretadas vs compiladas

Linguagem de máquina (binário) -> linguagem de montagem (assembly) -> linguagens de alto nível (FORTRAN, LISP) 

### Linguagens interpretadas

1. Escreve o código fonte num arquivo texto
2. Esse arquivo é dado como entrada para um programa chamado interpretador
3. O interpretador lê uma linha por vez e interpreta a linha e traduz para linguagem de máquina e executa
4. O programa gera saídas

### Linguagens compiladas

1. Código fonte
2. É dado como entrada para um programa chamado compilador
3. Gera um "código objeto" (por isso a saída .o de C), que é linguagem de máquina
4. Depois esse código objeto é executado por um outro programa (geralmente o sistema operacional) 
5. Por isso falamos em "checagem em tempo de compilação", para compilar, o programa precisa estar correto nos termos da compilação esperada

-- Linguagens híbridas

Java e python são assim

1. O compilador traduz o código-fonte para bytecode (linguagem dos criadores do java, parecido com assembly). 
2. Ele é gravado num arquivo .class.
3. Para executar o programa, será usado um programa interpretador de java (na JVM) que vai ler os bytecodes, converter para linguagem de máquina e executar.

## Filosofia do java

***Write once, run everywhere***.

- Rodar em vários tipos diferentes de máquinas e SOs
- Linguagem para a internet

Ao escrever um programa, escrevemos para a máquina virtual do java ao invés de escrever para a nossa máquina. Então qualquer computador com a JVM poderia rodar o programa em java independente da arquitetura do processador ou sistema operacional. Existe uma JVM para android, outra para pc, outra para relógio, etc.

A JVM de um processador terá o JRE, que terá validação do bytecode, o interpretador JIT compiler, o garbage collector e as bibliotecas padrão do Java.

Outras linguagens criaram linguagens para gerar bytecode (existe em python, clojure)

A maioria das linguagens hoje são híbridas.

Métodos são funções dentro do escopo de uma classe.

**Prefira usar delegação ao invés de herança**

Ex.: Num sistema de logging e eu quero um log específico, é possível criar uma subclasse específica que herda da superclasse de log geral. Isso amarra o código. O que pode ser feito é delegar a impressão das diferentes strings de logs para uma classe separada. Assim uma classe não dependerá da outra.

**Encapsulamento e Modularização**

Agrupar código, api da classe (métodos privados são mais flexíveis para mudança). Uma classe não deve mexer nos atributos de classe de outra classe. 

**Coesão** -> As classes precisam ter apenas uma responsabilidade (princípio da responsabilidade única);

**Acoplamento é ruim** -> O quanto uma classe "conhece" ou mesmo "depende" do seu entorno; o quanto aponta, faz referência ou uma nomes de métodos ou outras classes. Quanto mais acoplado, menos flexível a classe será; é bom que classes sejam mais genéricas do que específicas. "Program to an interface, not an implementation".

## Linguagens Estáticas

Java, C, Pascal, Scala.

- É preciso declarar variáveis antes de usá-las:

```java
int variable;
```

- É preciso definir os tipos dos métodos e das variáveis;
- É possível identificar erros em tempo de compilação;

## Linguagens Dinâmicas

Lisp, Lua, Python, Elixir, Javascript.

- Não é preciso declarar as variáveis;
- A variável não precisa de anotação de tipo;
- A checagem de tipo só é feito em runtime;

```python
x = 32
carro = Carro()
```

## Outras características de linguagens dinâmicas

Enquanto linguagens estáticas geralmente são executadas utilizando um compilador, linguagens dinâmicas usam um interpretador.

- Capacidade de executar trechos da linguagem em tempo de execuação;

```python
exec("print('hello')")
```

- Reflexão computacional
  - Alterar estrutura do código em tempo de execução
  - Consultar a estrutura em tempo de execução.
- Gestão automática de memória
  - Garbbage Collector

## Coleções

- Implementam o tipo Iterable
  - Stack
  - ArrayList
  - List
  - LinkedList
- ArrayList -> se eu uso List.get(8), ele vai no sétimo elemento do array e pega; se eu ficar um get numa LinkedList, ele precisa percorrer os elementos (os apontadores) para achar o elemento que eu escolhi.
- É possível criar uma classe própria e implementar um for (desde que a classe ou método implemente a interface Iterable) e chamar o método para uma estrutura de dados específica. Tipo Protocols.
- 





