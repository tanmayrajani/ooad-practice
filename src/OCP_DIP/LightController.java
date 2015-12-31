package OCP_DIP;

public class LightController {
    public void control(){
        Light l1 = new Light();
        Switch s1 = new Switch(l1);
        s1.turnOn();
        s1.turnOff();
    }
}
