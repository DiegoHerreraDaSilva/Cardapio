package com.kipper.cardapio.food;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "food")
@Entity(name = "food")
@Getter // Gera um método get para cada atributo da classe
@NoArgsConstructor // Declara um constructor sem argumentos
@AllArgsConstructor // Declara um constructor com todos os argumentos
@EqualsAndHashCode(of = "id") // Indica que o ID é a representação unica de Food
public class Food {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String title;

        private String image;

        private Integer price;

        public Food(FoodRequestDTO data){
                this.image = data.image();
                this.price = data.price();
                this.title = data.title();

        }
}