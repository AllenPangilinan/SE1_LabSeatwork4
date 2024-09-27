public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService airConditioning;

    public HomeInterface() {
        this.light = new Light();
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
        System.out.println("All services are turned ON.");
    }

    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
        System.out.println("All services are turned OFF.");
    }

    public void turnOnLight() {
        light.turnOn();
    }

    public void turnOffLight() {
        light.turnOff();
    }

    public void turnOnTV() {
        tv.turnOn();
    }

    public void turnOffTV() {
        tv.turnOff();
    }

    public void turnOnAirConditioning() {
        airConditioning.turnOn();
    }

    public void turnOffAirConditioning() {
        airConditioning.turnOff();
    }
}