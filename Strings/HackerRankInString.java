package Strings;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HackerRankInString {
    public static String hackerrankInString(String s){
        String keyString = "hackerrank";
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(keyString.charAt(j) == s.charAt(i)){
                j++;
            }
            if(j == keyString.length()){
                return "YES";
            }
        }
        return "NO";

    }
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

            int q = Integer.parseInt(bufferedReader.readLine().trim());

            for (int qItr = 0; qItr < q; qItr++) {
                String s = bufferedReader.readLine();
                String result = hackerrankInString(s);
                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}
