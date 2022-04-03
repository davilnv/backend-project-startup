package dev.davilnv.resources;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import dev.davilnv.entity.Startup;
import dev.davilnv.model.Query;
import io.agroal.api.AgroalDataSource;

@Path("/startup")
public class StartupResource {
	
	@Inject
	AgroalDataSource defaultDataSource;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Startup> getStartup() throws SQLException{
    	
    	ArrayList<Startup> startups = new ArrayList<Startup>();
    	
    	Connection conect = defaultDataSource.getConnection();
    	
    	ResultSet rsStartup = conect.createStatement().executeQuery(Query.GET_ALL_STARTUP);
    	ResultSet rsCategory;
		
		while(rsStartup.next()) {
    		Startup stp = new Startup(
    				rsStartup.getInt(1), 
    				rsStartup.getString(2), 
    				rsStartup.getString(3), 
    				rsStartup.getInt(4), 
    				rsStartup.getString(5)
    		);
    		
    		rsCategory = conect.createStatement().executeQuery(Query.GET_STARTUP_CATEGORY_BY_ID + stp.getId_startup());
    		
    		String categories = "";
    		while(rsCategory.next()) {
    			categories += rsCategory.getString(2);
    		}
    		
    		
    		stp.setCategories(trimStringCategory(categories));
    		
    		startups.add(stp);
    	}
		
    	
    	
        return startups;
    }
    
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Startup> getStartupById(@PathParam("id") int id) throws SQLException{
    	
    	ArrayList<Startup> startups = new ArrayList<Startup>();
    	
    	Connection conect = defaultDataSource.getConnection();
    	
    	ResultSet rsStartup = conect.createStatement().executeQuery(Query.GET_STARTUP_BY_ID+id);
    	ResultSet rsCategory;
		
		while(rsStartup.next()) {
    		Startup stp = new Startup(
    				rsStartup.getInt(1), 
    				rsStartup.getString(2), 
    				rsStartup.getString(3), 
    				rsStartup.getInt(4), 
    				rsStartup.getString(5)
    		);
    		
    		rsCategory = conect.createStatement().executeQuery(Query.GET_STARTUP_CATEGORY_BY_ID + stp.getId_startup());
    		
    		String categories = "";
    		while(rsCategory.next()) {
    			categories += rsCategory.getString(2);
    		}
    		
    		
    		stp.setCategories(trimStringCategory(categories));
    		
    		startups.add(stp);
    	}
		
    	
    	
        return startups;
    }
    
    private String trimStringCategory(String categories) {
    	String resultCategories = "";
		for (String s : categories.split(" ")) {
			if(s.isEmpty()) {
			} else {
				resultCategories += s + ", ";
			}
		}
		
		return resultCategories.substring(0, resultCategories.length()-2);
    }
}