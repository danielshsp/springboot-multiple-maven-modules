package rc.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rc.domain.Manager;
import java.util.List;
@Repository
public interface ManagerRepository extends JpaRepository<Manager, Long> {

    List<Manager> findByUserName(String userName);
    List<Manager> findByManagerId(String managerId);
}
