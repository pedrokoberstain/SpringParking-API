package com.kober.demoparkapi.repository;

import com.kober.demoparkapi.repository.projection.ClienteVagaProjection;
import com.kober.demoparkapi.entity.ClienteVaga;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClienteVagaRepository extends JpaRepository<ClienteVaga, Long> {
    Optional<ClienteVaga> findByReciboAndDataSaidaIsNull(String recibo);

    long countByClienteCpfAndDataSaidaIsNotNull(String cpf);

    Page<ClienteVagaProjection> findAllByClienteCpf(String cpf, Pageable pageable);

    Page<ClienteVagaProjection> findAllByClienteUsuarioId(Long id, Pageable pageable);
}
