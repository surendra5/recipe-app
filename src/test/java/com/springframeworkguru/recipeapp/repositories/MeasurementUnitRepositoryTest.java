package com.springframeworkguru.recipeapp.repositories;

import com.springframeworkguru.recipeapp.domain.MeasurementUnit;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
class MeasurementUnitRepositoryTest {

    @Autowired
    MeasurementUnitRepository measurementUnitRepository;

    @Before
    void setUp() throws Exception{
    }

    @Test
    void findByDescription() throws Exception{
        Optional<MeasurementUnit> measurementUnitOptional = measurementUnitRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", measurementUnitOptional.get().getDescription());
    }

    @Test
    void findByDescriptionEach() throws Exception{
        Optional<MeasurementUnit> measurementUnitOptional = measurementUnitRepository.findByDescription("Each");
        assertEquals("Each", measurementUnitOptional.get().getDescription());
    }

}