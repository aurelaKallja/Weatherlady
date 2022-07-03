package org.example.services;

import jakarta.persistence.*;
import lombok.Data;


    @Entity
   @Data
    @Table(name="location")

public class Location {


        @Id
        @GeneratedValue(strategy = GenerationType.TABLE)
        private int id;

        @Column(name = "country")
        private String country;

        @Column(name = "city")
        private String city;





    }
}
