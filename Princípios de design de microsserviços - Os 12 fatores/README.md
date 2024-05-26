<div align="center">

# Tarefas do módulo: <i>Princípios de design de microsserviços - Os 12 fatores</i>

</div>
<hr>

## Exercício 1 – Os 12 fatores

### Escolha três dos 12 fatores que estudamos em aula e explique, com suas palavras, por que eles são importantes para o desenvolvimento de microsserviços.

<b><i>R:</i> Código Base: Cada microsserviço deve ter seu próprio repositório de código para mais rastreabilidade e facilidade no gerenciamento do código-fonte da aplicação.<br><br>
Dependências: Declarar e isolar dependências explicitamente usando gerenciadores de pacote como Maven ou Gradle(considerando ambiente java), é importante para ter compatibilidade entre libs e ferramentas, garantindo mais consistência e funcionamento correto em todos os ambientes.<br><br>
Serviços de Apoio: Tratar serviços de apoio(bancos de dados, cache e outro) como recursos conectáveis, é importante para garantir manutenibilidade, a substituição do banco de dados, caso seja necessário, não deve gerar impactos no código principal.
</b>
<br>
<hr>

## Exercício 2 – CI/CD e serviços sem estado (stateless).

### Explique, com suas palavras, por que é importante desenvolver microsserviços sem estado (stateless) e porque isso pode influenciar diretamente nos mecanismos de CI/CD (integração e desenvolvimento contínuos). O que acontece se um serviço tiver estado e tivermos que matar uma de suas instâncias em produção?

<b><i>R:</i> Microsserviços stateless são mais fáceis de gerenciar e escalar, por exemplo, caso algum serviço tenha estado, além de aumentar a complexidade para o escalonamento, caso for desligado pode ocorrer perdas de dados.</b>
<br>
<hr>