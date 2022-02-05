package hibernate_one_to_one;


import hibernate_one_to_one.Entity.Detail;
import hibernate_one_to_one.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("John", "Jonatan", "IT", 5000);
//            Detail detail = new Detail("NY", "+79152435552", "xrsadqqam1@mail.ru");
//            employee.setEmpdetail(detail);
//            detail.setEmployee(employee);
//            session.beginTransaction();
//            session.save(detail);
//            session.getTransaction().commit();
//            System.out.println("Успешное добавление");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 5);
//            System.out.println(detail.getEmployee());
//
//            session.getTransaction().commit();
//            System.out.println("Успешное добавление");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpdetail(null);
            session.delete(detail);
            session.getTransaction().commit();
            System.out.println("Успешное добавление");


        } finally {
            session.close();
            factory.close();
        }
    }
}
