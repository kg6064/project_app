package com.project.DAOImpl;

import com.project.DAO.AdminServiceDAO;
import com.project.QueryConstant.AdminServiceQueryConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

//    private String GET_WORLDS = "SELECT name FROM country WHERE name LIKE \'i%\'";
    private static final Logger LOGGER = LoggerFactory.getLogger(AdminServiceDAOImpl.class);

    @Override
    public List<String> getUserList() {
//        return Arrays.asList("abc","def");
        LOGGER.info("Inside AdminServiceDAOImpl -- getUserList.");
        try {
            String query = AdminServiceQueryConstant.GET_ALL_USERS;
            LOGGER.info("executing query {}.",query);
            List<String> userList =  jdbcTemplate.queryForList(query,String.class);
            LOGGER.info("found {} users.",userList.size());
        }catch (Exception e){
            LOGGER.error("Inside AdminServiceDAOImpl -- getUserList Exception.",e);
        }
        return null;
    }
}
