import java.util.ArrayList;

public class MergeSort{
    private myComparator comp = new myComparator();
    ArrayList<Student> arr = new ArrayList<Student>();

    public MergeSort(){}

    public ArrayList<Student> sort(ArrayList<Student> newArr){
        arr = newArr;
        split(arr, 0, arr.size()-1);
        return arr;
    }

    private void split(ArrayList<Student> arr, int l, int r){
        if(r <= l) {return;}
        int m = (r+l)/2;

        split(arr, l, m);
        split(arr, m+1, r);

        merge(arr, l, m, r);
    }

    private void merge(ArrayList<Student> arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;
 
        ArrayList<Student> L = new ArrayList<Student>(n1);
        ArrayList<Student> R = new ArrayList<Student>(n2);
 
        for (int i = 0; i < n1; ++i){
            // L[i] = arr[l + i]
            L.add(i, arr.get(l + i));
        }
        for (int j = 0; j < n2; ++j){
            // R[j] = arr[m + 1 + j]
            R.add(j, arr.get(m + 1 + j));
        }
 
        int i = 0, j = 0;
 
        int k = l;
        while (i < n1 && j < n2) {
            //If L[i] <= R[j]
            if (comp.compare(L.get(i), R.get(j)) < 1) {
                //arr[k] = L[i]
                arr.set(k, L.get(i));
                i++;
            }
            else {
                //arr[k] = R[j]
                arr.set(k, R.get(j));
                j++;
            }
            k++;
        }
 
        while (i < n1) {
            //arr[k] = L[i]
            arr.set(k, L.get(i));
            i++;
            k++;
        }
 
        while (j < n2) {
            //arr[k] = R[j]
            arr.set(k, R.get(j));
            j++;
            k++;
        }
    }
}
