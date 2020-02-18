public class ConcreteFactory2  implements Factory{
    
    @Override
    public Product create()
    {
        if(Math.random()<0.1)
        return new ConcreteProductA();
        return new ConcreteProductB();
    }    
}