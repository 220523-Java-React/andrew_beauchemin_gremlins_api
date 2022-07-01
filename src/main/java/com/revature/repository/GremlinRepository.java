package com.revature.repository;

import com.revature.model.Color;
import com.revature.model.Gremlin;
import com.revature.util.ConnectionUtility;

import java.sql.*;
import java.util.ArrayList;
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
        try(Connection connection = ConnectionUtility.getConnection()) {
            PreparedStatement stmt = connection.prepareStatement("insert into gremlins(name, age, color_id, is_evil) values(?, ?, ?, ?)");

            stmt.setString(1, gremlin.getName());
            stmt.setInt(2, gremlin.getAge());
            stmt.setInt(3, gremlin.getColorId());
            stmt.setBoolean(4, gremlin.isEvil());

            int success = stmt.executeUpdate();
            return success == 1 ? gremlin : null;

        }catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
}
