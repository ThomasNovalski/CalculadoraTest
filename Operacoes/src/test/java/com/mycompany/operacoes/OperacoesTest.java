/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.operacoes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thoma
 */
public class OperacoesTest {
    
    public OperacoesTest() {
    }

    @Test
    public void testSoma() {
        Operacoes operacao = new Operacoes();
        assertEquals(8,operacao.soma(4,4));
        assertEquals(10,operacao.soma(4,4));
                
    }
    @Test
    public void testSub() {
        Operacoes operacao = new Operacoes();
        assertEquals(0,operacao.sub(5,5));
        assertEquals(5,operacao.sub(0,8));
                
    }
    @Test
    public void testMulti() {
        Operacoes operacao = new Operacoes();
        assertEquals(12,operacao.multi(4,3));
        assertEquals(6,operacao.multi(5,4));
                
    }
    @Test
    public void testDiv() {
        Operacoes operacao = new Operacoes();
        assertEquals(3,operacao.div(12,4));
        assertEquals(6,operacao.div(6,2));
                
    }
    
}
