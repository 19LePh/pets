public class Bird extends Pet
{
    //Fields
    
    //Constructors
    public Bird()
    {
        super("Perry");
    }
    
    public Bird(String name)
    {
        super(name);
    }
    
    //Methods
    public String speak()
    {
        return "Chirp Chirp";
    }
    
    public String eat()
    {
        String food = "seeds";
        return super.getName() + " ate" + " " + food;
    }
}
