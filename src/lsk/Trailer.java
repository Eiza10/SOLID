package lsk;

class Trailer extends TransportationDevice implements Registrable {
    private String licensePlate;
    
    public Trailer() {
        super("Trailer");
    }
    
    @Override
    public void register(String licensePlate) {
        this.licensePlate = licensePlate;
        System.out.println(name + ": Matrikulatuta - " + licensePlate);
    }
    
    @Override
    public String getLicensePlate() {
        return licensePlate;
    }
    
    @Override
    public void move() {
        System.out.println(name + ": Beste ibilgailu batek eramaten du");
    }
}
