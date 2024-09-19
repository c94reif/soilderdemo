package com.example.SoilderDemo.Repo;

import com.example.SoilderDemo.Entity.Soilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


// A JPA Repository is an abstraction that provides a higher-level interface for
// interacting with databases in Spring applications. It extends and enhances the
// basic CRUD (Create, Read, Update, Delete) operations.

// Key differences from basic CRUD:
// 1. Query Methods: JPA Repos allow defining custom query methods by method names.
// 2. Pagination and Sorting: Built-in support for paginated queries and sorting.
// 3. Transactional behavior: Automatic transaction management.
// 4. Type-safety: Strongly typed queries and results.
// 5. Advanced querying: Supports complex queries with @Query annotation.
// 6. Flexibility: Can be extended or customized for specific needs.

// While CRUD provides basic database operations, JPA Repositories offer a more
// powerful and Spring-integrated way to interact with your data layer.

public interface SoilderRepo extends JpaRepository<Soilder, Long>{  // JpaRepository provides CRUD operations
    Soilder findByFirstName(String firstName);  // Custom method to find a soilder by first name
    Soilder findByLastName(String lastName);  // Custom method to find a soilder by first name
    Soilder findByAge(int age);  // Custom method to find a soilder by age
    Soilder findByRank(String rank);  // Custom method to find a soilder by rank

    //Advanced custom queries
    @Query("SELECT s FROM Soilder s WHERE s.age > :minAge AND s.rank = :rank")
    List<Soilder> findSoildersByAgeAndRank(@Param("minAge") int minAge, @Param("rank") String rank);

}
