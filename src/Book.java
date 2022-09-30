public class Book {

    private final  Author author;
    private final String publisherName; // Название
    private int publishingYear; // Год публикации

    public Book(String publisherName, int publishingYear, Author author) {
        this.author = author;
        this.publisherName = publisherName;
        this.publishingYear = publishingYear;
    }

    public String getPublisherName() {

        return this.publisherName;
    }

    public int getPublishingYear() {

        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }
}
