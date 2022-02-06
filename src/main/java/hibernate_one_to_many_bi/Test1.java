package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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
//            Department dep = new Department("Welders",500,1500);
//            Employee emp1 = new Employee("Andrey","Ermolenko",1500);
//            Employee emp2 = new Employee("Kirill","Ermolaev",1000);
//            Employee emp3 = new Employee("Alexey","Smirnov",500);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//            session.beginTransaction();
//            session.save(dep);
//            session.getTransaction().commit();
//            System.out.println("Успешное выполнение");
//*******************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();
            System.out.println("Get Department");
            Department department = session.get(Department.class, 10);
            System.out.println("Show Department");
            System.out.println(department);
//            System.out.println("Show Employees of the Department");
//            System.out.println(department.getEmps());

            System.out.println("Подгрузим наших работников");
            department.getEmps().get(0);


            session.getTransaction().commit();
            System.out.println("Show Employees of the Department");
            System.out.println(department.getEmps());
            System.out.println("Успешное выполнение");
//*******************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//            session.getTransaction().commit();
//            System.out.println("Успешное выполнение");
//*******************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);
//            session.getTransaction().commit();
//            System.out.println("Успешное выполнение");
        } finally {
            session.close();
            factory.close();

        }
    }
}
