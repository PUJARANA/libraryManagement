package library.controller;

import library.model.LibraryRespDto;
import library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    /*
    This controller class is the entry point to all incoming request
    @author:Pooja
     */
    @RestController
    @RequestMapping("library/books")
    public class LibraryController {

        @Autowired
        private LibraryService libraryService;

        @GetMapping
        public LibraryRespDto getBooks() {
            return libraryService.getBooks();
         }


    }

