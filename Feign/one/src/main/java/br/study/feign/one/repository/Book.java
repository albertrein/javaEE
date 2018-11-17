package br.study.feign.one.repository;

import br.study.feign.one.output.BookOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="two", url="$http://localhost:8081")
public interface Book {
    @GetMapping("/pegadados")
    public BookOutput getOutputBook(@PathVariable(name = "dados") String dados);
}
