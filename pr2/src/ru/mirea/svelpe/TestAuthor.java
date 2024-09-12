package ru.mirea.svelpe;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Doncova", "doncova@mail.ru", 'F');
        System.out.println(a1);
        a1.setEmail("doncova@yandex.ru");
        System.out.println(a1);
    }
}
