package com.ixxus.koans.alfresco.cmr.repository;

import org.alfresco.service.cmr.repository.NodeService;
import org.alfresco.service.cmr.repository.StoreRef;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Alex Lu
 */
@RunWith(MockitoJUnitRunner.class)
public class NodeServiceTest {

    @Mock
    private NodeService nodeService;

    @InjectMocks
    private Store store;

    @Test
    public void ensureNodeServiceCreateStoreIsInvoked() {
        StoreRef storeRef = StoreRef.STORE_REF_WORKSPACE_SPACESSTORE;

        /// ==== Your code starts here === ///

        /// ==== Your code ends here === ///

        verify(nodeService).createStore(storeRef.getProtocol(), storeRef.getIdentifier());
    }

    @Test
    public void ensureNodeServiceReturnsStore() {
        StoreRef storeRef = StoreRef.STORE_REF_WORKSPACE_SPACESSTORE;
        List<StoreRef> expectedStoreRefs = Arrays.asList(storeRef);
        when(nodeService.getStores()).thenReturn(expectedStoreRefs);

        List<StoreRef> actualStoreRefs = null;

        /// ==== Your code starts here === ///

        /// ==== Your code ends here === ///

        assertTrue(storeRef + " should be returned", actualStoreRefs.contains(storeRef));
    }

}

class Store {
    private NodeService nodeService;

    Store(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    public void createStore(String protocol, String identifier) {
        this.nodeService.createStore(protocol, identifier);
    }

    public List<StoreRef> getStores() {
        return this.nodeService.getStores();
    }
}
