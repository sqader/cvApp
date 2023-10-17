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

public class ExpModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Position")
    private String position;

    @Column(name = "Company")
    private String company;

    @Column(name = "dataStart")
    private String data_start;

    @Column(name = "dataTo")
    private String data_to;


}
