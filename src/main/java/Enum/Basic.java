package Enum;

public class Basic {
    enum Week{
        /*
        * These are enum constants
        * public, static, final
        * since its final you cannot create enums
        * type is Week*/
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;

        /*
        * This is not public or protected, only private or default
        * why? we don't want to create new objects
        * internally: public static final Week Monday = new Week()*/
        Week() {
           // System.out.println("Constructor called for"+this);
        }

        public static void main(String[] args) {
            Week week = Week.Tuesday;
            for (Week day:
                 Week.values()) {
                System.out.println(day);
            }
            System.out.println(week.ordinal()); //To find position of the value.
        }
    }

}
