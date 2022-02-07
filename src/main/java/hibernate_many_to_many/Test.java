package hibernate_many_to_many;

import hibernate_many_to_many.entity.Child;
import hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Gym");
//            Child child1 = new Child("Gachi", 25);
//            Child child2 = new Child("Muchi", 2);
//            Child child3 = new Child("Gachini", 26);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//            session.beginTransaction();
//            session.persist(section1);
//            session.getTransaction().commit();
//            System.out.println("Готово");
//      ******************************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("VolleyBall");
//            Section section2 = new Section("Chess");
//            Section section3 = new Section("Math");
//            Child child1 = new Child("Petr", 10);
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();
//            System.out.println("Готово");
//******************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Section section = session.get(Section.class,3);
//            System.out.println(section);
//            System.out.println(section.getChildren());
//            session.getTransaction().commit();
//            System.out.println("Готово");
//******************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Child child = session.get(Child.class,4);
//            System.out.println(child);
//            System.out.println(child.getSections());
//            session.getTransaction().commit();
//            System.out.println("Готово");
//******************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();
            Section section = session.get(Section.class, 10);
            session.delete(section);
            session.getTransaction().commit();
            System.out.println("Готово");
        } finally {
            session.close();
            factory.close();
        }
    }
}
