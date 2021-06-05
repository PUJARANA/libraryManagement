package library.model;

public class BooksDto {

    private long id;
    private String name;
    private String authorName;
    private long copies;

    public BooksDto(long id, String name, String authorName, long copies) {
        this.id = id;
        this.name = name;
        this.authorName = authorName;
        this.copies = copies;
    }

    public BooksDto() {
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
