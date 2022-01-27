package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    @Override
    public void getBook() {
        System.out.println("Мы берём книгу из UniLibrary");
    }

    public String returnBook() {
        System.out.println("Возвращаем книгу в UniLibrary");
        return "ОК";
    }

    public void getMagazine() {
        System.out.println("Мы берём журнал из UniLibrary");
    }
}
