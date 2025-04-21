// package travel.management.system;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class Conn {

//     Connection c;
//     Statement s;

//     public Conn () {
//         try {
//             // c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Raja Gupta\\IdeaProjects\\" +
//             //         "Travel Management System\\src\\travel\\management\\system\\tms.db");
//             c = DriverManager.getConnection("jdbc:sqlite:travel/management/system/tms.db");


//             s = c.createStatement();

//         } catch (SQLException e) {
//             System.out.println("Something Went Wrong: " + e.getMessage());
//         }
//     }
// }

package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    public Conn () {
        try {
            // Set journal_mode to WAL (Write-Ahead Logging) and busy_timeout for locking issues
            c = DriverManager.getConnection("jdbc:sqlite:travel/management/system/tms.db?journal_mode=WAL&busy_timeout=3000");
            s = c.createStatement();
        } catch (SQLException e) {
            System.out.println("Something Went Wrong: " + e.getMessage());
        }
    }
}
