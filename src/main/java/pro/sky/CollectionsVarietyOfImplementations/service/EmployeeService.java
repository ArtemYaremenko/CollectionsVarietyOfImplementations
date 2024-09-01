package pro.sky.CollectionsVarietyOfImplementations.service;

import pro.sky.CollectionsVarietyOfImplementations.models.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee addEmployee(String passportNumber, String firstName, String lastName);

    Employee removeEmployee(String passportNumber);

    Employee findEmployee(String passportNumber);
}
