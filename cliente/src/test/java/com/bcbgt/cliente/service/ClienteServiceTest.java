package com.bcbgt.cliente.service;

import com.bcbgt.cliente.domain.ClienteRequest;
import com.bcbgt.cliente.domain.ClienteResponse;
import com.bcbgt.cliente.entity.Cliente;
import com.bcbgt.cliente.repository.ClienteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ClienteServiceTest {

    @Autowired
    ClienteService clienteService;

    @BeforeEach
    void setUp() {
        this.clienteService = new ClienteService();

    }

    @Test
    void getCliente_OK() {
        ClienteRequest cr = new ClienteRequest();
        cr.setNumerodocumento("23445322");
        cr.setTipodocumento("C");
        ClienteResponse rp = getClienteM();
        ClienteResponse res = clienteService.getCliente(cr);
        assertEquals(rp, res);

    }

    @Test
    void getCliente_NOT_TD() {
        ClienteRequest cr = new ClienteRequest();
        cr.setNumerodocumento("23445322");
        cr.setTipodocumento("T");
        ClienteResponse rp = getClienteM();
        ClienteResponse res = clienteService.getCliente(cr);
        assertNotEquals(rp, res);

    }

    @Test
    void getCliente_NOT_ND() {
        ClienteRequest cr = new ClienteRequest();
        cr.setNumerodocumento("1234567");
        cr.setTipodocumento("C");
        ClienteResponse rp = getClienteM();
        ClienteResponse res = clienteService.getCliente(cr);
        assertNotEquals(rp, res);

    }

    ClienteResponse getClienteM() {
        return ClienteResponse.builder()
                .id(123L)
                .tipodocumento("C")
                .numerodocumento("23445322")
                .primernombre("Jhenny")
                .segundonombre("Jhenny")
                .primerapellido("Perez")
                .segundoapellido("Perez")
                .telefono("3005647")
                .direccion("CLL 1 #23-34")
                .ciudad("Bogotá DC")
                .build();
    }
}