package com.ecad.codetest.pedido.application.api;

import com.ecad.codetest.pedido.domain.Pedido;
import com.ecad.codetest.pedido.domain.TipoPedido;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Data
public class PedidoDTO {
    private UUID id;

    private String nome;

    private TipoPedido tipo;

    private LocalDateTime createdOn;

    public static PedidoDTO fromEntity(Pedido pedido) {
        return PedidoDTO.builder()
                .id(pedido.getId())
                .nome(pedido.getNome())
                .tipo(pedido.getTipo())
                .createdOn(pedido.getCreatedOn())
                .build();
    }
}
