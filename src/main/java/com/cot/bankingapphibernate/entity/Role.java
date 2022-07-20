package com.cot.bankingapphibernate.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "role")
    private String role;

//    @ManyToMany
//    @JoinTable(name = "l_author_book",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
//    @JsonIgnoreProperties("authors")
//    private List<Book> books;
}
