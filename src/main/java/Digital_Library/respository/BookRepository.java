package Digital_Library.respository;

import Digital_Library.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String> {
    Optional<Book> findByBookId(String bookId);
    Optional<Book> findByTitle(String title);
}
