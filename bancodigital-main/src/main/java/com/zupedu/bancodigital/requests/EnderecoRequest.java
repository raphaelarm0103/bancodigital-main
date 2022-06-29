package com.zupedu.bancodigital.requests;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EnderecoRequest {

    private String cep;
    private String rua;
    private Long numero;
    private String complemento;

    public EnderecoRequest(@NotBlank String cep, @NotBlank String rua, @NotBlank Long numero, @NotBlank @Size(max = 200) String complemento) {
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getRua() {
        return rua;
    }

    public Long getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    @Override
    public String toString() {
        return "EnderecoRequest{" +
                "cep='" + cep + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                '}';
    }
}
