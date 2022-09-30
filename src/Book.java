public class Book {

    private final String author;
    private final String publisherName; // Название
    private int publishingYear; // Год публикации

    public Book(String publisherName, int publishingYear, String author) {
        this.author = author;
        this.publisherName = publisherName;
        this.publishingYear = publishingYear;
    }
    public String getAuthor() {
        return this.author;
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
