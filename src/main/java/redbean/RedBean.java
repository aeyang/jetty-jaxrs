package redbean;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("RedBean")
public class RedBean{

    @GET
    @Path("hello")
    @Produces("text/plain")
    public String hello(){
        return "Hello red beans";
    }
}