package lsk;

class Main {
    public static void main(String[] args) {
        // Ibilgailu guztiak sortu
        Car car = new Car();
        Skate skate = new Skate();
        Bicycle bike = new Bicycle();
        Trailer trailer = new Trailer();
        
        System.out.println("=== IBILGAILU GUZTIAK ===\n");
        
        // Dena TransportationDevice bezala tratatu (LSP!)
        TransportationDevice[] vehicles = {car, skate, bike, trailer};
        for (TransportationDevice v : vehicles) {
            System.out.println("--- " + v.getName() + " ---");
            v.move();
            System.out.println();
        }
        
        System.out.println("=== MOTORRAK DAUZKATENAK ===\n");
        // Motorrak dauzkaten ibilgailuak kudeatu
        Motorized[] motorizedVehicles = {car, skate};
        for (Motorized m : motorizedVehicles) {
            if (m instanceof TransportationDevice) {
                System.out.println("--- " + ((TransportationDevice)m).getName() + " ---");
            }
            m.startEngine();
            m.stopEngine();
            System.out.println();
        }
        
        System.out.println("=== MATRIKULATUAK ===\n");
        // Matrikulatu daitezkeen ibilgailuak
        Registrable[] registrableVehicles = {car, trailer};
        registrableVehicles[0].register("1234-ABC");
        registrableVehicles[1].register("5678-XYZ");
        
        System.out.println("\n=== MATRIKULEN ZERRENDA ===");
        for (Registrable r : registrableVehicles) {
            if (r instanceof TransportationDevice) {
                System.out.println(((TransportationDevice)r).getName() + ": " + r.getLicensePlate());
            }
        }
    }
}