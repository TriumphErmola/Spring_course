package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee1 = new Employee("Alexander", "Gachini", "Omus-1", 55000);
            session.beginTransaction();
            session.save(employee1);
            session.getTransaction().commit();
            System.out.println("Успешное добавление");
        } finally {
            factory.close();
        }
    }
}
