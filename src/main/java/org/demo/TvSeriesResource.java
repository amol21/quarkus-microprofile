package org.demo;

import io.vertx.core.json.JsonArray;
import jakarta.inject.Inject;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.demo.entity.Tvseries;
import org.demo.interfaces.TvSeriesIdProxy;

import org.demo.interfaces.TvSeriesPersonProxy;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;


@Path("/tvseries")
public class TvSeriesResource {
    @RestClient
    TvSeriesIdProxy tvSeriesIdProxy;
    @RestClient
    TvSeriesPersonProxy tvSeriesPersonProxy;
    @GET
    @Fallback(fallbackMethod = "getTvSeriesByIdfallback")
    @Path("/{id}")
    public Response getTvSeriesById(@PathParam("id") int id)
    {
        //return tvSeriesIdProxy.getTvSeriesById(id);
        return  Response.ok(tvSeriesIdProxy.getTvSeriesById(id)).build();
    }

    public Response getTvSeriesByIdfallback(int id)
    {
        //return new Tvseries();
       return  Response.ok("Site  under mentenance!!!").build();
    }
    @GET
    @Path("/person/{personname}")
    public JsonArray etTvSeriesByPerson(@PathParam("personname") String personName)
    {
        return tvSeriesPersonProxy.getTvSeriesByPerson(personName);
    }
}
