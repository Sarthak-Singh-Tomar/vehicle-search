package com.backend.vehicle.api.search.dao;

import com.backend.vehicle.api.search.entity.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerDAO extends JpaRepository<Manufacturer, Integer> {
}
