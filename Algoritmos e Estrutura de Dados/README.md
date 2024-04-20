# Tarefas do módulo: <i>Algoritmos e Estrutura de Dados</i>:

#### 1- Implementar uma classe que represente a estrutura de dados <u>Pilha de inteiros</u> e deverá conter os métodos:

- <b>push(Node newNode) : <i>void</i></b> ---> Adiciona um novo nó ao topo da pilha.
- <b>pop( ) : <i>Node</i></b> ---> Remove o nó do topo da pilha e retorna o mesmo.
- <b>top( ) : <i>Node</i></b> ---> Recupera o nó que está no topo(sem alterar).
- <b>isEmpty( ) : <i>boolean</i></b> ---> Retorna um boolean se a pilha está vazia.
- <b>size( ) : <i>int</i></b> ---> Retorna o tamanho da pilha.

#### 2- Implementar uma classe que represente a estrutura de dados <u>Fila FIFO de inteiros</u> e deverá conter os métodos:

- <b>enqueue(Node newNode) : <i>Node</i></b> ---> Adiciona um nó a fila.
- <b>dequeue( ) : <i>void</i></b> ---> Remove um nó da fila.
- <b>rear( ) : <i>Node</i></b> ---> Retorna o nó que está no fim da fila.
- <b>front( ) : <i>Node</i></b> ---> Retorna o nó que está na frente da fila.
- <b>size( ) : <i>int</i></b> ---> Retorna o tamanho da fila.
- <b>isEmpty( ) : <i>boolean</i></b> ---> Retorna um boolean se a pilha está vazia.

#### 3- Implementar uma classe que represente a estrutura de dados <u>Lista Encadeada de inteiros</u> e deverá conter os métodos:

- <b>push(Node newNode) : <i>void</i></b> ---> Adiciona o nó ao fim da lista.
- <b>pop( ) : <i>Node</i></b> ---> Remove o nó no fim da lista e retorna o mesmo.
- <b>insert(int index, Node newNode) : <i>void</i></b> ---> Adiciona um nó na posição da lista indicada via parâmetro.
- <b>remove(int index) : <i>void</i></b> ---> Remove um nó na posição da lista indicada via parâmetro.
- <b>elementAt(int index) : <i>Node</i></b> ---> Retorna o elemento que está no índice da lista indicado via parâmetro.
- <b>size( ) : <i>int</i></b> ---> Retorna o tamanho da lista.
- <b>printList( ) : <i>void</i></b> ---> Retorna uma representação em texto da lista.

#### 4- Usando como base suas implementações dos exercícios de 1 a 3, <u>calcule a complexidade assintótica de tempo e de espaço</u> das estruturas de dados que você criou. A complexidade de tempo deverá ser calculada para os métodos definidos abaixo:

- Pilha: métodos push e pop.
- Fila: métodos enqueue, dequeue, rear e front.
- Lista encadeada: métodos push, pop, insert, remove e elementAt.

#### 5- Com base no que foi aprendido no módulo 1, implemente uma classe que represente uma estrutura de dados de <u>Mapa de Hash</u>. Sua implementação aceitará somente inteiros (chave e valor), terá tamanho fixo de 10 elementos e deverá conter os seguintes métodos:

- <b>put(int key, int value) : <i>void</i></b> ---> Adiciona o par chave/valor ao mapa.
- <b>delete(int key) : <i>int</i></b> ---> Remove o valor do topo da pilha e o retorna ao chamador.
- <b>get(int key) : <i>int</i></b> ---> Retorna o valor associado à chave passada via parâmetro.
- <b>clear( ) : <i>void</i></b> ---> Remove todos os elementos do mapa.

