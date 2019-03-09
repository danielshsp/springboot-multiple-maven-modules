package rc.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.domain.EmployeeJob;

import java.util.List;
@Repository
public interface JobRepository extends JpaRepository<EmployeeJob, Long> {

    List<EmployeeJob> findByUserName(String userName);
}
