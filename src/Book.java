public class Book {
    private final String publisherName; // Название
    private int publishingYear; // Год публикации

    public Book(String publisherName, int publishingYear) {
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
