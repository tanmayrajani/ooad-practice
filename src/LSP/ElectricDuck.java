package LSP;

public class ElectricDuck implements IDuck{

    boolean swimming,turnedOn;
    
    @Override
    public void swim() {
        
        
        /*
        
        Duck must be turned on to swim. Which breaks LSP..
        Hence, I'm solving this problem by automatically turning the duck on in
        the swim method and by doing so make the electric duck behave exactly 
        as defined by the IDuck interface
        
        */
        
        if(!turnedOn) turnOn();
        // do something to swim
        swimming = true;
    }

    @Override
    public boolean isSwimming() {
        // check that
        return swimming;
    }
    
    public static void turnOn(){
        //turning the duck on
    }
    
}
