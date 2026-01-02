//Time Complexity - O(n)
//Space Complexity -O(1)

public class LinearSearch {
    public static int searchElement(int[] numbers,int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,7,10,-1,-8};
        int key=-8;
        int index=searchElement(numbers, key);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: "+index);
        }
    }
}
