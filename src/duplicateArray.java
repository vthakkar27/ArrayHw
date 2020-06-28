public class duplicateArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,3,7,7,1};
        System.out.println("Duplicate elements in given array : ");//search for duplicate elements
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }


    }
}
