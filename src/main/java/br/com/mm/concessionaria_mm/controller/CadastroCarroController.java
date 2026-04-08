package br.com.mm.concessionaria_mm.controller;

import br.com.mm.concessionaria_mm.model.Carro;
import br.com.mm.concessionaria_mm.repository.CarroRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/carros")

public class CadastroCarroController {
    private static final Logger log = Logger.getLogger(CadastroCarroController.class.getName());

}

private final CarroRepository carroRepository;

public CadastroCarroController(CarroRepository carroRepository) {
    this.carroRepository = carroRepository;
}

@GetMapping
public List<Carro> consulta() {
    return carroRepository.findAll();
    log.info("CadastroCarroController#consulta - consultando carros");
}
}