class Example {
    public static void main(String[] args){
        IBehaviour bA=new ConcreteBehaviourA();
        IBehaviour bB=new ConcreteBehaviourB();
        Client cl1=new Client(bA);
        Client cl2=new Client(bB);
        cl1.execute();
        cl2.execute();
    }
}