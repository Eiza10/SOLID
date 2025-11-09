package lsk;

class Bicycle extends TransportationDevice {
    
    public Bicycle() {
        super("Bicycle");
    }
    
    @Override
    public void move() {
        System.out.println(name + ": Mugitzen da pedalak erabiliz");
    }
}
