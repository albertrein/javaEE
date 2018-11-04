package br.git.learn2.demo.repository;

import br.git.learn2.demo.model.Data;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<Data, Long> {
}
