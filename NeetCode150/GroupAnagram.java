package NeetCode150;
import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs, int size){
        if(size == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            int[] countCharacter = new int[26];
            for(char c: s.toCharArray()){
                countCharacter[c- 'a']++;
            } 
            StringBuilder sb = new StringBuilder("");
            for(int i = 0; i < 26; i++){
                sb.append('#');
                sb.append(countCharacter[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    } 
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter array values: ");
        String[] array = new String[size];
        for(int i = 0; i < size; i++){
            array[i] = scan.nextLine().trim();
        }
        System.out.println("Group Anagrams: "+groupAnagrams(array, size));
        scan.close();
    }
}
