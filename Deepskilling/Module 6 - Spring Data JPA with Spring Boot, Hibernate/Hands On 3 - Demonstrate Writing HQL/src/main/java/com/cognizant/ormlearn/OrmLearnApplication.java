package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.*;
import com.cognizant.ormlearn.repository.CountryRepository;
import com.cognizant.ormlearn.repository.StockRepository;
import com.cognizant.ormlearn.service.DepartmentService;
import com.cognizant.ormlearn.service.EmployeeService;
import com.cognizant.ormlearn.service.SkillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;
import java.util.List;
import java.math.BigDecimal;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryRepository countryRepository;

    private static StockRepository mystockrepo;

    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryRepository = context.getBean(CountryRepository.class);
        mystockrepo=context.getBean(StockRepository.class);

        employeeService=context.getBean(EmployeeService.class);
        departmentService=context.getBean(DepartmentService.class);
        skillService=context.getBean(SkillService.class);
/*
        testSearchCountry();
        testSearchCountrySorted();
        testCountryByLetter();
        getFaceBookSeptember();
        getGoogleAbove1250();
        returnTop3DatesByVolume();
        getNetflix3LowestPrice();

        testGetEmployee();
        testAddEmployee();
        testUpdateEmployee();

        testGetDepartment();
        testAddSkillToEmployee();
 */
        testGetAllPermanentEmployees();
    }

    private static void testSearchCountry() {
        LOGGER.info("Start");
        List<Country> results = countryRepository.findByNameContaining("ou");
        results.forEach(c -> LOGGER.debug("{}", c));
        LOGGER.info("End");
    }

    private static void testSearchCountrySorted() {
        LOGGER.info("Start");
        List<Country> results = countryRepository.findByNameContainingOrderByNameAsc("ou");
        results.forEach(c -> LOGGER.debug("{}", c));
        LOGGER.info("End");
    }

    private static void testCountryByLetter() {
        LOGGER.info("Start");
        List<Country> results = countryRepository.findByNameStartingWith("Z");
        results.forEach(c -> LOGGER.debug("{}", c));
        LOGGER.info("End");
    }


    //Get stock Details of FaceBook in September 2019
    private static void getFaceBookSeptember() {
        LOGGER.info("Start");
        List<Stock> results = mystockrepo.findByCodeAndDateBetween("FB", LocalDate.of(2019, 9, 1), LocalDate.of(2019, 9, 30));
        results.forEach(s -> LOGGER.debug("{}", s));
        LOGGER.info("End");
    }

    //Get all Google Stock Details where price is Greater than 1250
    private static void getGoogleAbove1250() {
        LOGGER.info("Start");
        List<Stock> results = mystockrepo.findByCodeAndCloseGreaterThan("GOOGL", BigDecimal.valueOf(1250));
        results.forEach(s -> LOGGER.debug("{}", s));
        LOGGER.info("End");
    }

    //Find the top 3 dates which had highest volume of transactions
    private static void returnTop3DatesByVolume() {
        LOGGER.info("Start");
        List<Stock> result = mystockrepo.findTop3ByOrderByVolumeDesc();
        result.forEach(s -> LOGGER.debug("{}", s));
        LOGGER.info("END");
    }
    //Identify three dates when Netflix stocks were the lowest
    private static void getNetflix3LowestPrice(){
        LOGGER.info("Start");
        List<Stock>result=mystockrepo.findTop3ByCodeOrderByCloseAsc("NFLX");
        result.forEach(s->LOGGER.debug("{}",s));
        LOGGER.info("End");
    }

    //get employee joining department with many-to-one relationship
    private static void testGetEmployee() {

        LOGGER.info("Start");

        Employee employee =
                employeeService.get(1);

        LOGGER.debug("Employee:{}", employee);

        LOGGER.debug("Department:{}",
                employee.getDepartment());

        LOGGER.info("End");
    }

    //Add Employee
    private static void testAddEmployee() {

        LOGGER.info("Start");

        Employee employee = new Employee();
        employee.setName("Mabud");
        employee.setSalary(50000);
        employee.setPermanent(true);
        employee.setDateOfBirth(java.sql.Date.valueOf("1995-06-15"));
        Department department = departmentService.get(1);
        employee.setDepartment(department);
        employeeService.save(employee);
        LOGGER.debug("Employee: {}", employee);
        LOGGER.info("End");
    }
    //update emplyee
    private static void testUpdateEmployee() {
        LOGGER.info("Start");
        Employee employee = employeeService.get(1);
        Department department = departmentService.get(3);
        employee.setDepartment(department);
        employeeService.save(employee);
        LOGGER.debug("Employee: {}", employee);
        LOGGER.info("End");
    }

    //one to many
    private static void testGetDepartment() {
        LOGGER.info("Start");
        Department department =
                departmentService.get(2);
        LOGGER.debug("Department: {}", department);
        LOGGER.debug("Employees: {}",
                department.getEmployeeList());
        LOGGER.info("End");
    }

    //Add Skills to Employee
    private static void testAddSkillToEmployee() {

        LOGGER.info("Start");

        Employee employee = employeeService.get(1);

        Skill skill = skillService.get(3);

        employee.getSkillList().add(skill);

        employeeService.save(employee);

        LOGGER.info("End");
    }

    public static void testGetAllPermanentEmployees() {
        LOGGER.info("Start");
        List<Employee> employees = employeeService.getAllPermanentEmployees();
        LOGGER.debug("Permanent Employees:{}", employees);
        employees.forEach(e -> LOGGER.debug("Skills:{}", e.getSkillList()));
        LOGGER.info("End");
    }

}