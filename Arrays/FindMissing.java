public class FindMissing{
    
    public static int findMissing(int arr[]){
        int n = arr.length + 1;
        int sum = (n*(n+1))/2;
        int arrSum = 0;
        for(int i: arr){
            arrSum = arrSum+i;
        }
        return sum - arrSum;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6};
        System.out.println(findMissing(arr));
    }
}