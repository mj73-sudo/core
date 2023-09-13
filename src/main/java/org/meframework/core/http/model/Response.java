package org.meframework.core.http.model;

import java.util.ArrayList;
import java.util.List;

public class Response {
    private List<MeHeader> headers = new ArrayList<>();
    private String bodyAsString;


    public String getHeader(String key) {
        for (MeHeader header : this.headers) {
            if (header.getKey().equals(key))
                return header.getValue();
        }
        return null;
    }

    public List<MeHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<MeHeader> headers) {
        this.headers = headers;
    }

    public String getBodyAsString() {
        return bodyAsString;
    }

    public void setBodyAsString(String bodyAsString) {
        this.bodyAsString = bodyAsString;
    }
}
