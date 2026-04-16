package com.museo.api.guides;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideRepository extends ListCrudRepository<GuideEntity, Long> {
}
