package lesson25.lesson25hw;

public class Human {

    protected int speed;

    protected  int rest;

    public Human(int speed, int rest) {
        this.speed = speed;
        this.rest = rest;
    }

    public String run(){
        return "run with"+ speed+"km/h\n"+rest();
    }

    public String rest(){
        return "Rest:"+rest+"min";
    }
}
