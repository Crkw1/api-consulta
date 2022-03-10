package com.dio.devWeek.Repository;

import com.dio.devWeek.Entity.IncidenciaExame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OcorrenciaRepository extends JpaRepository<IncidenciaExame, Long> {
}
