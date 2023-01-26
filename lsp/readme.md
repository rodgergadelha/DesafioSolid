Liskov-Substitution Principle

Aqui eu adicionei algumas classes a mais ao exemplo do ocp.
A classe Banco possui um ArrayList de contas do tipo ContaBancaria,
onde pode ser armazenado qualquer objeto que herde de ContaBancaria.

A classe TransacaoBanco possui métodos de saque e deposito, que são
feitos dados um objeto do tipo Banco e um id de conta. O princípio
da substituição de Liskov é obedecido pois objetos derivados de
ContaBancaria substituem objetos do tipo ContaBancaria sem prejudicar
o funcionamento da aplicação.