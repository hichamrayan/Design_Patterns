class LinuxFactory  implements Factory{
    
    @Override
    public LinuxConcreteProductA getProductA(){
        return new LinuxConcreteProductA();
    }

    @Override
    public LinuxConcreteProductB getProductB(){
        return new LinuxConcreteProductB();
    }
}