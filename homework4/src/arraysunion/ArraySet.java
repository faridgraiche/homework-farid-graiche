package arraysunion;

import java.util.HashSet;

public class ArraySet {

    public void intersection() {

        int Array1[] = {1, 3, 2, 4, 8, 9, 0};
        int Array2[] = {1, 3, 7, 5, 4, 0, 7, 5};

        HashSet<Integer> set1 = new HashSet<>();

        for (int val : Array1) {
            set1.add(val);
        }
        for (int val : Array2) {
            if (set1.contains(val)) {
                System.out.println(val);
            }
        }

        }

    public void union () {

        int array1[] = {1, 3, 2, 4, 8, 9, 0};
        int array2[] = {1, 3, 7, 5, 4, 0, 7,5};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            set.add(array1[i]);
        }

        for (int i = 0; i < array2.length; i++) {
            set.add(array2[i]);
        }
        System.out.print(set);

    }

    public void difference(){
        int arr1[] = {1,3,2,4,8,9,0};
        int arr2[] = {1,3,7,5,4,0,7,5};

        HashSet set1 = new HashSet<>();
        HashSet set2 = new HashSet<>();
        for (int i = 0; i< arr1.length;i++){
            set1.add(arr1[i]);
            set2.remove(arr1[i]);

        }
        for (int i=0; i< arr2.length;i++){
            set2.add(arr2[i]);
            set1.remove(arr2[i]);
        }
        System.out.println(set1);
        System.out.println(set2);
    }


        }

