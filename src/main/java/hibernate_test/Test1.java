package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee1 = new Employee("Manarbek", "Shahmanov", "Omus-1", 40000);
            session.beginTransaction();
            session.save(employee1);
            session.getTransaction().commit();
            System.out.println("Успешное добавление");
        } finally {
            factory.close();
        }
    }
}
