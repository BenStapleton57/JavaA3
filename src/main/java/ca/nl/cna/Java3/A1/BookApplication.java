package ca.nl.cna.Java3.A1;

import java.sql.*;

public class BookApplication {
    public static void main(String[] args) {
        System.out.println("Fun with testing our Books DB");

        try(Connection conn = DriverManager.getConnection(BookDatabaseManager.JAVA_BOOKS_DB_URL);
        ) {
            System.out.println("Print Authors Table");
            printAuthorsTable(conn);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void printAuthorsTable(Connection connection) throws SQLException{
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(BooksDBProperties.QUERY_ALL_AUTHORS);
        printResultSetIntoTable(rs);
    }

    private static void printResultSetIntoTable(ResultSet rs) throws SQLException{
        ResultSetMetaData rsMetaData = rs.getMetaData();
        int count = rsMetaData.getColumnCount();
        for(int i = 1; i<=count; i++) {
            //TODO resize tables
            System.out.printf("%-20s ", rsMetaData.getColumnName(i));
        }
        System.out.println();

        while (rs.next()) {
            for (int i = 1; i<=count; i++) {
                System.out.printf("%-20s ", rs.getString(rsMetaData.getColumnName(i)));
            }
            System.out.println();
        }
    }
}
