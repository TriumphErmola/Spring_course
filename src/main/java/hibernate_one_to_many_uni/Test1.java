package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.Entity.Department;
import hibernate_one_to_many_uni.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Department dep = new Department("HR",500,1000);
//            Employee emp1 = new Employee("Andrey","Ermolenko",1500);
//            Employee emp2 = new Employee("Viktoria","Ivanova",500);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("Успешное выполнение");
//*******************************************************
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 8);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Успешное выполнение");
//*******************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 8);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//            System.out.println("Успешное выполнение");
//*******************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);
            Department deparment = session.get(Department.class,8);
            session.delete(deparment);
            session.getTransaction().commit();
            System.out.println("Успешное выполнение");
        } finally {
            session.close();
            factory.close();

        }
    }
}
