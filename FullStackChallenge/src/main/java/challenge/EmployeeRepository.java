package challenge;

import org.springframework.data.repository.CrudRepository;

/**
 * @author ankit on 8/16/17.
 * @project FullStackChallenge
 */

public interface EmployeeRepository extends CrudRepository<Employee, Long> {}

