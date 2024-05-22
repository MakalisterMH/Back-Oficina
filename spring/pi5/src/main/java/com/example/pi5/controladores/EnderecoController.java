package com.example.pi5.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pi5.modelos.EnderecoModel;
import com.example.pi5.serviços.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {
    
@Autowired
EnderecoService enderecoService;

@PostMapping
    public void cadastrarFuncionario(@RequestBody EnderecoModel enderecoModel) {
        enderecoService.cadastrarEndereco(enderecoModel);

    }


    @GetMapping
    public List<EnderecoModel> buscarEnderecos() {
        return enderecoService.buscarEnderecos();
    }


    @GetMapping("/{idEndereco}")
    public EnderecoModel buscarFuncionarioId(@PathVariable Integer idEndereco) {
        return enderecoService.buscarEnderecoPorId(idEndereco);
    }

    @PutMapping("/{idEndereco}")
    public ResponseEntity<Object> atualizarPorFuncionario(@PathVariable Integer idEndereco, @RequestBody EnderecoModel enderecoModel) {
        return enderecoService.atualizarPorId(idEndereco, enderecoModel);
    }



    @DeleteMapping("/{idEndereco}")
    public void deletarFuncionarioPorId(@PathVariable Integer idEndereco){
        enderecoService.deletarPorId(idEndereco);
    }

}
