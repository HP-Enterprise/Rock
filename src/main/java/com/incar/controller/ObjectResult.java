package com.incar.controller;

/**
 * Created by Teemol on 2015/11/23.
 */
public class ObjectResult {

    private String status;
    private Object message;

    public ObjectResult(String status, Object message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
