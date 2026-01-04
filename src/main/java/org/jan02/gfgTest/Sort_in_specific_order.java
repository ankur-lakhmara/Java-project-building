package org.jan02.gfgTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort_in_specific_order {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 5, 4, 7, 10};
        Solution s1  = new Solution();
        System.out.println(s1.sortIt(arr));
    }
}

class Solution{
    public boolean sortIt(int[] arr) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int val : arr) {
            if (val % 2 == 0) even.add(val);
            else odd.add(val);
        }

        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);

        int idx = 0;
        for (int v : odd) arr[idx++] = v;
        for (int v : even) arr[idx++] = v;
        return false;
    }

}
