package NeetCode150;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecodeString {
    public String encode(List<String> strs){
        StringBuilder encoded = new StringBuilder();
        for(String str: strs){
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String strs){
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < strs.length()){
            int j = strs.indexOf("#", i);
            int length = Integer.parseInt(strs.substring(i, j));
            i = j + 1;
            decoded.add(strs.substring(i, i+length));
            i += length;
        }
        return decoded;
    }
    public static void main(String[] args){
        System.out.println("Enter array elements: ");
        List<String> strs = Arrays.asList("hello", "world", "leet", "code");
        EncodeDecodeString sol = new EncodeDecodeString();

        String encoded = sol.encode(strs);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = sol.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
