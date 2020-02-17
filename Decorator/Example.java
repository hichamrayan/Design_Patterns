class Example{
    public static void main(String[] args){
        Decaf dec=new Decaf();
        Expresso exp=new Expresso();
        CaramelDecorator caramel=new CaramelDecorator(dec);
        ChoclateDecorator choclate=new ChoclateDecorator(exp);
        caramel.cost();
        choclate.cost();
        ChoclateDecorator choclatewithcaramel= new ChoclateDecorator(caramel);
        choclatewithcaramel.cost();
    }
}