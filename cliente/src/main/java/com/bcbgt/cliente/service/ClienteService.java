package com.bcbgt.cliente.service;

import com.bcbgt.cliente.domain.ClienteRequest;
import com.bcbgt.cliente.domain.ClienteResponse;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {
    @Override
    public ClienteResponse getCliente(ClienteRequest clienteRequest) {
        if(!clienteRequest.getTipodocumento().equals("C") && !clienteRequest.getTipodocumento().equals("P")){
            return null;
        }
        if(!clienteRequest.getNumerodocumento().equals("23445322")){
            return null;
        }
        return getClienteMock();
    }

    private ClienteResponse getClienteMock() {
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
