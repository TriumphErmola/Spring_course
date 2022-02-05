package hibernate_test2;


import hibernate_test2.Entity.Detail;
import hibernate_test2.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Create {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Andrey", "Ermolenko", "Welder", 45000);
//            Detail detail = new Detail("Omsk", "+79131431287", "xramovic@yandex.ru");
//            employee.setEmpdetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Успешное добавление");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Montajnik", 40000);
//            Detail detail = new Detail("Omsk", "+79152434576", "xramovic1@mail.ru");
//            employee.setEmpdetail(detail);
//            session.beginTransaction();
//            session.save(employee);
//            session.getTransaction().commit();
//            System.out.println("Успешное добавление");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Успешное добавление");
        } finally {
            session.close();
            factory.close();
        }
    }
}
