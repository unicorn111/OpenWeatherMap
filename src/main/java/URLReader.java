import java.net.*;
import java.io.*;

public class URLReader {
    private String inputLine, line, url;
    public URLReader(String url)throws Exception {
        URL oracle = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(oracle.openStream()));
        while ((inputLine = in.readLine()) != null)
            line = inputLine;
        in.close();
    }
    public String get_line(){
        return line;
    }
}