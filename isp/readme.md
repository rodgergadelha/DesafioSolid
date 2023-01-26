Interface Segregation Principle

Nesse exemplo eu fiz algumas classes para um jogo
de rpg básico. A classe Entidade representa uma entidade
do jogo, que contém pontos de vida e pontos de dano. Essa
classe é abstrata pois dela derivam os personagens do jogo,
como o jogador e os monstros.

Cada ser desse jogo pode ter habilidades como atacar, voar,
mover e falar. Como nem todos os seres possuem todas essas
habilidades combinadas, optei por separá-las em várias
interfaces, cada uma representando uma habilidade.

Por exemplo, a classe Dragao representa um ser que
pode voar e se mover. Assim, essa classe implementa
as interfaces IMovel e IVoador, além de herdar também
a classe abstrata Entidade.