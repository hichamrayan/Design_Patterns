public class ConcreteProductB implements Product{

    @Override
    public float cost()
    {
        System.out.println("cost() of "+this.getClass().getName());
        return 2;
    }
    
}