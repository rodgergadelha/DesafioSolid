Single Responsibility Principle

Neste exemplo eu desenvolvi classes para um sistema
simples de gerenciamento de estoque, onde cada classe
possui uma responsabilidade única.

Um objeto do tipo Estoque possui um ArrayList de itens
e serve para armazenar itens e suas informações; 

um objeto do tipo Item armazena informações de um item
no estoque, como preço, quantidade, código e descrição
do item;

um objeto do tipo Pedido possui um ArrayList de itens do
pedido e um objeto do tipo Cliente que possui informações
sobre o cliente que fez o pedido, como nome e cpf;

a classe EstoqueView possui um método para imprimir os dados
de cada item em um determinado objeto do tipo Estoque passado
como argumento;

a classe EstoqueService possui um método para registrar ou retirar
um item de um objeto do tipo Estoque passado como argumento;

a classe PedidoPreco possui um método para obter o preco total de
um pedido;

a classe PedidoQuantidade tem um método que calcula a quantidade
total de itens em um pedido;

a classe PedidoService possui um método para adicionar um item de
um estoque e um método para devolver um item de um pedido a um estoque;

a classe PedidoView possui um método para imprimir os dados de
cada item de um pedido e o nome do cliente que fez esse pedido.