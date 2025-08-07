package com.github.springbootcourse.arquiteturaspring.montadora;

import java.awt.*;

public class ToyotaCorolla extends Carro{

    public ToyotaCorolla(Motor motor) {
        super(motor);
        setModelo("Corolla");
        setCor(Color.WHITE);
        setMontadora(Montadora.TOYOTA);
    }
}
