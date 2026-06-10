package com.kipper.cardapio.controller;

import com.kipper.cardapio.food.Food;
import com.kipper.cardapio.food.FoodRequestDTO;
import com.kipper.cardapio.food.FoodResponseDTO;
import com.kipper.cardapio.food.FoodRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Indica para o Spring que essa classe é um controler da aplicação
// Mapeando nos controller sozinho
@RequestMapping("food") // Informa qual o endpoint que ele controla (food)

public class FoodController {

    // Endpoint get da aplicação
    // para quando o front-end bater /getFood  retornar todos os food no db

        @Autowired // Indica para o Spring para injetar a dependência na classe
        private FoodRespository repository;

        @CrossOrigin(origins = "*", allowedHeaders = "*")
        @PostMapping
        public void saveFood(@RequestBody FoodRequestDTO data){
            Food foodData = new Food(data);
            repository.save(foodData);
            return;

        }

        @CrossOrigin(origins = "*", allowedHeaders = "*")
        @GetMapping // Quando baterem no endpoint food, com o método get, vai usar o método getAll
        public List<FoodResponseDTO> getAll(){

            List <FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
            return foodList;


    }

}
