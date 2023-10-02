package com.backend.vehicle.api.search.dao;

import com.backend.vehicle.api.search.entity.ManufactureYear;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerYearDAO extends JpaRepository<ManufactureYear, Integer> {
}
