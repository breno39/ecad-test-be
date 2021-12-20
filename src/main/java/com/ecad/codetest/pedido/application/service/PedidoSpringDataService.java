package com.ecad.codetest.pedido.application.service;

import com.ecad.codetest.pedido.application.repository.PedidoRepository;
import com.ecad.codetest.pedido.domain.Pedido;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class PedidoSpringDataService implements PedidoService{

    private PedidoRepository pedidoRepository;

    @Override
    public Page<Pedido> findAll(Pageable pageable) {
        log.info("[START] PedidoSpringDataService - findAll");
        Page<Pedido> pedidos = pedidoRepository.findAll(pageable);
        log.info("[END] PedidoSpringDataService - findAll");
        return pedidos;
    }
}
