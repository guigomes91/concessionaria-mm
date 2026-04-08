package br.com.mm.concessionaria_mm.controller.v1;

import br.com.mm.concessionaria_mm.controller.v1.input.CarroInput;
import br.com.mm.concessionaria_mm.controller.v1.output.CarroOutput;
import br.com.mm.concessionaria_mm.model.Carro;
import br.com.mm.concessionaria_mm.repository.CarroRepository;
import br.com.mm.concessionaria_mm.service.CadastroCarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/v1/carros")
public class CadastroCarroController {
    private static final Logger log = Logger.getLogger(CadastroCarroController.class.getName());
    private final CadastroCarroService cadastroCarroService;

    public CadastroCarroController(CadastroCarroService cadastroCarroService) {
        this.cadastroCarroService = cadastroCarroService;
    }

    @PostMapping
    public CarroOutput salvar(
            @RequestBody CarroInput carroInput
            ) {
        return cadastroCarroService.salvar(carroInput);
    }

    @GetMapping
    public List<Carro> consulta() {
        log.info("CadastroCarroController#consulta - consultando carros");
        return cadastroCarroService.consulta();
    }
}