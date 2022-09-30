public class Author {
    private final String authorName; // Имя
    private final String authorSurname; // Фамилия

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getAuthorName() {

        return this.authorName;
    }

    public String getAuthorSurname() {

        return this.authorSurname;
    }
}
