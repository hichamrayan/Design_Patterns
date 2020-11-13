class Example{
    public static void main(String[] args){
        Decaf dec=new Decaf();
        Expresso exp=new Expresso();
        CaramelDecorator carameldecf=new CaramelDecorator(dec);
        ChoclateDecorator choclateexpresso=new ChoclateDecorator(exp);
        carameldecf.cost();
        choclateexpresso.cost();
        ChoclateDecorator choclatewithcarameldecf= new ChoclateDecorator(carameldecf);
        choclatewithcarameldecf.cost();
    }
}