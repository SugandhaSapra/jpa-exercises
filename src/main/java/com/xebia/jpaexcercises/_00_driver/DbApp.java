package com.xebia.jpaexcercises._00_driver;

//import com.xebia.jpaexcercises._01_access.EmployeeWithFieldAccess;
//import com.xebia.jpaexcercises._01_access.EmployeeWithMixedAccess;
//import com.xebia.jpaexcercises._01_access.EmployeeWithPropertyAccess;
//import com.xebia.jpaexcercises._03_lazy.Employee;
//import com.xebia.jpaexcercises._04_lob.Employee;
import com.xebia.jpaexcercises._05_enum.EmployeeType;
import com.xebia.jpaexcercises._07_id_gen.Employee;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.File;
import java.io.FileInputStream;

public class DbApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa-examples-pu");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        /*EmployeeWithFieldAccess employee = new EmployeeWithFieldAccess();
        employee.setId(1L);
        employee.setName("Test Employee");
        employee.setEmail("test@test.com");
        entityManager.persist(employee);
        EmployeeWithFieldAccess foundEmployeeWithFieldAccess = entityManager.find(EmployeeWithFieldAccess.class, 1L);
        System.out.println(foundEmployeeWithFieldAccess);

        EmployeeWithMixedAccess employeeWithMixedAccess = new EmployeeWithMixedAccess();
        employeeWithMixedAccess.setId(2L);
        employeeWithMixedAccess.setUsername("Test Employee");
        employeeWithMixedAccess.setEmailAddress("test@test.com");
        entityManager.persist(employeeWithMixedAccess);
        EmployeeWithMixedAccess foundEmployeeWithMixedAccess=entityManager.find(EmployeeWithMixedAccess.class,2L);
        System.out.println(foundEmployeeWithMixedAccess);

        EmployeeWithPropertyAccess employeeWithPropertyAccess = new EmployeeWithPropertyAccess();
        employeeWithPropertyAccess.setId(3L);
        employeeWithPropertyAccess.setName("Test Employee");
        employeeWithPropertyAccess.setEmail("test@test.com");
        entityManager.persist(employeeWithPropertyAccess);
        //entityManager.getTransaction().commit();
        EmployeeWithPropertyAccess foundEmployeeWithPropertyAccess=entityManager.find(EmployeeWithPropertyAccess.class,3L);
        System.out.println(foundEmployeeWithPropertyAccess);*/


      /*  Employee lazyEmployee= new Employee();
        lazyEmployee.setId(1L);
        lazyEmployee.setName("Sample");
        lazyEmployee.setBio("Sample");
        entityManager.persist(lazyEmployee);
        entityManager.getTransaction().commit();
        entityManager.close();
        //entityManager = entityManagerFactory.createEntityManager();
        Employee foundEmployee=entityManager.find(Employee.class,1L);
        System.out.println(foundEmployee);*/


       /* Employee lobEmployee=new Employee();
        lobEmployee.setId(1L);
        lobEmployee.setName("Sample");
        lobEmployee.setBio("Sample");
        File file = new File("D:\\personal\\pic.jpg");
        byte[] bFile = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            //convert file into array of bytes
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        lobEmployee.setPicture(bFile);

        entityManager.persist(lobEmployee);*/


      /* Employee  enumEmployee=new Employee();
        enumEmployee.setBio("Sample");
        enumEmployee.setEmployeeType(EmployeeType.FULL_TIME);
        enumEmployee.setId(1L);
        enumEmployee.setName("Sample");
        entityManager.persist(enumEmployee);*/

        /*Employee tableGeneratorEmployee=new Employee();
        tableGeneratorEmployee.setId(1L);
        tableGeneratorEmployee.setName("Sample");
        tableGeneratorEmployee.setBio("Sample");
        entityManager.persist(tableGeneratorEmployee);
        entityManager.getTransaction().commit();
        Employee foundTableGeneratorEmployee=entityManager.find(Employee.class,1L);
        System.out.println(foundTableGeneratorEmployee);*/



        entityManager.close();
        entityManagerFactory.close();

    }
}
