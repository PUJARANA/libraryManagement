package library.entity;



import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User implements Serializable {
    @Id
    private Long id;

    @NotNull
    @Column
    private String name;

    @NotNull
    @Column
    private String email;

    @NotNull
    @Column(name = "books_limit")
    private Long booksLimit;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "borrowed_books",
            joinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "id",
                            nullable = false, updatable = false)},
            inverseJoinColumns = {
                    @JoinColumn(name = "book_id", referencedColumnName = "id",
                            nullable = false, updatable = false)})
    private Set<Books> borrowedBooksSet = new HashSet<>();

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getBooksLimit() {
        return booksLimit;
    }

    public void setBooksLimit(Long booksLimit) {
        this.booksLimit = booksLimit;
    }

    public Set<Books> getBorrowedBooksSet() {
        return borrowedBooksSet;
    }

    public void setBorrowedBooksSet(Set<Books> borrowedBooksSet) {
        this.borrowedBooksSet = borrowedBooksSet;
    }
}
