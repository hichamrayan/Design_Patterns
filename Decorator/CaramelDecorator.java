class CaramelDecorator extends AddonDecorator{
    Beverage b;
    public CaramelDecorator(Beverage b){
        this.b=b;
    }
public float cost(){
        System.out.println("cost() of "+this.getClass().getName()+"+"+this.b.getClass().getName()+"="+(20+this.b.cost()));
        return 20+this.b.cost();
}
}