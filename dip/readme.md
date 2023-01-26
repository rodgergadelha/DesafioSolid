Dependecy Inversion Principle

Nesse exemplo eu refatorei o projeto da pasta srp. Fiz uma interface
IEstoqueService e substituí as linhas de PedidoService em que havia
chamadas dos métodos de EstoqueServices (linhas 11 e 28) para linhas
que fazem chamadas dos métodos abstratos de IEstoqueServices. Assim,
a classe PedidoServices e os métodos adicionarItem e retirarItem passam
a depender da interface IEstoqueService.