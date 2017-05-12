/*
package io.tpDSI;

import entities.User;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StockMapper implements ResultSetMapper<User> {

    @Override
    public User map(int index, ResultSet r, StatementContext arg2) throws SQLException {
        User s = new User();
        s.setId(r.getInt(1));
        s.setLastName(r.getString(2));
        s.setFirstName(r.getString(3));
        s.setEmail(r.getString(4));
        s.setSalary(r.getInt(5));
        s.setPropretyId(r.getInt(6));
        return s;
    }
}
*/