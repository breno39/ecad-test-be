package com.ecad.codetest.pedido.infrastructure;

import com.ecad.codetest.pedido.domain.Pedido;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface PedidoPagingAndSortingRepository extends PagingAndSortingRepository<Pedido, UUID> {
}
