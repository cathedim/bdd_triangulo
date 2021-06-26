package triangulo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrianguloTest {
    Triangulo triangulo;

    @BeforeEach
    public void inicializa() {
        triangulo = new Triangulo();
    }

    @Test
    public void testTriangoValido() {
        assertTrue(false == triangulo.ehValido(12, 7, 20));
        assertTrue(true == triangulo.ehValido(10, 7, 15));
    }

    @Test
    public void testTriangoEquilatero() {
        assertEquals("O triangulo eh equilatero", triangulo.verificaTriangulo(6, 6, 6));
    }

    @Test
    public void testTriangoIsosceles() {
        assertEquals("O triangulo eh isosceles", triangulo.verificaTriangulo(6, 4, 6));
    }
    @Test

    public void testTriangoEscaleno() {
        assertEquals("O triangulo eh escaleno", triangulo.verificaTriangulo(4, 5, 6));
    }

    @Test
    public void testNaoEhTriangulo() {
        assertTrue("Nao eh um triangulo" == triangulo.verificaTriangulo(2, 4, 6));
    }
}
