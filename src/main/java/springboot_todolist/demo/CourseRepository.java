package springboot_todolist.demo;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Todo, Long>{
}
