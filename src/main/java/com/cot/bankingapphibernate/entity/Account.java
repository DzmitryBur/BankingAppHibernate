package com.cot.bankingapphibernate.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "accounts")
@Data
@EqualsAndHashCode(exclude = "transactions")
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

    @OneToMany(mappedBy = "account")
    private Set<Transaction> transactions = new HashSet<>();

//    @ManyToMany
//    @JoinTable(name = "l_author_book",
//            joinColumns = @JoinColumn(name = "author_id"),
//            inverseJoinColumns = @JoinColumn(name = "book_id"))
//    @JsonIgnoreProperties("authors")
//    private List<Book> books;
}
