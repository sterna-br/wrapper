/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.sterna.wrapper.dao;

import javax.inject.Inject;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

/**
 *
 * @author PauloGladson
 */
@RunWith(CdiTestRunner.class)
public class WaysTest {

    @Inject
    private Ways instance;

    /**
     * Test of listCategory method, of class Nodes.
     */
    @Test
    public void testListCategory() {
        System.out.println("listCategory");
        boolean expResult = false;
        boolean result = instance.listCategory().isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of summary method, of class Nodes.
     */
    @Test
    public void testSummary() {
        System.out.println("summary");
        boolean expResult = false;
        assertEquals(expResult, instance.summary().isEmpty());
    }

}
