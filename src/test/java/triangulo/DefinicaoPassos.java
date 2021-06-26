package triangulo;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Classe de implementação de BDD
public class DefinicaoPassos {

    Triangulo triangulo;
    String tipoTriangulo;

    @Dado("Que o meu triângulo esteja inicializado")
    public void queOMeuTriânguloEstejaInicializado() {
        triangulo = new Triangulo();
    }

    //Primeiro cenário, encontrar triângulo equilátero
    @Quando("Eu verifico o triângulo de lados iguais")
    public void euVerificoOTriânguloDeLadosIguais() {
        tipoTriangulo = triangulo.verificaTriangulo(6, 6, 6);
    }

    @Entao("Eu descubro que é um triângulo equilátero")
    public void euDescubroQueEUmTriânguloEquilatero() {
        assertEquals("O triangulo eh equilatero", tipoTriangulo);
    }

    //Segundo cenário, encontrar triângulo isósceles
    @Quando("Eu verifico o triângulo de dois lados iguais")
    public void euVerificoOTriânguloDeDoisLadosIguais() {
        tipoTriangulo = triangulo.verificaTriangulo(6, 4, 6);
    }

    @Entao("Eu descubro que é um triângulo isósceles")
    public void euDescubroQueÉUmTriânguloIsósceles() {
        assertEquals("O triangulo eh isosceles", tipoTriangulo);
    }

    //Terceiro cenário, encontrar triângulo escaleno
    @Quando("Eu verifico o triângulo de lados diferentes")
    public void euVerificoOTriânguloDeLadosDiferentes() {
        tipoTriangulo = triangulo.verificaTriangulo(4, 5, 6);
    }

    @Entao("Eu descubro que é um triângulo escaleno")
    public void euDescubroQueÉUmTriânguloEscaleno() {
        assertEquals("O triangulo eh escaleno", tipoTriangulo);
    }

    //Quarto cenário, não é um triângulo
    @Quando("Eu verifico o triângulo")
    public void euVerificoOTriângulo() {
        tipoTriangulo = triangulo.verificaTriangulo(2, 4, 6);
    }

    @Entao("Eu descubro que não é um triângulo")
    public void euDescubroQueNãoÉUmTriângulo() {
        assertTrue("Nao eh um triangulo" == tipoTriangulo);
    }
}
