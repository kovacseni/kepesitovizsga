package hu.nive.ujratervezes.kepesitovizsga.jurassic;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JurassicPark {

    private DataSource dataSource;

    public JurassicPark(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public List<String> checkOverpopulation() {
        List<String> dinosOverPopulated = new ArrayList<>();
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM dinosaur WHERE actual > expected;")) {

            while (rs.next()) {
                dinosOverPopulated.add(rs.getString("breed"));
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Can not get data.", sqle);
        }
        Collections.sort(dinosOverPopulated);
        return dinosOverPopulated;
    }
}
