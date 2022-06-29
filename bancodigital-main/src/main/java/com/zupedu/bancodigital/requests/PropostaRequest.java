package com.zupedu.bancodigital.requests;

import com.zupedu.bancodigital.domain.Endereco;
import com.zupedu.bancodigital.domain.Proposta;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PropostaRequest {

    private String nome;
    private String cpf;
    private String email;
    private Endereco endereco;

    public PropostaRequest(@NotBlank String nome, @CPF @NotBlank String cpf, @Email @NotBlank String email, @NotBlank @NotNull Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "PropostaRequest{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + endereco +
                '}';
    }

    public Proposta propostaRequest(){
        return new Proposta(nome, cpf, email, endereco);
    }

}
