package Generic;

public class Printer <T extends Animal>{
    T thingToPrint;
    public Printer(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        thingToPrint.eat();
    }
}
