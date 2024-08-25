package handlers;

public class Request {
    private final String METHOD;
    private final String PATH;

    public Request(String method, String path) {
        this.METHOD = method;
        this.PATH = path;

    }

    public String getMethod() {
        return METHOD;
    }

    public String getPath() {
        return PATH;
    }
}

