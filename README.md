# Design-Patterns-Strategy-Java

Esse projeto tem intuito de esclarecer quando utilizar o Padrão de Projeto Strategy e suas vantagens e desvantagens de forma simplificada e clara.  

Apesar do código exposto no problema inicial ser bem claro e simples de entender, ele pode se tornar um grande problema. Por exemplo, o Correios tem mais que esses dois métodos de entrega, então teríamos que ter vários IF/ELSE para saber qual o método de envio para Calcular o Frete. Além disso, dentro desses IF/ELSE teríamos ainda mais linhas de código para verificar o peso, fragilidade da mercadoria, pois tudo isso contribui para o FRETE. O Resultado seria um método gigantesco, contendo toda lógica de forma bagunçada e isso é péssimo para manter.  

Strategy  Quando utilizar?  

O Strategy é um padrão que deve ser utilizando quando uma classe possuir diversos algoritmos que possam ser utilizados. No nosso exemplo, poderia facilmente ter vários algoritmos para calcular o Frete e deixar tudo isso no mesmo método não é uma solução escalável.

Vantagens: 
+ Lógica na classe principal reduzida; 
+ Eliminação de várias condicionais (IF/ELSE); 
+ Implementação poder ser trocada em tempo de execução; 

Desvantagens: 
+ Aumento da complexidade na criação do projeto; 
+ Aumento do número de classes
