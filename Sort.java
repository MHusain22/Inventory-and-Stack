public class Sort {
    public static void main(String[] args) {
    int arr[] = {1,2,3,4,5,6};
    // for (int i = 0; i < arr.length - 1; i++) {
    // int smallest = i;
    // for (int j = i + 1; j < arr.length; j++) {
    // if (arr[smallest] > arr[j]) {
    // smallest = j;
    // }

    // }
    // int temp = arr[smallest];
    // arr[smallest] = arr[i];
    // arr[i] = temp;
    // }

    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    int low = 0;
    int high =arr.length-1;
    int key=2;
    boolean flag = false;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==key){
            flag =true;
            System.out.println("At index" + mid);
            break;
        }
        else if(arr[mid]<key){
            low = mid+1;
        }
        else{
            high = mid-1;
        }
    }
    if(flag==false){
        System.out.println("not present");
    }
}
}