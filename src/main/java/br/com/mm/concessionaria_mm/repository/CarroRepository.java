package br.com.mm.concessionaria_mm.repository;

import br.com.mm.concessionaria_mm.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<Carro, Long> {}