package com.example.cvapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class EduModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Direction")
    private String direction;

    @Column(name = "School")
    private String school;

    @Column(name = "dataStart")
    private String data_start;

    @Column(name = "dataTo")
    private String data_to;

}
