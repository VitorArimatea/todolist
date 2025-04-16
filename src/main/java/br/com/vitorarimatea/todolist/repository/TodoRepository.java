package br.com.vitorarimatea.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.vitorarimatea.todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
