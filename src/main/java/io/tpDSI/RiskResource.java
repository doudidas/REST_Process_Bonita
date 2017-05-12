package io.tpDSI;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/risk")
public class RiskResource {
    int Min = 0;
    int Max = 10;

    public RiskResource() {}

    @GET
    @Path("/getRiskValueXML")
    public String sayHelloXML(@QueryParam("name") String name) {
        double myDouble = Math.random() * (Max - Min) + 1;
        return "<users>" +
                "<user>" +
                "<risk>"+ (int) myDouble +"</risk>" +
                "<name></name>" +
                "</user>" +
                "</users>";
    }
}