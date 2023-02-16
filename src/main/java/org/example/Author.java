package org.example;

public class Author
{
    String firstName;
    String lastName;

    public Author author(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName  = lastName;
        return author(firstName, lastName);
    }

    public String getName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }
}

