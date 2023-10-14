package org.demo.interfaces;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.demo.entity.Tvseries;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
@Path("/shows")
@RegisterRestClient(baseUri = "https://api.tvmaze.com")
public interface TvSeriesIdProxy {
        //https://api.tvmaze.com/shows/{}
    //https://api.tvmaze.com/shows/136

    @GET
    @Path("/{id}")
    Tvseries getTvSeriesById(@PathParam("id") int id);
}
