package handlers;

import java.io.BufferedOutputStream;
import java.io.IOException;

@FunctionalInterface
public interface Handlers {
    void handle(Request request, BufferedOutputStream responseStream) throws IOException;
}
