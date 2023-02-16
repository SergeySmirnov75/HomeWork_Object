package org.example;

/*
public class Book
{
    String authorName;
    String bookName;
    int publishingYear;

    public Book(String authorName, String bookName, int publishingYear)
    {
        this.authorName     = authorName;
        this.bookName       = bookName;
        this.publishingYear = publishingYear;
    }

    public String getAuthorName()
    {
        return this.authorName;
    }

    public String getBookName()
    {
        return this.bookName;
    }

    public int getPublishingYear()
    {
        return this.publishingYear;
    }

    public void setPublishingYear(int year)
    {
        this.publishingYear = year;
    }
}

*/
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Author firstAuthor  = new Author();
        Author secondAutor  = new Author();
        Author thirdAuthor  = new Author();

        firstAuthor.firstName = "Александр";
        firstAuthor.lastName  = "Пушкин";
        secondAutor.firstName = "Лев";
        secondAutor.lastName  = "Толстой";
        thirdAuthor.firstName = "Братья";
        thirdAuthor.lastName = "Гримм";

        Book firstBook      = new Book(firstAuthor, "Моя первая книга", 2023);
        Book secondBook     = new Book(thirdAuthor, "Гензель и Гретта", 1812);
        Book thirdBook      = new Book(secondAutor, "Война и мир", 1873);

    }
}


//1

/*
public class Main
{
    public static void main(String[] args)
    {
        Book.firstBook    = new Book("S. N. Smirnov", "Моя первая книга", 2023);
        Book.secondBook   = new Book("Br. Greem", "Гензель и Гретта", 1812);

        Author.firstAuthor  = new Author("Александр", "Пушкин");
        Author.secondAutor = new Author("Лев", "Толстой");


        Person.sarah = new Person("Sarah", 30);
        Person.john  = new Person("John", 13);
        //System.out.println("sarah.name = " + sarah.name);
        //System.out.println("sarah.age = " + sarah.age);
        System.out.println("john.name = " + john.name);
        System.out.println("john.age = " + john.age);

        System.out.println("sarah.name = " + sarah.getName());
        System.out.println("sarah.age = "  + sarah.age());

        sarah.setAge(36);
        System.out.println("sarah.getAge = "  + sarah.age());

    }
}
*/