package com.example.pi5.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EnderecoModel {
    
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String cep;
private String logradouro;
private String bairro;
private String localidade;
private String uf;


}



