package Proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        String filename = "my.jpg";
        ProxyImage img = new ProxyImage(filename);
        img.display();
    }
}
