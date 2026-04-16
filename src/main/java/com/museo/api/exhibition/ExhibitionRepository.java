package com.museo.api.exhibition;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhibitionRepository extends ListCrudRepository<ExhibitionEntity, Long> {
    // Aquí puedes agregar métodos de búsqueda personalizados más adelante,
    // como buscar por título.
}
