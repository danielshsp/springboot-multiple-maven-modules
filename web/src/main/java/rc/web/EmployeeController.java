package rc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rc.domain.Employee;
import rc.domain.EmployeeJob;
import rc.domain.Manager;
import rc.service.controller.ControllerService;
import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class EmployeeController {

    @Autowired
    ControllerService controllerService;

    @GetMapping(value = "/contact/all")
    public List<Employee> getAll(){
        return controllerService.getAllEmployee();
    }

    @GetMapping(value = "/contact/{UserName}")
    public List <Employee> findByName(@PathVariable final String UserName){
        return controllerService.findEmployeeByName(UserName);
    }

    @GetMapping(value = "/job/all")
    public List<EmployeeJob> getAllJobs(){
        return controllerService.getAllJobsOfEmployee();
    }

    @GetMapping(value = "/job/{UserName}")
    public List <EmployeeJob> findJobByName(@PathVariable final String UserName){
        return controllerService.findJobByEmployeeName(UserName);
    }

    @GetMapping(value = "/manager/all")
    public List<Manager> getAllManager(){
        return controllerService.getAllOfManager();
    }

    @GetMapping(value = "/manager/{UserName}")
    public List <Manager> findManagerByName(@PathVariable final String UserName){
        return controllerService.findManagerByUserName(UserName);
    }

    @GetMapping(value = "/manager/id/{ManagerId}")
    public List <Manager> findEmpByName(@PathVariable final String ManagerId){
        return controllerService.findEmpByMangerId(ManagerId);
    }


}

