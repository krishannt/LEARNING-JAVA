public class backtracking_02 {
    public static void conq(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid + 1; // Initialize idx2 to mid + 1
        int x = 0; // Initialize x to 0
    
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++]; // Fix the typo here (dx1 -> idx1)
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
    
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }
    
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    

public static void divd( int arr[], int si , int ei) {
    
    int mid = si+ei/2;
    divd(arr, si, mid);
    divd(arr, mid+1, ei);
    conq(arr,si,mid,ei);
}

    public static void main(String[] args) {
        int arr [] = {7,4,5,2,8,6};
         int n = arr.length;
         divd(arr, 0, n-1);
         for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
    }
}
