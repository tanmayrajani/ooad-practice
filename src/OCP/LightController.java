package OCP;

public class LightController {
    public static void control(){
        Light l1 = new Light();
        Switch s1 = new Switch(l1);
        s1.turnOn();
        s1.turnOff();
    }
}
