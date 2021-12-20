package com.ecad.codetest.pedido.application.api;

import com.ecad.codetest.pedido.application.service.PedidoService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@AllArgsConstructor
@RestController
@Controller
public class PedidoRestController implements PedidoAPI {

    private PedidoService pedidoService;

    @Override
    public Page<PedidoDTO> findAll(Pageable pageable) {
        log.info("[START] PedidoRestController - findAll");
        Page<PedidoDTO> pedidos = pedidoService.findAll(pageable).map(PedidoDTO::fromEntity);
        log.info("[END] PedidoRestController - findAll");
        return pedidos;
    }
}
