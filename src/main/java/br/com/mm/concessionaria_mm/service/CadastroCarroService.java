package br.com.mm.concessionaria_mm.service;

import br.com.mm.concessionaria_mm.controller.v1.input.CarroInput;
import br.com.mm.concessionaria_mm.controller.v1.output.CarroOutput;
import br.com.mm.concessionaria_mm.model.Carro;
import br.com.mm.concessionaria_mm.repository.CarroRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroCarroService {

    private static final Logger log = LoggerFactory.getLogger(CadastroCarroService.class);
    private final CarroRepository carroRepository;

    public CadastroCarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    @Transactional
    public CarroOutput salvar(CarroInput carroInput) {
        if (carroInput.cor() == null || carroInput.cor().isBlank()) {
            throw new IllegalArgumentException("O campo cor é obrigatório");
        }

        var carroEntity = new Carro(carroInput.cor(), carroInput.marca());
        final var carroSave = carroRepository.save(carroEntity);

        return new CarroOutput(carroSave.getCodigo(), carroSave.getMarca(), carroSave.getCor());
    }

    public List<Carro> consulta() {
        log.info("CadastroCarroService#consulta - consultando carros...");
        final var allCars = carroRepository.findAll();
        log.info("CadastroCarroService#consulta - consulta finalizada para um total de {} carros", allCars.size());
        return allCars;
    }
}