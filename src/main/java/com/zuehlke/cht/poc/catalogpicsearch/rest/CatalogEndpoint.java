package com.zuehlke.cht.poc.catalogpicsearch.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/catalog")
public class CatalogEndpoint {
	@GET
	@Produces("application/json")
	public Response doGet(@QueryParam("search") String search) {
		return Response.ok(new Result(search+"v2")).build();
	}
	
	public static class Result {
		private String url;

		private Result() {}
		
		private Result(String url) {
			this.url = url;
		}
		
		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}
}
