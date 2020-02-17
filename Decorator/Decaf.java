class Decaf extends Beverage{
    public float cost(){
        System.out.println("cost() of "+this.getClass().getName());
        return 1;
    }

}