package rc.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.domain.Employee;
import rc.domain.EmployeeJob;
import rc.domain.Manager;
import rc.persistence.EmployeeRepository;
import rc.persistence.JobRepository;
import rc.persistence.ManagerRepository;
import rc.service.jms.EmployeeSender;
import java.util.List;

@Service
public class ControllerService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    JobRepository jobRepository;
    @Autowired
    ManagerRepository managerRepository;
    @Autowired
    EmployeeSender employeeSender;


    public List<Employee> getAllEmployee(){
        List <Employee> employeeList = employeeRepository.findAll();
        employeeSender.sendTopic("Get list with the data of all users");
        return employeeList;
    }

    public List <Employee> findEmployeeByName(String UserName){
        return employeeRepository.findByUserName(UserName);

    }

    public List<EmployeeJob> getAllJobsOfEmployee(){
        return jobRepository.findAll();
    }

    public List <EmployeeJob> findJobByEmployeeName(String UserName){
        return jobRepository.findByUserName(UserName);

    }

    public List<Manager> getAllOfManager(){
        return managerRepository.findAll();
    }
    public List <Manager> findManagerByUserName(String UserName){
        return managerRepository.findByUserName(UserName);

    }

    public List <Manager> findEmpByMangerId(String ManagerId){
        return managerRepository.findByManagerId(ManagerId);

    }
}
