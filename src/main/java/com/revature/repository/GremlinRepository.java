package com.revature.repository;

import com.revature.model.Gremlin;
import com.revature.util.ConnectionUtility;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GremlinRepository implements DAO<Gremlin> {
    @Override
    public List<Gremlin> getAll() {
        List<Gremlin> gremlins = new ArrayList<>();
        try(Connection connection = ConnectionUtility.getConnection()){
            PreparedStatement stmt = connection.prepareStatement("select * from gremlins");
            ResultSet rs =  stmt.executeQuery();

            while (rs.next()){
                Gremlin gremlin = new Gremlin().setAge(rs.getInt("age"))
                        .setColorId(rs.getInt("color_id"))
                        .setEvil(rs.getBoolean("is_evil"))
                        .setName(rs.getString("name"));

                gremlins.add(gremlin);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return gremlins;
    }

    @Override
    public Gremlin create(Gremlin gremlin) {
        return null;
    }
}
