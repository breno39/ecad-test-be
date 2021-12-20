package com.ecad.codetest.pedido.infrastructure;

import com.ecad.codetest.pedido.application.repository.PedidoRepository;
import com.ecad.codetest.pedido.domain.Pedido;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
@Log4j2
public class PedidoCustomRepository implements PedidoRepository {

    private PedidoPagingAndSortingRepository pedidoPagingAndSortingRepository;

    @Override
    public Page<Pedido> findAll(Pageable pageable) {
        log.info("[START] PedidoCustomRepository - findAll");
        Page<Pedido> pedidos = pedidoPagingAndSortingRepository.findAll(pageable);
        log.info("[END] PedidoCustomRepository - findAll");
        return pedidos;
    }
}
