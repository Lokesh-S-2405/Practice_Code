package Interview_Programs;

public class Demo2 {
    public static void main(String[] args) {
        String string = "lokesh"; //output loeh
        String string2 = "sky";
        String removeDuplicate = duplicateCharacter(string, string2);
        String afterRemovingDuplicateCharacters = replaceDuplicateCharacter(string, removeDuplicate);
        System.out.println(afterRemovingDuplicateCharacters);
    }

    private static String replaceDuplicateCharacter(String string, String removeDuplicate) {
        for (int i = 0; i < removeDuplicate.length(); i++) {
            String s = removeDuplicate.charAt(i) + "";
            string = string.replace(s,"");
        }
        return string;
    }

    private static String duplicateCharacter(String string, String string2) {
        String updateString = "";
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < string2.length(); j++) {
                if(string.charAt(i)==string2.charAt(j)){
                    updateString = updateString + string.charAt(i);
                }
            }
        }
        return updateString;
    }
}
