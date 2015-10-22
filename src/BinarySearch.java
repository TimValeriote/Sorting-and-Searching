/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public int binarySearch(int find, int[] a, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (end + start) / 2;
        if (a[mid] == find) {
            return mid;
        } else if (find < a[mid]) {
            return binarySearch(find, a, start, mid - 1);
        } else {
            return binarySearch(find, a, mid + 1, end);
        }
    }

}
