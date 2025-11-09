package lsk;

class Skate extends TransportationDevice implements Motorized {
    private Engine engine;
    
    public Skate() {
        super("Electric Skate");
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
    public void move() {
        System.out.println(name + ": Mugitzen da motorra eta orekagatik");
    }
}

