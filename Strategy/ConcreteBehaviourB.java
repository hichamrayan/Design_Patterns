class ConcreteBehaviourB  implements IBehaviour{
    
    @Override
    public void run(){
        System.out.println("run() of "+this.getClass().getName());
    }
}