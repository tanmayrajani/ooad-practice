package OCP_DIP;

public class Switch {
    
    private Switchable switchable;
    
    public Switch(){}
    
    public Switch(Switchable switchable){
        this.switchable = switchable;
    }
    
    public void turnOn(){
        System.out.println("Turning on...");
        this.switchable.on();
    }
    
    public void turnOff(){
        System.out.println("Turning off...");
        this.switchable.off();
    }
}
