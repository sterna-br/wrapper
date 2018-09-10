/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.gov.serpro.sterna.wrapper.dao;

import java.util.List;
import java.util.Locale.Category;
import javax.inject.Inject;
import org.apache.deltaspike.testcontrol.api.junit.CdiTestRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author PauloGladson
 */
@RunWith(CdiTestRunner.class)
public class NodesTest {

    @Inject
    private Nodes instance;

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

//    /**
//     * Test of listGroup method, of class Nodes.
//     */
//    @Test
//    public void testListGroup() {
//        System.out.println("listGroup");
//        String value = "";
//        Nodes instance = new Nodes();
//        List expResult = null;
//        List result = instance.listGroup(value);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchByGeo method, of class Nodes.
//     */
//    @Test
//    public void testSearchByGeo() {
//        System.out.println("searchByGeo");
//        Double lat = null;
//        Double lng = null;
//        Double rad = null;
//        Nodes instance = new Nodes();
//        Features expResult = null;
//        Features result = instance.searchByGeo(lat, lng, rad);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchByCategory method, of class Nodes.
//     */
//    @Test
//    public void testSearchByCategory() {
//        System.out.println("searchByCategory");
//        String category = "";
//        Double lat = null;
//        Double lng = null;
//        Double rad = null;
//        Nodes instance = new Nodes();
//        Features expResult = null;
//        Features result = instance.searchByCategory(category, lat, lng, rad);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchByCategoryGroup method, of class Nodes.
//     */
//    @Test
//    public void testSearchByCategoryGroup() {
//        System.out.println("searchByCategoryGroup");
//        String category = "";
//        String group = "";
//        Double lat = null;
//        Double lng = null;
//        Double rad = null;
//        Nodes instance = new Nodes();
//        Features expResult = null;
//        Features result = instance.searchByCategoryGroup(category, group, lat, lng, rad);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchByCategoryDescription method, of class Nodes.
//     */
//    @Test
//    public void testSearchByCategoryDescription() {
//        System.out.println("searchByCategoryDescription");
//        String category = "";
//        String description = "";
//        Nodes instance = new Nodes();
//        Features expResult = null;
//        Features result = instance.searchByCategoryDescription(category, description);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchByCategoryGroupDescription method, of class Nodes.
//     */
//    @Test
//    public void testSearchByCategoryGroupDescription() {
//        System.out.println("searchByCategoryGroupDescription");
//        String category = "";
//        String group = "";
//        String description = "";
//        Nodes instance = new Nodes();
//        Features expResult = null;
//        Features result = instance.searchByCategoryGroupDescription(category, group, description);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of searchByDescription method, of class Nodes.
//     */
//    @Test
//    public void testSearchByDescription() {
//        System.out.println("searchByDescription");
//        String description = "";
//        Nodes instance = new Nodes();
//        Features expResult = null;
//        Features result = instance.searchByDescription(description);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
}
