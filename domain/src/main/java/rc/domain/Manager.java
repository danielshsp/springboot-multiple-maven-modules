package rc.domain;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Contact_mgr" , uniqueConstraints = {
        @UniqueConstraint(columnNames = "User_ID")})
public class Manager {

    @Id
    @Column(name = "User_ID",updatable = false, columnDefinition = "VARCHAR(8)")
    String userName;
    @Column(name = "Manager_UID", columnDefinition = "VARCHAR(8)")
    String managerId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }
}
