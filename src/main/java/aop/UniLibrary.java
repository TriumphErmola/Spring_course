package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary : ");
    }

    public void returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary");

    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
    }

    public void returnMagazine() {
        System.out.println("Возвращаем журнал в UniLibrary");
    }

    public void addBook() {
        System.out.println("Мы добавляем книгу в UniLibrary");
    }

    public void addMagazine() {
        System.out.println("Мы добавляем журнал в UniLibrary");
    }


}
