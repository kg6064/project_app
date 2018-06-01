package com.project.DAOImpl;

import com.project.DAO.AdminServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by KUMAR on 01-06-2018.
 */
@Component
public class AdminServiceDAOImpl implements AdminServiceDAO{

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private String GET_WORLDS = "SELECT name FROM country WHERE name LIKE \'i%\'";

    @Override
    public List<String> getUserList() {
//        return Arrays.asList("abc","def");
        return jdbcTemplate.queryForList(GET_WORLDS,String.class);
    }
}
