/**
 * Copyright (c) 2014 Ixxus Limited
 * All rights reserved.
 */
package com.ixxus.koans.alfresco.cmr.repository;

import static org.junit.Assert.*;

import org.alfresco.service.cmr.repository.NodeRef;
import org.junit.Test;

/**
 * A node is the basic representation of everything in the repository.
 *
 * @author Robin Bramley, Ixxus Limited
 */
public class Koan2Test {

    @Test
    public void testNodeRefCafeBabeFaceFace() {
        NodeRef nodeRef = null;

        // You can construct a NodeRef with 3 strings
        // The first two are for the StoreRef
        String protocol = null;
        String identifier = null;
        String id = null;

        // YOUR CODE STARTS HERE



        // YOUR CODE FINISHES HERE
        assertNotNull("Have you set the protocol?", protocol);
        assertNotNull("Have you set the identifier?", identifier);
        assertNotNull("Have you set the id?", id);
        nodeRef = new NodeRef(protocol, identifier, id);

        assertTrue("It should validate as a NodeRef", NodeRef.isNodeRef(nodeRef.toString()));
        assertEquals("The node ref is wrong", "cafe://babe/faceface", nodeRef.toString());
    }

    @Test
    public void testNodeRefStoreRefString() {
        fail("Not yet implemented");
    }

    @Test
    public void testNodeRefString() {
        fail("Not yet implemented");
    }
}
