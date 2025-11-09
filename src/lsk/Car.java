package lsk;

class Car extends TransportationDevice implements Motorized, Registrable {
    private Engine engine;
    private String licensePlate;
    
    public Car() {
        super("Car");
        this.engine = new Engine();
    }
    
    @Override
    public void startEngine() {
        System.out.println(name + ": Motorra abiarazten...");
        engine.start();
    }
    
    @Override
    public void stopEngine() {
        System.out.println(name + ": Motorra gelditzen...");
        engine.stop();
    }
    
    @Override
    public Engine getEngine() {
        return engine;
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
        System.out.println(name + ": Mugitzen da motorraz");
    }
}
