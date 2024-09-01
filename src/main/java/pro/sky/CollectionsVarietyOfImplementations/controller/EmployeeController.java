package pro.sky.CollectionsVarietyOfImplementations.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.CollectionsVarietyOfImplementations.models.Employee;
import pro.sky.CollectionsVarietyOfImplementations.service.EmployeeService;

import java.util.Collection;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public Employee add(@RequestParam("passportnumber") String passportNumber, @RequestParam("firstname") String firstName, @RequestParam("lastname") String lastName) {
       return employeeService.addEmployee(passportNumber, firstName, lastName);
    }

    @GetMapping("/remove")
    public Employee remove(@RequestParam("passportnumber") String passportNumber) {
        return employeeService.removeEmployee(passportNumber);
    }

    @GetMapping("/find")
    public Employee find(@RequestParam("passportnumber") String passportNumber) {
        return employeeService.findEmployee(passportNumber);
    }

}
