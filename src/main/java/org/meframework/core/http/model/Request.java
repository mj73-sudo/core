package org.meframework.core.http.model;

import java.util.ArrayList;
import java.util.List;

public class Request {
    private String method;
    private String path;
    private List<MeHeader> headers = new ArrayList<>();
    private List<MeParam> params = new ArrayList<>();
    private String bodyAsString;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<MeHeader> getHeaders() {
        return headers;
    }

    public void setHeaders(List<MeHeader> headers) {
        this.headers = headers;
    }

    public List<MeParam> getParams() {
        return params;
    }

    public void setParams(List<MeParam> params) {
        this.params = params;
    }

    public String getBodyAsString() {
        return bodyAsString;
    }

    public void setBodyAsString(String bodyAsString) {
        this.bodyAsString = bodyAsString;
    }

    public String getHeader(String key) {
        for (MeHeader header : this.headers) {
            if (header.getKey().equals(key))
                return header.getValue();
        }
        return null;
    }

    public String getParam(String key) {
        for (MeParam param : this.params) {
            if (param.getKey().equals(key))
                return param.getValue();
        }
        return null;
    }
}
