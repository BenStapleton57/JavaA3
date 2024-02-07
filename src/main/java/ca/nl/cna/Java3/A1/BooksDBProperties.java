package ca.nl.cna.Java3.A1;

public class BooksDBProperties {
    //static final String DB_URL = "jdbc:mariadb://localhost:3307";

    //?user=root&password=RootPwJoSh2024
    //static final String USER = "root";
    //static final String PASS = "password1";

    //Specific test database URL
    static final String JAVA_BOOKS_DB_URL = "jdbc:mariadb://localhost:3307/books?user=root&password=password1";

    static final String QUERY_ALL_AUTHORS = "SELECT * FROM authors;";
    static final String QUERY_ALL_TITLES = "SELECT * FROM titles;";
}
