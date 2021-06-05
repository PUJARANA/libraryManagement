package library.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "books")
public class Books implements Serializable {

    @Id
    private long id;

    @Column
    @NotNull
    private String name;

    @Column(name = "author_name")
    @NotNull
    private String authorName;

    @Column
    @NotNull
    private long copies;

    @ManyToMany(mappedBy = "borrowedBooksSet", fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();

    public Books() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getCopies() {
        return copies;
    }

    public void setCopies(long copies) {
        this.copies = copies;
    }
}
