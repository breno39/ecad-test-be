package com.ecad.codetest.pedido.application.service;

import com.ecad.codetest.pedido.application.repository.PedidoRepository;
import com.ecad.codetest.pedido.domain.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class PedidoSpringDataServiceTest {
    private PedidoSpringDataService pedidoSpringDataService;

    @Mock
    private PedidoRepository pedidoRepository;

    @SuppressWarnings("deprecation")
    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        this.pedidoSpringDataService = new PedidoSpringDataService(pedidoRepository);
    }

    @Test
    void deveRetornarTodosPedidosSalvos() {
        var pageable = PageRequest.of(0, 100);
        Page<Pedido> pedidos = Mockito.mock(Page.class);

        Mockito.when(pedidoRepository.findAll(pageable)).thenReturn(pedidos);

        var retorno = this.pedidoSpringDataService.findAll(pageable);

        Mockito.verify(pedidoRepository).findAll(pageable);
        assertNotNull(retorno);
    }

    @Test
    void deveLancarExceptionQuandoPageableForNull() {
        Page<Pedido> pedidos = Mockito.mock(Page.class);

        Mockito.when(pedidoRepository.findAll(null)).thenThrow(new NullPointerException());

        assertThrows(NullPointerException.class, () -> pedidoSpringDataService.findAll(null));
    }
}