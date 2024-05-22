package com.example.pi5.serviços;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.pi5.modelos.EnderecoModel;
import com.example.pi5.repositorios.EnderecoRepositorio;

@Service
public class EnderecoService {
    

@Autowired
EnderecoRepositorio enderecoRepositorio;


public void cadastrarEndereco(EnderecoModel enderecoModel) {
    enderecoRepositorio.save(enderecoModel);
}

public List<EnderecoModel> buscarEnderecos() {
    return (List<EnderecoModel>) enderecoRepositorio.findAll();
}

public EnderecoModel buscarEnderecoPorId(Integer id) {
    Optional <EnderecoModel> enderecoOptional = enderecoRepositorio.findById(id);
    return enderecoOptional.orElse(null);
}

public ResponseEntity<Object> atualizarPorId(Integer id, EnderecoModel enderecoModel) {
    Optional<EnderecoModel> enderecoOptional = enderecoRepositorio.findById(id);
    if (enderecoOptional.isEmpty()) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Endereco não encontrado.");
    }
    enderecoRepositorio.save(enderecoModel);
    return ResponseEntity.status(HttpStatus.OK).body(enderecoModel);
}



public void deletarPorId(Integer id) {
    enderecoRepositorio.deleteById(id);

}

}
