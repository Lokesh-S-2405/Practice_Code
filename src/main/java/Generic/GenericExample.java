package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        Printer1<String> printer = new Printer1<>("lokesh");
        printer.print();

        Printer<Cat> catPrinter = new Printer<>(new Cat("naaa"));
        catPrinter.print();
        display("Loki",24);
        List<Integer> integers= new ArrayList<>();
        integers.add(3);
        printList(integers);
        List<Cat> cats =  new ArrayList<>();
            cats.add(new Cat("rosee"));
            printList(cats);
    }
    private static <T,V> void display(T thingToDisplay, V otherThingToDisplay){
        System.out.println(thingToDisplay + "!!!!!!!!");
        System.out.println(otherThingToDisplay + "!!!!!");
    }

    private static void printList(List<?> myList){
        System.out.println(myList);
    }
}
