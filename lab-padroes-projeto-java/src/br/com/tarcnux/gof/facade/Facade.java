package br.com.tarcnux.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        //Criado os packages subsistema para indicar
        //o quão complexo pode ser integrar sistema diferentes
        String cidade = CepApi.getInstancia().getCidade(cep);
        String estado = CepApi.getInstancia().getEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
