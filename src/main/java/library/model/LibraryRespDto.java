package library.model;

import java.util.ArrayList;
import java.util.List;

public class LibraryRespDto {
    private List<BooksDto> booksDtos = new ArrayList<>();
    private String status;

    public LibraryRespDto() {
    }

    public LibraryRespDto(List<BooksDto> booksDtos, String status) {
        this.booksDtos = booksDtos;
        this.status = status;
    }

    public List<BooksDto> getBooksDtos() {
        return booksDtos;
    }

    public void setBooksDtos(List<BooksDto> booksDtos) {
        this.booksDtos = booksDtos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
