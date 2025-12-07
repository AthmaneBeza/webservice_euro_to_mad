package School;

import javax.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/school";
        Endpoint.publish(url, new StudentServiceImpl());
        System.out.println("Service démarré sur : " + url + "?wsdl");
    }
}
