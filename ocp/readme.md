Open-closed Principle

Neste exemplo foram feitas classes para um sistema bancário básico.
A classe abstrata ContaBancaria possui um saldo, id, e dois métodos
abstratos: depositar e sacar, além dos getters e setters.

A conta basic não fornece nada de especial ao depositar ou
sacar; já a conta plus fornece um rendimento de 0.5% em cima do valor
do depósito. Esses comportamentos são implementados pelas expansões
da classe ContaBancaria: ContaBasic e ContaPlus.

O OCP é obedecido pois a classe base não é modificada caso
seja necessário expandir seu comportamento.
