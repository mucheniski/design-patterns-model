# design-patterns

## Strategy  
O Strategy é um padrão que deve ser utilizado quando uma classe possuir
diversos algoritmos que possam ser utilizados de forma intercambiável. A solução
proposta pelo padrão consiste em delegar a execução do algoritmo para uma instância
que compõe a classe principal. Dessa forma, quando a funcionalidade for
invocada, nomomento de execução do algoritmo, será invocado um método da instância
que a compõe. A Figura 1.4 apresenta um diagrama que mostra a estrutura
básica do padrão.

![](/img/Strategy.png)  


## Null Object  
O padrão Null Object [27] propõe a criação de uma classe para representar  
objetos nulos em uma aplicação. Essa classe deve estender a classe original e implementar  
seus métodos de forma a executar o comportamento esperado da aplicação  
quando um valor nulo for recebido. Dessa forma, em vez de se retornar um valor  
nulo, retorna-se uma instância dessa nova classe.  


## Template method  
A Figura 2.1 representa o conceito de hookmethod. A superclasse possui um método
principal público que é invocado pelos seus clientes. Esse método delega parte
de sua execução para o hook method, que é um método abstrato que deve ser implementado
pela subclasse. Ele funciona como um “gancho” no qual uma nova lógica
de execução para a classe pode ser “pendurada”. Cada subclasse o implementa provendo
uma lógica diferente. Como essa lógica pode ser invocada a partir do mesmo
método público, definido na superclasse, os hook methods permitem que o objeto
possua um comportamento diferente de acordo com a subclasse instanciada.  
![](/img/hookmethods.png)  

O principal padrão que utiliza hook methods como técnica é o Template
Method. Este padrão é aplicável quando se deseja definir um algoritmo geral, que
estabelece uma série de passos para cumprir um requisito da aplicação. Porém, seus
passos podem variar e é desejável que a estrutura da implementação forneça uma
forma para que eles sejam facilmente substituídos.  
Como por exemplo um template de documento, onde temos o modelo, porém as informações são diferentes, dependendo do documento.  
De forma similar, um Template Method é um modelo de algoritmo que possui
algumas partes fixas e algumas partes variáveis.  
![](/img/TemplateMethodDocumento.png)  

A Figura 2.3 apresenta a estrutura do padrão Template Method. A
ClasseAbstrata representa a superclasse que implementa o TemplateMethod
e que define quais são os hook methods. A ClasseConcreta representa a classe
que herda o Template Method da ClasseAbstrata e define uma implementação
concreta dos hook methods. A classe representada como Cliente invoca o
metodoTemplate(). Observe que apesar do tipo da variável ser do tipo da classe
abstrata, o tipo instanciado é o da subclasse que implementa os passos concretos do
algoritmo.
![](/img/TemplateMethodExample.png)  

