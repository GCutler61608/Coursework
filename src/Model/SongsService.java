package Model;

import java.io.Console;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SongsService {


    /*public static Song selectById(int id, DatabaseConnection database) {

        Song result = null;

        PreparedStatement statement = database.newStatement("SELECT songID, songName, albumID, songDuration, featureID, songDateAdded FROM Song WHERE songID = ?");

        try {
            if (statement != null) {

                statement.setInt(1,id);
                ResultSet results = database.executeQuery(statement);

                if (results != null) {
                    result = new Song(results.getInt("songID"), results.getString("songName"), results.getString("albumID"), results.getString("featureID"), results.getString("songDateAdded"), results.getString("songDuration"));
                }
            }
        } catch (SQLException resultsException) {
            System.out.println("SELECTION ERROR: " + resultsException.getMessage());
        }

        return result;
    }*/
}




