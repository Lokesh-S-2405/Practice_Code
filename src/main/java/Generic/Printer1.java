package Generic;

public class Printer1 <T>{
    T thingToPrint;
    public Printer1(T thingToPrint){
        this.thingToPrint=thingToPrint;
    }
    public void print(){
        System.out.println(thingToPrint);
    }
}
