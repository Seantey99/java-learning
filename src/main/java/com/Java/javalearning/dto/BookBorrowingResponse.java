package com.Java.javalearning.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BookBorrowingResponse {
    private Data data;

    @Getter
    @Setter
    public static class Data{
        private String name;
        private String id;
        private BookDetails bookDetails;
    }

    @Getter
    @Setter
    public static class BookDetails{
        private String bookName;
        private String bookId;
        private LocalDate borrowedDateTime;
        private LocalDate returnedDateTime;
    }
}
