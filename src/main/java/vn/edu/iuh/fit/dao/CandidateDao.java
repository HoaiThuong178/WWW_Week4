package vn.edu.iuh.fit.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import vn.edu.iuh.fit.entities.Candidate;

import javax.sql.DataSource;
import java.util.Optional;
import java.util.UUID;
@Component
public class CandidateDao extends AbstractDao<Candidate, UUID>{

    private JdbcTemplate template;
    public CandidateDao(DataSource dataSource) {
        super(dataSource);
        template=new JdbcTemplate(dataSource);
    }

}
