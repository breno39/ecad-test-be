package com.ecad.codetest.pedido.application.service;

import com.ecad.codetest.pedido.domain.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PedidoService {
    Page<Pedido> findAll(Pageable pageable);
}
