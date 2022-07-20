package com.cot.bankingapphibernate.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "accouts")
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "iban")
    private String iban;

    @Column(name = "balance")
    private long balance;



//    @ManyToMany
//    @JoinTable(name = "l_author_book",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
//    @JsonIgnoreProperties("authors")
//    private List<Book> books;
}
