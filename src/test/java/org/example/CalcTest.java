package org.example;

import org.junit.Test;

import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

package com.ejemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void testCalcularMCD() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.calcularMCD(10, 15));
    }
}

}
