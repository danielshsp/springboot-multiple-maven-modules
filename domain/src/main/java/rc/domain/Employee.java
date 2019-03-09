package rc.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import java.util.Date;

@Entity
@Table(name="contact_emp" , uniqueConstraints = {
        @UniqueConstraint(columnNames = "User_ID")})
public class Employee {
    @Id
    @Column(name = "User_ID",updatable = false, columnDefinition = "VARCHAR(8)")
    String userName;
    @Column(name = "Last_Name", columnDefinition = "VARCHAR(25)")
    String lastName;
    @Column(name = "First_Name", columnDefinition = "VARCHAR(35)")
    String firstName;


    public Employee(){
    }

    public Employee(String userName, String firstName){
        this.userName = userName;
        this.firstName = firstName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
