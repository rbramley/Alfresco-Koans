package com.ixxus.koans.alfresco.cmr.repository;

import org.alfresco.service.cmr.repository.NodeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;

/**
 * @author Alex Lu
 */
@RunWith(MockitoJUnitRunner.class)
public class NodeServiceTest {

    @Mock
    private NodeService nodeService;

    @InjectMocks
    private CreateStore createStore;

    @Test
    public void createStoreTest() {
        String protocol = "foo";
        String identifier = "bar";
        createStore.createStore(protocol, identifier);

        verify(nodeService).createStore(protocol, identifier);
    }

}

class CreateStore {
    private NodeService nodeService;

    CreateStore(NodeService nodeService) {
        this.nodeService = nodeService;
    }

    public void createStore(String protocol, String identifier) {
        this.nodeService.createStore(protocol, identifier);
    }
}
