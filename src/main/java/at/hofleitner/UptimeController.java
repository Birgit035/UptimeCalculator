package at.hofleitner;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//we told the controller:
@Path("/api/uptime") // you are acceible by this path
public class UptimeController {

    @GET //and you have a method which should be exposed using hpt
    @Path("/{uptime}") //sagt, dass man hier Zahl reinschreiben darf
    @Produces(MediaType.TEXT_PLAIN)
    public String calculateUpTime(@PathParam("uptime") double uptime){ //damit Zahl rein hier ergänzen @PathParm("uptime" double uptime - 99.95 unten ersetzen
        double minutesOfMonth = 60*24*30;
        double definedUpTimeInPercent = uptime /100; //hier 99.95 durch uptime ersetzen
        double uptimeInMinutes = minutesOfMonth * definedUpTimeInPercent;
        return String.format("%.2f",uptimeInMinutes);
    }
}
