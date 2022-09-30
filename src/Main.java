public class Main {
    public static void main(String[] args) {

        Author johnTolkien = new Author("John", "Tolkien");
        Book theLordOfTheRings = new Book("The Lord of the Rings", 1954, johnTolkien);

        Author joanneRowling = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter", 1997, joanneRowling );


        System.out.println("theLordOfTheRings.getPublisherName() = " + theLordOfTheRings.getPublisherName() + " " + theLordOfTheRings.getPublishingYear() + " Author- " + johnTolkien.getAuthorName() + " " + johnTolkien.getAuthorSurname());
        theLordOfTheRings.setPublishingYear(1955);
        System.out.println("theLordOfTheRings.getPublishingYear() = " + theLordOfTheRings.getPublishingYear());

        System.out.println("harryPotter.getPublisherName() = " + harryPotter.getPublisherName() + " " + harryPotter.getPublishingYear() + " Author- " + joanneRowling.getAuthorName() + " " + joanneRowling.getAuthorSurname());
        harryPotter.setPublishingYear(2001);
        System.out.println("harryPotter.getPublishingYear() = " + harryPotter.getPublishingYear());

        System.out.println("johnTolkien.getAuthorName() = " + johnTolkien.getAuthorName() + " " + johnTolkien.getAuthorSurname() + " Book- " + theLordOfTheRings.getPublisherName());
        System.out.println("joanneRowling.getAuthorName() = " + joanneRowling.getAuthorName() + " " + joanneRowling.getAuthorSurname() + " Book- " + harryPotter.getPublisherName());
    }
}