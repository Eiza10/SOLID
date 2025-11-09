package lsk;

abstract class TransportationDevice {
    protected String name;
    protected double speed;
    
    public TransportationDevice(String name) {
        this.name = name;
    }
    
    public abstract void move();
    
    public String getName() {
        return name;
    }
}
