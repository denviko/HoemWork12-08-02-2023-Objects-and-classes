package HW12;

import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }


    public String getAuthorName() {
        return authorName;

    }

    public String getAuthorSurname() {
        return authorSurname;

    }

    public String toString() {
        return "Имя автора " + this.authorName + " фамилия автора " + this.authorSurname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorSurname == author.authorSurname && Objects.equals(author, author.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSurname);


    }
}


