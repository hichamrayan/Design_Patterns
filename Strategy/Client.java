class Client {
    IBehaviour b;
    public Client(IBehaviour b){
        this.b=b;
    }
    void execute(){
        this.b.run();
    }
}