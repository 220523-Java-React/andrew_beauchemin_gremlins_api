package com.revature.service;

import com.revature.model.Gremlin;
import com.revature.repository.GremlinRepository;

import java.util.List;

public class GremlinService {
    private GremlinRepository gremlinRepository = new GremlinRepository();

    public  List<Gremlin> getAllGremlins(){return gremlinRepository.getAll();}

    public boolean createGremlin(Gremlin gremlin){return gremlinRepository.create(gremlin);};

}
