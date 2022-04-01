package dev.davilnv.resources;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.davilnv.entity.Startup;
import io.agroal.api.AgroalDataSource;

@Path("/startup")
public class StartupResource {
	
	@Inject
	AgroalDataSource defaultDataSource;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Startup> hello() throws SQLException{
    	
    	ArrayList<Startup> startups = new ArrayList<Startup>();
    	
    	
    	
        return startups;
    }
}