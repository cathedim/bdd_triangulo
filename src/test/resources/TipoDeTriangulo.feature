# language: pt

  Funcionalidade: Descobrir qual o tipo de triângulo

    Contexto:
      Dado Que o meu triângulo esteja inicializado

    Cenário: Descobrir o tipo de triângulo dado 3 números iguais
      Quando Eu verifico o triângulo de lados iguais
      Entao Eu descubro que é um triângulo equilátero

    Cenário: Descobrir o tipo de triângulo dado 2 números iguais
      Quando Eu verifico o triângulo de dois lados iguais
      Entao Eu descubro que é um triângulo isósceles

    Cenario: Descobrir o tipo de triângulo dado 3 números diferentes
      Quando Eu verifico o triângulo de lados diferentes
      Entao Eu descubro que é um triângulo escaleno

    Cenario: Inserir 3 números e não formar um triângulo
      Quando Eu verifico o triângulo
      Entao Eu descubro que não é um triângulo