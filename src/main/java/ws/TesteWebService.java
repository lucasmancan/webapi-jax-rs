package ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("teste")
public class TesteWebService {

    @GET
    public String getMessage(){
        return "Hello World";
    }
}
