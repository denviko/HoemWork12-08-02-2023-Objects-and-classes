package HW12;

public class MainHW12ObjectsAndClasses {

    public static void main(String[] args) {
        Book warAndPeace = new Book ("Leo Tolstoy","War adn Peace",1869);
        System.out.println("warAndPeace.bookName = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.publicationYear = " + warAndPeace.getPublicationYear());
        System.out.println("warAndPeace.author = " + warAndPeace.getAuthor());
        warAndPeace.setPublicationYear(1875);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());

        Book theMasterAndMargarita = new Book("Mikhail Bulgakov","The Master and Margarita",1969);
        System.out.println("theMasterAndMargarita.bookName = " + theMasterAndMargarita.getBookName());
        System.out.println("theMasterAndMargarita.publicationYear = " + theMasterAndMargarita.getPublicationYear());
        System.out.println("theMasterAndMargarita.author = " + theMasterAndMargarita.getAuthor());
        theMasterAndMargarita.setPublicationYear(1988);
        System.out.println("theMasterAndMargarita.getPublicationYear() = " + theMasterAndMargarita.getPublicationYear());

        Author leo = new Author("Leo","Tolstoy");
        System.out.println("leo.authorName = " + leo.getAuthorName());
        System.out.println("leo.getAuthorSurname() = " + leo.getAuthorSurname());


        Author mikhail = new Author("Mikhail","Bulgakov");
        System.out.println("mikhail.authorName = " + mikhail.getAuthorName());
        System.out.println("mikhail.getAuthorSurname() = " + mikhail.getAuthorSurname());


    }
}




