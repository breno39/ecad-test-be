package com.ecad.codetest.pedido.application.api;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RequestMapping("/v1/pedido")
public interface PedidoAPI {

    @GetMapping("/find-all")
    @ResponseStatus(HttpStatus.OK)
    Page<PedidoDTO> findAll(@NotNull Pageable pageable);
}
