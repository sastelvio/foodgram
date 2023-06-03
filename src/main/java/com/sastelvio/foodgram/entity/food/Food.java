package com.sastelvio.foodgram.entity.food;

import jakarta.persistence.*;

@Table(name = "food")
@Entity(name = "food")
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Double price;
}
