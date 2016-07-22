/**
 * (C) Copyright IBM Corp. 2016,2017,2018,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.persistence.test.common;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;
import static org.testng.AssertJUnit.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.ibm.watsonhealth.fhir.model.Encounter;
import com.ibm.watsonhealth.fhir.model.Resource;

/**
 *  This class contains a collection of tests that will be run against
 *  each of the various persistence layer implementations.
 *  There will be a subclass in each persistence project.
 */
public abstract class AbstractQueryEncounterTest extends AbstractPersistenceTest {
	
    /**
     * Tests the FHIRPersistenceCloudantImpl create API for an Encounter.
     * 
     * @throws Exception
     */
    @Test(groups = { "cloudant", "jpa" })
    public void testCreateEncounter() throws Exception {
    	Encounter encounter = readResource(Encounter.class, "Encounter.json");

        persistence.create(encounter);
        assertNotNull(encounter);
        assertNotNull(encounter.getId());
        assertNotNull(encounter.getId().getValue());
        assertNotNull(encounter.getMeta());
        assertNotNull(encounter.getMeta().getVersionId().getValue());
        assertEquals("1", encounter.getMeta().getVersionId().getValue());
    } 
	
	/**
	 * Tests a query with a resource type but without any query parameters. This should yield all the resources created so far.
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounterQuery_noParams() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, null, null);
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = '60.0' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_length() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "60.0");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = '60.0 OR 70.0' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_length_multivalue() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "60.0,70.0");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = 'eq60.0' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_EQlength() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "eq60.0");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = '40.5' which should yield no results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_lengthNoResults() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "40.5");
		assertNotNull(resources);
		assertTrue(resources.size() == 0);
	}
	
	/**
	 * Tests a query for Encounters with length = 'ne40.5' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_NElength() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "ne40.5");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = 'le60.0' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_LElength() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "le60.0");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = 'ge60.0' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_GElength() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "ge60.0");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = 'gt59.0' which should yield correct results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_GTlength() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "gt59.0");
		assertNotNull(resources);
		assertTrue(resources.size() != 0);
	}
	
	/**
	 * Tests a query for Encounters with length = 'lt60.0' which should yield no results
	 * @throws Exception
	 */
	@Test(groups = { "cloudant", "jpa" }, dependsOnMethods = { "testCreateEncounter" })
	public void testEncounter_LTlength() throws Exception {
		List<Resource> resources = runQueryTest(Encounter.class, persistence, "length", "lt60.0");
		assertNotNull(resources);
		assertTrue(resources.size() == 0);
	}
}
