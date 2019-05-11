/*package by.zelenko.roomswithlamps2.Config;

import lombok.var;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
public class DBConfig  {

    @Bean
    public DataSource dataSource() {

        var builder = new EmbeddedDatabaseBuilder();
        var db = builder
                .setType(EmbeddedDatabaseType.H2)
                .addScript("db/schema.sql")
                .addScript("db/data.sql")
                .build();
        return db;
    }
}*/
