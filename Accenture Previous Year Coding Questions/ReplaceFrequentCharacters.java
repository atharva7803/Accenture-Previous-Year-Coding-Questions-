import java.util.*;
public class ReplaceFrequentCharacters {

    static String Replace(String str, char c){
        Map<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            if(mp.containsKey(str.charAt(i))){
                mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
            }
            else{
                mp.put(str.charAt(i),1);
            }
        }
        int max = 0;
        char maxChar = ' ';

        for(Map.Entry<Character, Integer> entry : mp.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return str.replace(maxChar, c);

    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
        
        String str = "bbadbbababb";
        String result = Replace(str, 't');
        System.out.println(result);

    }
}