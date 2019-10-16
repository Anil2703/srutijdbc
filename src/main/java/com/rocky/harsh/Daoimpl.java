package com.rocky.harsh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository("Daoimpl")
public class Daoimpl {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public Daoimpl(@Qualifier("dataSource") DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public int getRowcount(){
        return jdbcTemplate.queryForObject("select count(*) from krishna_Employees", new Object[]{},Integer.class);
    }
}
