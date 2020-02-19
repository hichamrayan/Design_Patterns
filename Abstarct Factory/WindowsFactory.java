class WindowsFactory  implements Factory{
    
    @Override
    public WindowsConcreteProductA getProductA(){
    return new WindowsConcreteProductA();
    }

    @Override
    public WindowsConcreteProductB getProductB(){
        return new WindowsConcreteProductB();
    }
}