package io.tpDSI;

import javax.ws.rs.*;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
public class UserRessource {

    private int userId;
    private String userLastName;
    private String userFirstName;
    private String userEmail;
    private int userSalary;
    private int userPropretyId;


    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response update(
            @QueryParam("name") String firstName,
            @QueryParam("lastName") String lastName,
            @QueryParam("salary") int salary,
            @QueryParam("email") String email,
            @QueryParam("propretyId") int propretyId
    ) {
        String url = "http://localhost:9000/#!/ok";
        try {
            userId = lastName.hashCode();
            userLastName = lastName;
            userFirstName = firstName;
            userEmail = email;
            userSalary = salary;
            userPropretyId = propretyId;

        } catch (Exception e) {
        } finally {
            return Response.status(Response.Status.SEE_OTHER)
                    .header(HttpHeaders.LOCATION, url)
                    .build();
        }
    }

    @GET
    public String getUser() {
        return "<users>" +
                "<user>" +
                "<id>"+userId+"</id>" +
                "<firstName>"+ userFirstName+"</firstName>" +
                "<lastName>"+ userLastName+"</lastName>" +
                "</user>" +
                "</users>";
    }
}