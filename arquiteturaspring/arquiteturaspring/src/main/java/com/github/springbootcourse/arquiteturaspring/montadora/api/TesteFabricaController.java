package com.github.springbootcourse.arquiteturaspring.montadora.api;

import com.github.springbootcourse.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("carros")
public class TesteFabricaController {

    @Autowired
    @io.github.cursodsousa.arquiteturaspring.montadora.api.Aspirado
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){

        if(chave.getMontadora().equals(Montadora.HONDA)){
            var carro = new HondaHRV(motor);
            return carro.darIgnicao(chave);
        }if(chave.getMontadora().equals(Montadora.TOYOTA)){
            var carro = new ToyotaCorolla(motor);
            return carro.darIgnicao(chave);
        }
        return new CarroStatus("Tipo de carro inválido na chave.");
    }
}
