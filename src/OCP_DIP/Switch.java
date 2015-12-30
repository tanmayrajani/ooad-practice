package OCP_DIP;

public class Switch {
    
    private static Switchable switchable;
    
    public Switch(){
        //TODO: Find some legit way to do this or believe it's legit
        this(new Light());
    }
    
    //Solving DIP using Constructor Injection
    public Switch(Switchable switchable){
        Switch.switchable = switchable;
    }
    
    public void turnOn(){
        System.out.println("Turning on...");
        Switch.switchable.on();
    }
    
    public void turnOff(){
        System.out.println("Turning off...");
        Switch.switchable.off();
    }
}
