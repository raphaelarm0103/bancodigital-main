package com.zupedu.bancodigital.controller;

import com.zupedu.bancodigital.domain.Proposta;
import com.zupedu.bancodigital.infra.PropostaRepository;
import org.springframework.stereotype.Component;

@Component
public class CadastroPropostaRepository implements PropostaRepository {

    @Override
    public Proposta novaProposta(Proposta proposta) {
        return proposta;
    }
}
