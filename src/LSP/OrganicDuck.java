package LSP;

public class OrganicDuck implements IDuck{
    
    boolean swimming;
    @Override
    public void swim(){
        //Doing something to swim
        swimming = true;
    }

    @Override
    public boolean isSwimming() {
        // code to check whether duck is swimming or not
        return swimming;
    }
}
