## Questão do exercício

#### Explique as diferenças entre a solução do exercício 1(recursão) e 2(programação dinâmica).

- <b>R: </b>A Principal diferença entre as soluções usando recursão e programação dinâmica 
para cálculo fatorial é a eficiência no uso de memória. Usando recursão se repete desnecessariamente
os mesmos calculos, usando programação dinâmica independente de ser com Top-Down ou Bottom-Up não
tem essa necessidade, pois os resultados anteriores ficam reservados para próximos reusos.
<br>obs: A Programação dinâmica pode adicionar um pouco mais de complexidade nas implementações,
porém evita o conhecido erro "Stack Overflow" ou "Estouro de Pilha".