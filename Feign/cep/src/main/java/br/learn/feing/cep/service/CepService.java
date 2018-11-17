package br.learn.feing.cep.service;

import br.learn.feing.cep.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "cepService", url = "http://api.postmon.com.br")
public interface CepService {

    @RequestMapping("/v1/cep/{cep}")
    Address getCep(@PathVariable("cep") String cep);
}
