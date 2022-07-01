package com.revature.controller;

import com.revature.model.Gremlin;
import com.revature.service.GremlinService;
import io.javalin.http.Handler;

import java.util.List;

public class GremlinController {
    private GremlinService gremlinService = new GremlinService();

    public Handler getAllGremlins = ctx -> {
        List<Gremlin> gremlins = gremlinService.getAllGremlins();

        if(gremlins != null){
            ctx.status(200).json(gremlins);
        }else {
            ctx.status(400);
        }
    };

    public Handler createGremlin = ctx -> {
        Gremlin gremlin = ctx.bodyAsClass(Gremlin.class);

    };

}
