package rc.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.domain.Employee;
import java.util.List;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByUserName(String userName);
}
