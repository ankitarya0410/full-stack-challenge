package challenge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author ankit on 8/16/17.
 * @project FullStackChallenge
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;
    private final PerformanceRepository repo;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository, PerformanceRepository repo) {
        this.repository = repository;
        this.repo = repo;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Employee("Joe Biden", 1, "normal"));
        this.repository.save(new Employee("President Obama", 2, "normal"));
        this.repository.save(new Employee("Crystal Mac", 3, "admin"));
        this.repository.save(new Employee("James Henry", 4, "admin"));
        this.repo.save(new Performance(2, 1, "Very good working professional"));
        this.repo.save(new Performance(1, 2, "working professional"));
        this.repo.save(new Performance(1, 4, "Very good professional"));
        this.repo.save(new Performance(3, 2, "Timeline king"));
    }
}
