public class ConcreteFactory1  implements Factory{
    
    @Override
    public Product create()
    {
        if(Math.random()<0.9)
        return new ConcreteProductA();
        return new ConcreteProductB();
    }    
}