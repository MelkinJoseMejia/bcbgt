package com.bcbgt.cliente.domain;

import jakarta.persistence.Column;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class ClienteResponse {
    private Long id;
    private String tipodocumento;

    private String numerodocumento;

    private String primernombre;

    private String segundonombre;

    private String primerapellido;

    private String segundoapellido;

    private String telefono;

    private String direccion;

    private String ciudad;
}
