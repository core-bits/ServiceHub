/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isw.transit.server.servicehub;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Thomas.Matthew
 */
@Path("test")
public class TestResource {

    public TestResource() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ServiceResponse getJson() {
        ServiceResponse r = new ServiceResponse();
        r.setCode("0");
        r.setMessage("Success");
        return r;
    }

    /**
     * PUT method for updating or creating an instance of TestResource
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }

    public class ServiceResponse {

        String code;
        String message;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }
}
