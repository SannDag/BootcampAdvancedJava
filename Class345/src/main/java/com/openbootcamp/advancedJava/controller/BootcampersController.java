package com.openbootcamp.advancedJava.controller;

import com.openbootcamp.advancedJava.model.BootcamperModel;
import com.openbootcamp.advancedJava.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService){
        this.bootcamperService = bootcamperService;

        //bad practice, only for demo
        this.bootcamperService.add(new BootcamperModel("one", Math.random()));
        this.bootcamperService.add(new BootcamperModel("two",Math.random()));
        this.bootcamperService.add(new BootcamperModel("three",Math.random()));
        this.bootcamperService.add(new BootcamperModel("four",Math.random()));
        this.bootcamperService.add(new BootcamperModel("five",Math.random()));

    };

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<BootcamperModel> showAll(){
        return bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public BootcamperModel listOne(@PathParam("name") String name){
        return bootcamperService.get(name);
    }

    @POST
    @Path("/bootcampers")
    public Response createBootcamper(BootcamperModel bootcamperModel){
        bootcamperService.add(bootcamperModel);
        return Response.created(URI.create("/bootcampers/" + bootcamperModel.getName())).build();
    }
}