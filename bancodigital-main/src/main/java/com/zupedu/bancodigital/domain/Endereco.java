package com.zupedu.bancodigital.domain;

public class Endereco {

    private final String cep;
    private final String rua;
    private final Long numero;
    private final String complemento;

    public Endereco(String cep, String rua, Long numero, String complemento) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
