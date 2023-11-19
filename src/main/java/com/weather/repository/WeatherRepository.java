package com.weather.repository;

import com.weather.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeatherRepository extends JpaRepository<WeatherEntity, String> {

    //SELECT * FROM ENTITY WHERE CITY='CITY' ORDER BY UPDATED_TIME DESC LIMIT 1;
    Optional<WeatherEntity> findFirstByRequestedCityNameOrderByUpdatedTimeDesc(String city);
}
