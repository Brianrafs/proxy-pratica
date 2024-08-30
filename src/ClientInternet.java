public class ClientInternet {
    public static void main(String[] args) {
        ProxyInternet internet = new ProxyInternet();

        try {
            internet.connectTo("www.ifpb.edu.br"); // Este site não está bloqueado
            internet.connectTo("www.youtube.com");  // Este site está bloqueado
            internet.connectTo("www.google.com");   // Este site não está bloqueado
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
