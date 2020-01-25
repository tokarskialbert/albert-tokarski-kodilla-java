package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHandsOfWhenUserDidntBorrowAnyBook() {

        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Albert", "Tokarski", "11111111111");
        List<Book> resultListOf10Books = new ArrayList<>();

        //when
        List<Book> resultList =bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertTrue(resultList.isEmpty());
    }

    @Test
    public void testListBooksInHandsOfWhenUserBorrowedOneBook() {

        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Albert", "Tokarski", "11111111111");
        List<Book> resultListOf1Books = new ArrayList<>();
        resultListOf1Books.add(new Book("title", "me", 2020));

        bookLibrary.listBooksInHandsOf(libraryUser).add(new Book("title2", "me", 2025));


        //when
        List<Book> resultList =bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(resultListOf1Books.size(), resultList.size());
    }

    @Test
    public void testListBooksInHandsOfWhenUserBorrowedFiveBooks() {

        //given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Albert", "Tokarski", "11111111111");
        List<Book> resultListOf1Books = new ArrayList<>();
        resultListOf1Books.add(new Book("title", "me", 2020));
        resultListOf1Books.add(new Book("title2", "me", 2020));
        resultListOf1Books.add(new Book("title3", "me", 2020));
        resultListOf1Books.add(new Book("title4", "me", 2020));
        resultListOf1Books.add(new Book("title5", "me", 2020));


        bookLibrary.listBooksInHandsOf(libraryUser).add(new Book("title", "me", 2025));
        bookLibrary.listBooksInHandsOf(libraryUser).add(new Book("title1", "me", 2024));
        bookLibrary.listBooksInHandsOf(libraryUser).add(new Book("title2", "me", 2023));
        bookLibrary.listBooksInHandsOf(libraryUser).add(new Book("title3", "me", 2022));
        bookLibrary.listBooksInHandsOf(libraryUser).add(new Book("title4", "me", 2021));

        //when
        List<Book> resultList =bookLibrary.listBooksInHandsOf(libraryUser);

        //then
        assertEquals(resultListOf1Books.size(), resultList.size());
    }
}
