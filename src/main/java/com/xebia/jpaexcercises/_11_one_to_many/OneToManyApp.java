package com.xebia.jpaexcercises._11_one_to_many;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToManyApp {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("jpa-examples-pu");
            entityManager = entityManagerFactory.createEntityManager();
            entityManager.getTransaction().begin();

            Department department = new Department();
            department.setName("department");
            entityManager.persist(department);

            Employee employee = new Employee();
            employee.setName("Test Employee");
            employee.setSalary(100_000);
            department.addEmployee(employee);
            entityManager.persist(employee);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManager = entityManagerFactory.createEntityManager();
            System.out.println("Finding Employee");
            Employee foundEmployee = entityManager.find(Employee.class, employee.getId());
            System.out.println(foundEmployee);
            System.out.println("Found Employee");
            System.out.println("Finding Department");
           Department findDepartment= entityManager.find(Department.class,department.getId());
           System.out.println(findDepartment);
            System.out.println("Found Department");

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);

        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }

    }
}
