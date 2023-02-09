package HW12;


public class MainHW12ObjectsAndClasses {

    public static void main(String[] args) {
        Book warAndPeace = new Book ("War and Peace",1869);
        System.out.println("warAndPeace.bookName = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.publicationYear = " + warAndPeace.getPublicationYear());
        warAndPeace.setPublicationYear(1875);
        System.out.println("warAndPeace.getPublicationYear() = " + warAndPeace.getPublicationYear());

        Book theMasterAndMargarita = new Book("The Master and Margarita",1967);
        System.out.println("theMasterAndMargarita.bookName = " + theMasterAndMargarita.getBookName());
        System.out.println("theMasterAndMargarita.publicationYear = " + theMasterAndMargarita.getPublicationYear());
        theMasterAndMargarita.setPublicationYear(1988);
        System.out.println("theMasterAndMargarita.getPublicationYear() = " + theMasterAndMargarita.getPublicationYear());

        Author leo = new Author("Leo Tolstoy");
        System.out.println("leo.authorName = " + leo.getAuthorName());

        Author mikhail = new Author("Mihkail Bulgakov");
        System.out.println("mikhail.authorName = " + mikhail.getAuthorName());


    }



}
