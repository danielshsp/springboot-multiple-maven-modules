package rc.domain;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="contact_jobf" , uniqueConstraints = {
        @UniqueConstraint(columnNames = "User_ID")})

public class EmployeeJob {
    @Id
    @Column(name = "User_ID",updatable = false, columnDefinition = "VARCHAR(8)")
    String userName;
    @Column(name = "Job_Description_Global", columnDefinition = "VARCHAR(100)")
    String job;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
