package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
<b>ViaCEP</b>.

@see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud Open Feign</a>
@See <a href="https://viacep.com.br">ViaCEP</a>

@author falvojr / wbn
*/
@FeignClient(name = "viacep", url = "http://viacep.com.br/ws")
public interface ViaCepService {

    @GetMapping("{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

}
