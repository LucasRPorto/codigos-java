package br.com.lucasporto.loja;

import br.com.lucasporto.loja.http.HttpAdapter;
import br.com.lucasporto.loja.orcamento.Orcamento;

import java.util.Map;

public class RegistroOrcamento{

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http){
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "situação", orcamento.getSituacao()
        );
        http.post(url, dados);
    }
}
