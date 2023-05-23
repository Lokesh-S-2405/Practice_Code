package PracticeCodes;

public class LongestUniqueSubString {
    public static void main(String[] args) {
        String string = "greeksforgreeks"; // output: eksforg length = 7
        int res = 0;
        for (int i = 0; i <string.length() ; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < string.length(); j++) {
                char c = string.charAt(j);
                if(visited[c]==true){
                    break;
                } else {
                    res=res>=(j-i+1)?res:(j-i+1);
                    visited[c]=true;
                }
            }
            visited[string.charAt(i)]=false;
        }
        System.out.println(res);
    }
}
