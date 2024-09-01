package pro.sky.CollectionsVarietyOfImplementations.service;

import org.springframework.stereotype.Service;
import pro.sky.CollectionsVarietyOfImplementations.models.Employee;
import pro.sky.CollectionsVarietyOfImplementations.exceptions.EmployeeAlreadyAddedException;
import pro.sky.CollectionsVarietyOfImplementations.exceptions.EmployeeNotFoundException;
import pro.sky.CollectionsVarietyOfImplementations.models.Passport;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public HashMap<Passport, Employee> employeeBook;

    public EmployeeServiceImpl() {
        this.employeeBook = new HashMap<>();
    }

    @Override
    public Employee addEmployee(String passportNumber, String firstName, String lastName) {
        Passport newPassport = new Passport(passportNumber);
        Employee newEmployee = new Employee(firstName, lastName);
        if (employeeBook.containsKey(newPassport)) {
            throw new EmployeeAlreadyAddedException();
        } else {
            employeeBook.put(newPassport, newEmployee);
            return newEmployee;
        }
    }

    @Override
    public Employee removeEmployee(String passportNumber) {
        Passport removedByPassport = new Passport(passportNumber);
        Employee removedEmployee = employeeBook.get(removedByPassport);
        if (employeeBook.containsKey(removedByPassport)) {
            employeeBook.remove(removedByPassport);
            return removedEmployee;
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Employee findEmployee(String passportNumber) {
        Passport foundEmployee = new Passport(passportNumber);
        if (!employeeBook.containsKey(foundEmployee)) {
            throw new EmployeeNotFoundException();
        } else {
            return employeeBook.get(foundEmployee);
        }
    }
}
