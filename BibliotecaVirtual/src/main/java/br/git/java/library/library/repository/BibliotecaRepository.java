package br.git.java.library.library.repository;

import br.git.java.library.library.model.BibliotecaVirtual;
import org.springframework.data.repository.CrudRepository;

public interface BibliotecaRepository extends CrudRepository<BibliotecaVirtual, Long> {
}
