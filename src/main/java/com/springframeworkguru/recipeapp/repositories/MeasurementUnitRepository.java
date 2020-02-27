package com.springframeworkguru.recipeapp.repositories;

import com.springframeworkguru.recipeapp.domain.MeasurementUnit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface MeasurementUnitRepository extends CrudRepository<MeasurementUnit, Long> {

    Optional<MeasurementUnit> findByDescription(String description);
}
