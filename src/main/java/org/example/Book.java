package org.example;

public class Book
{
    Author author;
    String bookName;
    int publishingYear;

    public Book(Author author, String bookName, int publishingYear)
    {
        this.author         = author;
        this.bookName       = bookName;
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName()
    {
        return this.author;
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
