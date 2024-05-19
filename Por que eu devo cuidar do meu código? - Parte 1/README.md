<div align="center">

# Tarefas do módulo: <i>Por que eu devo cuidar do meu código? - Parte 1</i>

</div>
<hr>
<br>

## Exercício 1 – Importância de se escrever código limpo

### Explique, com suas palavras, por que os seguintes princípios de código limpo são importantes:

- 1- Usar nomenclatura adequada
- <b>R:</b> Um nome de classe, método ou variável deve ser expressivo e auto-descritivo, se precisar ser explicado, está seguindo o princípio da nomenclatura.
Facilita o entendimento, manutenção e legibilidade.
<hr>

- 2- Resolver os problemas na causa raiz
- <b>R:</b> Resolver os problemas pela causa raiz é necessário para evitar que volte a acontecer.
Se resolver somente os sintomas, o mesmo problema pode surgir de outras formas.
<hr>

- 3- Seguir a política do escoteiro
- <b>R:</b> Deixar o local melhor que quando você o encontrou, é auto-descritivo, deixar um código mais limpo que antes é uma forma organizada de se trabalhar e também promove mais legibilidade, o que só traz benefícios.

<hr>
<br>

## Exercício 2 – Princípios de código limpo

### Para cada uma das assinaturas de método abaixo, explique qual o princípio de código limpo que eles estão ferindo:
<br>

```java
private void somaNumeros(int a, int b, int c, int d, int e, int f);
```
- <b>R:</b> Fere os princípios das funções pequenas, coesão e simplicidade. O Excesso de argumentos,
torna o código menos legível e coeso.
<hr>

```java
private void oPaiTaOn();
```
- <b>R:</b> Fere o princípio da nomenclatura adequada, não é legível o motivo da existência ou o que faz.
<hr>

```java
private double checaSaldoEAtualiza(long userId, double value);
```
- <b>R:</b> Fere o princípio de responsabilidade única(SRP), uma função deve ter apenas uma razão responsabilidade, isso promove coesão e desacoplamento.
<hr>