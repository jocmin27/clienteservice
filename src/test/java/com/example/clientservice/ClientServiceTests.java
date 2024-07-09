package com.example.clientservice;

import com.example.clientservice.entity.Client;
import com.example.clientservice.service.ClientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class ClientServiceTests {
    @Autowired
    private ClientService clienteService;

    @Test
    public void testSaveCliente() {
        Client client = new Client();
        client.setNombre("Test");
        Client savedClient = clienteService.saveCliente(client);
        assertNotNull(savedClient);
        assertEquals("Test", savedClient.getNombre());
    }
}

