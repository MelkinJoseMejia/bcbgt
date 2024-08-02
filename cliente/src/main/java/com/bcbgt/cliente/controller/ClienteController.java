package com.bcbgt.cliente.controller;

import com.bcbgt.cliente.domain.ClienteRequest;
import com.bcbgt.cliente.domain.ClienteResponse;
import com.bcbgt.cliente.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/clientes")
public class ClienteController {

    @Autowired
    IClienteService clienteService;

    @GetMapping(value = "/getCliente", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteResponse> getCliente(@RequestBody ClienteRequest clienteRequest){
        ClienteResponse cliente = clienteService.getCliente(clienteRequest);
        if (cliente != null) {
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
