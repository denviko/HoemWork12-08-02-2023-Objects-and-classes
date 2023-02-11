package HW12;

public class Book {
    private String author;
    private String bookName;
    private int publicationYear;


    public Book(String author,String bookName, int publicationYear) {
        this.author = author;
        this.bookName = bookName;
        this.publicationYear = publicationYear;
    }
        public String getAuthor () {
            return author;

        }
        public String getBookName () {
            return bookName;
        }
        public int getPublicationYear () {
            return publicationYear;
        }

        public void setPublicationYear ( int publicationYear){
            this.publicationYear = publicationYear;
        }


    }

