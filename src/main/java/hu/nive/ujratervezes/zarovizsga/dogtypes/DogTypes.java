package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.springframework.jdbc.core.JdbcTemplate;
import javax.sql.DataSource;
import java.util.List;

public class DogTypes {

    private JdbcTemplate jdbcTemplate;

    public DogTypes(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<String> getDogsByCountry(String country) {
        return jdbcTemplate.query("SELECT lower(NAME) AS NAME FROM dog_types WHERE lower(country) = lower(?) ORDER BY NAME",
                (resultSet, i) -> resultSet.getString("name"),
                country);
    }
}
