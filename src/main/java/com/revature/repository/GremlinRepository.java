package com.revature.repository;

import com.revature.model.Gremlin;
import com.revature.util.ConnectionUtility;

import java.sql.Connection;
import java.util.List;

public class GremlinRepository implements DAO<Gremlin> {
    @Override
    public List<Gremlin> getAll() {
        try(Connection connection = ConnectionUtility.getConnection()){

        }
    }

    @Override
    public Gremlin create(Gremlin gremlin) {
        return null;
    }
}
