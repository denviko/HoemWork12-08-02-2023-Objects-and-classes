package HW12;

import java.util.Objects;

public class Book {
    private final Author author;
    private final String bookName;
    private int publicationYear;


    public Book(Author author,String bookName, int publicationYear) {
        this.author = author;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
    }
        public Author getAuthor () { return author; }
        public String getBookName () {
            return bookName;
        }
        public int getPublicationYear () {
            return publicationYear;
        }

        public void setPublicationYear ( int publicationYear){
            this.publicationYear = publicationYear;
        }

        public String toString(){
        return "Имя автора " + this.author + " название произведения " + this.bookName + " год публикации " + this.publicationYear;

        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(author, book.author) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, bookName, publicationYear);
    }



    }

