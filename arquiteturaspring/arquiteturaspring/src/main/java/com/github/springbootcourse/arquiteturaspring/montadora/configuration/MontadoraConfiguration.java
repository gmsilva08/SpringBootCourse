package com.github.springbootcourse.arquiteturaspring.montadora.configuration;

import com.github.springbootcourse.arquiteturaspring.montadora.Motor;
import com.github.springbootcourse.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Primary
    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(220);
        motor.setCilindros(4);
        motor.setModelo("E-Torq");
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindros(3);
        motor.setModelo("E-BYD");
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(480);
        motor.setCilindros(6);
        motor.setModelo("T-Jet");
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }

}
