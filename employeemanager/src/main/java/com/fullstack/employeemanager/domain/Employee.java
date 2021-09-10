package com.fullstack.employeemanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Employee implements Serializable { // Implementar serializable para poder utilizar STREAMS
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(nullable = false, updatable = false)
    private Long id;
    @Column
    private String name;
    @Column
    private String email;
    @Column
    private String jobTitle;
    @Column
    private String phone;
    @Column
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;

}
