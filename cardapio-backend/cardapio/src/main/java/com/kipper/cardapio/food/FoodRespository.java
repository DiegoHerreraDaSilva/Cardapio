package com.kipper.cardapio.food;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRespository extends JpaRepository<Food, Long> {

}
