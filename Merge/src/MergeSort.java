
public class MergeSort {
    
    static void merge(int[] arr, int l, int m, int r)
    { 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        int[] L = new int [n1];
        int[] R = new int [n2];

        System.arraycopy(arr, l, L, 0, n1);
        for (int j=0; j<n2; ++j){
            R[j] = arr[m + 1+ j];
            Utilerias.printArray(R);
        }
  
        int i = 0, j = 0; 
  
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i];
                i++;
                Utilerias.printArray(arr);
            } 
            else
            { 
                arr[k] = R[j];
                j++;
                Utilerias.printArray(arr);
            } 
            k++; 
        } 
  
        while (i < n1) { 
            arr[k] = L[i];
            Utilerias.printArray(arr);
            i++; 
            k++; 
        } 
  
        while (j < n2) { 
            arr[k] = R[j];
            Utilerias.printArray(arr);
            j++; 
            k++; 
        } 
    } 
  
    static void sort(int[] arr, int l, int r) {
        if (l < r) { 
            int m = (l+r)/2; 
  
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            merge(arr, l, m, r); 
        } 
    }

    
    
}
