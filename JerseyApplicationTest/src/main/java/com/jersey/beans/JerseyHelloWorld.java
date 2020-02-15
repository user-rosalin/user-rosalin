package com.jersey.beans;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/show")
public class JerseyHelloWorld {

	
	  @GET
	    @Path("/{message}")
	    public Response getMsg(@PathParam("message") String msg)
	    {
	        String output = "Message requested : " + msg;
	        //Simply return the parameter passed as message
	        return Response.status(200).entity(output).build();
	    }
	  @GET
	  @Path("/{message}")
	    public Response getname(@PathParam("message") String msg)
	    {
	        String output = "Message requested : " + msg;
	        //Simply return the parameter passed as message
	        return Response.status(200).entity(output).build();
	    }
	
	
	  @GET
	  @Path("/{message1}")
	    public Response getname1(@PathParam("message1") String msg)
	    {
	        String output = "Message requested : " + msg;
	        //Simply return the parameter passed as message
	        return Response.status(200).entity(output).build();
	    }
	  @GET
	  @Path("/{message1}")
	    public Response getname18(@PathParam("message1") String msg)
	    {
	        String output = "Message requested : " + msg;
	        //Simply return the parameter passed as message
	        return Response.status(200).entity(output).build();
	    }


}