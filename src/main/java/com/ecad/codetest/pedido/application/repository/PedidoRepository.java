package com.ecad.codetest.pedido.application.repository;

import com.ecad.codetest.pedido.domain.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PedidoRepository {
    Page<Pedido> findAll(Pageable pageable);
}
