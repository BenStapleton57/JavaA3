package ca.nl.cna.Java3.A1;

public class BookDatabaseManager {
    static final String DB_URL = "jdbc:mariadb://localhost:3307";

    static final String USER = "root";
    static final String PASS = "password1";

    static final String JAVA_BOOKS_DB_URL = "jdbc:mariadb://localhost:3307/books?user=root&password=password1";

    static final String QUERY_ALL_AUTHORS = "SELECT * FROM authors;";
}
