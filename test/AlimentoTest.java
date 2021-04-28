package test;

import controller.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Classe respons�vel por testar a validação dos macros, lipidios e pelo nome dos alimentos
 * @author João Paulo Lima da Silva
 * @version 1.0 (28/04/2021)
 */
class AlimentoTest {
    Validador v = new Validador();
    @Test
    void testValidaMacros() {
        assertTrue(v.validaMacros("2"));
        assertFalse(v.validaMacros("x"));
    }
    @Test
    void testValidaLipidios(){
        assertTrue(v.validaLipidios("90"));
        assertFalse(v.validaLipidios("quatro"));
    }
    @Test
    void testValidaNomeAlimento() {
        assertTrue(v.validaNomeAlimento("Banana"));
        assertFalse(v.validaNomeAlimento("2"));
    }

}