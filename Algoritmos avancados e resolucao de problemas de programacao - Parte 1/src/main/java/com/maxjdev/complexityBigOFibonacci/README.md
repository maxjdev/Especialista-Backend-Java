<div align="center">

## Calculo de complexidade
</div>
<hr>
<br>

| Classe                       | Complexidade de tempo | Justificativa                                                                                                        |
|------------------------------|-----------------------|----------------------------------------------------------------------------------------------------------------------|
| PurelyRecursiveFibonacci     | O(2^n)                | A cada chamada da função, a mesma se chama recursivamente 2 vezes aumentando exponencialmente o número de operações. |
| DynamicProgrammingFibonacci  | O(n)                  | O Número de calculos realizados é bem menor já que resultados calculados anteriormente estão salvos no array.        |
<hr>

<div align="center">

## Comparações: <i>Programação Dinâmica x Recursiva</i>
</div>

#### <i><b>R: </b></i>As principais diferenças entre soluções com programação dinâmica e puramente recursiva são:

- Uso de memória: Usando PD é necessario mais memória pela necessidade de armazenar calculos anteriores, já com recursão há um grande risco de estourar a pilha de execução pois a alocação de memória não é finita.
- Eficiência de tempo: Na recursão são feitas redundantes são feitas em excesso, resultando em um grande número de operações, já na PD a eficiência de tempo de execução é melhor devido a tabela de memoização.
- Escalabilidade: a PD é mais escalável para entradas maiores já que sua complexidade acaba sendo linear, já a recursão pura tem problemas de desempenho a medida que a entrada aumenta pelo excesso de chamadas e o crescimento exponencial do tempo.

PD = Programação Dinâmica