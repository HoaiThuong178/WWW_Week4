package vn.edu.iuh.fit.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;

public abstract class AbstractDao<T,K> {
    private DataSource dataSource;
    protected JdbcTemplate jdbcTemplate;

    public AbstractDao(DataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public Boolean create(T t){
        return null;
    }
    public Optional<T> findById(K id){

        return Optional.empty();
    }
    public List<T> getAll(){

        return null;
    }
    public Boolean update(T t,K k){
        return null;
    }

    public Boolean delete(T t,K k){
        return null;
    }
}
