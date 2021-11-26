package Proxy;

public class RealImage implements Image{
    String fileName;
    public RealImage() {}

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        loadFromDIsk();
        System.out.println("Image " + this.fileName);
    }

    public void loadFromDIsk() {
        System.out.println("Loaded");
    }
}
