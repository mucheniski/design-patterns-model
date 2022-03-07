# design-patterns

## Strategy  
O Strategy é um padrão que deve ser utilizado quando uma classe possuir
diversos algoritmos que possam ser utilizados de forma intercambiável. A solução
proposta pelo padrão consiste em delegar a execução do algoritmo para uma instância
que compõe a classe principal. Dessa forma, quando a funcionalidade for
invocada, nomomento de execução do algoritmo, será invocado ummétodo da instância
que a compõe. A Figura 1.4 apresenta um diagrama que mostra a estrutura
básica do padrão.

![](/img/Strategy.png)  


## Null Object  
O padrão Null Object [27] propõe a criação de uma classe para representar  
objetos nulos em uma aplicação. Essa classe deve estender a classe original e implementar  
seus métodos de forma a executar o comportamento esperado da aplicação  
quando um valor nulo for recebido. Dessa forma, em vez de se retornar um valor  
nulo, retorna-se uma instância dessa nova classe.  

