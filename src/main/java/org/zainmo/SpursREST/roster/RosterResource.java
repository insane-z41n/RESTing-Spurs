package org.zainmo.SpursREST.roster;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Player Roster will be located at "webapi/roster".
@Path("roster")
public class RosterResource {

	//HTTP GET Request returns String.
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTest() {
		return "TEST SPURS!";
	}
	
}
