package com.example.SoilderDemo.Entity;

import jakarta.persistence.*;





// The @Entity annotation is used to mark a Java class as an entity.
// An entity represents a table in a relational database.
// It tells JPA that this class should be mapped to a database table.
// Each instance of this class will represent a row in that table.
// The class must have a no-argument constructor and a primary key.
@Entity
public class Soilder {
    // Marks this field as the primary key of the entity
    @Id
    // Specifies how the primary key should be generated
    // Other Generated Strategies:
    // 1. GenerationType.AUTO: Lets the persistence provider choose the strategy
    // 2. GenerationType.SEQUENCE: Uses a database sequence to generate values
    // 3. GenerationType.TABLE: Uses a separate table to generate key values
    // 4. GenerationType.IDENTITY (current): Relies on an auto-incrementing database column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    /*
         Columns = specify the details of the column to which a field will be mapped in the database table
         nullable = false means that this column cannot be null
         unique = true means that this column must have a unique value for each row in the table
         name = map the field to a specific column name in the database table
        */
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private int age;

    @Column(name="rank",nullable = false)
    private String rank;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
