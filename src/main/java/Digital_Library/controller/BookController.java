package Digital_Library.controller;

import Digital_Library.entity.Book;
import Digital_Library.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @GetMapping("/")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/search")
    public Optional<Book> searchBook(@RequestParam(required = false) String bookId, @RequestParam(required = false) String title) {
        if (bookId != null) {
            return bookService.getBookById(bookId);
        }
        if (title != null) {
            return bookService.getBookByTitle(title);
        }
        return Optional.empty();
    }

    @PutMapping("/update/{bookId}")
    public Book updateBook(@PathVariable String bookId, @RequestBody Book book) {
        return bookService.updateBook(bookId, book);
    }

    @DeleteMapping("/delete/{bookId}")
    public void deleteBook(@PathVariable String bookId) {
        bookService.deleteBook(bookId);
    }
}
