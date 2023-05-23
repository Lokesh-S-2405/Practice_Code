package PracticeCodes;

public class CountDuplicateWordInAString {
    public static void main(String[] args)  {
        String string = "bad boy bad boy bad";
        String[] strings = string.split(" ");
        int count;
        for (int i = 0; i < strings.length; i++) {
            count=1;
            for (int j = i+1; j < strings.length; j++) {
                if(strings[i].equalsIgnoreCase(strings[j])){
                    count++;
                    strings[j]="0";
                }
            }
            if(count>1 && strings[i]!="0"){
                System.out.println(strings[i] + "--->" + count);
            }
        }

    }

}
