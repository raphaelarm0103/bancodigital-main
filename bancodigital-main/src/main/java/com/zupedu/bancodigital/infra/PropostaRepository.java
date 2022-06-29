package com.zupedu.bancodigital.infra;

import com.zupedu.bancodigital.domain.Proposta;
import org.springframework.data.repository.CrudRepository;

public interface PropostaRepository{

    Proposta novaProposta(Proposta proposta);
}
