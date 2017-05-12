package io.tpDSI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;


@Path("/property")
@Produces(MediaType.APPLICATION_JSON)
public class PropertyResource {

    private Map<String, Integer> memory = new HashMap<String, Integer>();

    @GET
    public String getValue(@QueryParam("name") String name) {
        memory.put("Villa", 4000);
        memory.put("Chalet", 2000);
        memory.put("Loft", 1000000);

        return "<properties>" +
                "<property>" +
                "<name>" + name + "</name>" +
                "<price>"+ memory.get(name) +"</price>" +
                "</property>" +
                "</properties>";
    }
}