package com.obera.jasdb.rest;

import nl.renarj.jasdb.core.SimpleKernel;
import nl.renarj.jasdb.service.DBSessionTest;

/**
 * @author Renze de Vries
 */
public class RestDBSessionTest extends DBSessionTest {
    public RestDBSessionTest() {
        super(new TestRestDBSessionFactory());
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        System.setProperty("jasdb-config", "");
    }

    @Override
    public void setUp() throws Exception {
        System.setProperty("jasdb-config", "jasdb-rest.xml");
        super.setUp();

        SimpleKernel.initializeKernel();
    }
}
