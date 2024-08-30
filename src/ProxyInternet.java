import java.util.Arrays;
import java.util.List;

public class ProxyInternet {
    private RealInternet realInternet = new RealInternet();
    private List<String> blockedSites = Arrays.asList("www.youtube.com", "www.facebook.com");

    public void connectTo(String serverhost) throws Exception {
        if (blockedSites.contains(serverhost)) {
            System.out.println("Acesso negado ao site " + serverhost);
        } else {
            realInternet.connectTo(serverhost);
        }
    }
}