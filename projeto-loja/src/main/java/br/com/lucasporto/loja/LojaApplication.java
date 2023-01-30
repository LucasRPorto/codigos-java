package br.com.lucasporto.loja;

import br.com.lucasporto.loja.impostos.CalculadoraDeImpostos;
import br.com.lucasporto.loja.orcamento.Orcamento;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class LojaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

}
