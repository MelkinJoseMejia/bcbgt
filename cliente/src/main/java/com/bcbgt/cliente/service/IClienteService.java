package com.bcbgt.cliente.service;

import com.bcbgt.cliente.domain.ClienteRequest;
import com.bcbgt.cliente.domain.ClienteResponse;
import com.bcbgt.cliente.entity.Cliente;

public interface IClienteService {

    ClienteResponse getCliente(ClienteRequest clienteRequest);
}
