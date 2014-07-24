/**
 * Copyright (c) 2014 Ixxus Limited
 * All rights reserved.
 */
package com.ixxus.koans.alfresco.cmr.repository;

import static org.junit.Assert.*;

import org.alfresco.service.cmr.repository.StoreRef;
import org.junit.Test;

/**
 * The store is the basic organisational unit of the repository.
 *
 * @author Robin Bramley, Ixxus Limited
 */
public class Koan1Test {

    @Test
    public void testFooBarStoreRef2Strings() {
        StoreRef ref = null;

        // You can construct a StoreRef with two Strings
        String protocol = null;
        String identifier = null;

        // YOUR CODE STARTS HERE


        // YOUR CODE FINISHES HERE

        assertNotNull("Have you set the protocol?", protocol);
        assertNotNull("have you set the identifier?", identifier);
        ref = new StoreRef(protocol,identifier);
        assertEquals("The store ref is wrong", "foo://bar", ref.toString());
    }

    @Test
    public void testCafeBabeStoreRefString() {
        StoreRef ref = null;

        // You can construct a StoreRef with a string
        String string = null;

        // YOUR CODE STARTS HERE

        // YOUR CODE FINISHES HERE

        assertNotNull("Have you set the store string?", string);
        ref = new StoreRef(string);
        assertEquals("The store ref is wrong", "cafe://babe", ref.toString());
    }

    @Test
    public void testWellKnownStore() {
        StoreRef ref = null;

        // You can get the well-known Workspace SpacesStore without needing to use a constructor.

        // YOUR CODE STARTS HERE

        // YOUR CODE FINISHES HERE

        assertNotNull("Ref mustn't be null, have you implemented your code snippet yet?", ref);
        assertEquals("The store ref is wrong", "workspace://SpacesStore", ref.toString());
    }

}
