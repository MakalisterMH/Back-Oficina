package com.example.pi5.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pi5.modelos.EnderecoModel;

public interface EnderecoRepositorio extends JpaRepository<EnderecoModel,Integer> {
    
}
