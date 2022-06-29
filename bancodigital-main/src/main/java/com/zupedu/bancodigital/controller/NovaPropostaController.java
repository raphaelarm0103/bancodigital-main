package com.zupedu.bancodigital.controller;

import com.zupedu.bancodigital.domain.Proposta;
import com.zupedu.bancodigital.requests.PropostaRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/proposta")
public class NovaPropostaController {

    private final CadastroPropostaRepository repository;

    public NovaPropostaController(CadastroPropostaRepository repository) {
        this.repository = repository;
    }

    public ResponseEntity<Proposta> novaProposta(@RequestBody @Valid PropostaRequest request){

        try {
            Proposta proposta1 = repository.novaProposta(request.propostaRequest());

            repository.novaProposta(proposta1);

            return ResponseEntity.ok().build();
        } catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
}
