package Arrays;
import java.util.*;

public class AlternatePosNeg {
    public static void alternatePositiveNegative(int[] array, int size){
        ArrayList<Integer> positiveInteger = new ArrayList<>();
        ArrayList<Integer> negativeInteger = new ArrayList<>();

        for(int i = 0; i < size; i++){
            if(array[i] > 0){
                positiveInteger.add(array[i]);
            }else{
                negativeInteger.add(array[i]);
            }
        }

        int positiveIndex = 0, negativeIndex = 0, i = 0;
        while(positiveIndex < positiveInteger.size() && negativeIndex < negativeInteger.size()){
            if(i % 2 == 0){
                array[i++] = positiveInteger.get(positiveIndex++);
            }else{
                array[i++] = negativeInteger.get(negativeIndex++);
            }
        }

        while (positiveIndex < positiveInteger.size()) {
            array[i++] = positiveInteger.get(positiveIndex++);
        }

        while (negativeIndex < negativeInteger.size()) {
            array[i++] = negativeInteger.get(negativeIndex++);
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = scan.nextInt();
        System.out.println("Enter array elements: ");
        int[] array = new int[size];
        for(int i = 0;i < size; i++){
            array[i] = scan.nextInt();
        }
        alternatePositiveNegative(array, size);
        scan.close();
    }
}
