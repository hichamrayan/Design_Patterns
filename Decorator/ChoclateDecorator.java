class ChoclateDecorator extends AddonDecorator{
        Beverage b;
    public ChoclateDecorator(Beverage b){
        this.b=b;
    }
public float cost(){
        System.out.println("cost() of "+this.getClass().getName()+"+"+this.b.getClass().getName()+"="+(33+this.b.cost()));
        return 33+this.b.cost();
}
}