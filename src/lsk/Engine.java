package lsk;

class Engine {
    private boolean running = false;
    
    public void start() {
        running = true;
        System.out.println("  Motorra abiarazten: vroom!");
    }
    
    public void stop() {
        running = false;
        System.out.println("  Motorra gelditzen");
    }
}
