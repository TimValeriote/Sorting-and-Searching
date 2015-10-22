
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Tim
 */
public class BucketSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        insertionSort test = new insertionSort();
        int[] n = {60, 8, 32, 1, 45, 78, 34, 7};//n array with values    
//        test.insertionSort(n);//sort the numbers
        test.insertionSort(n);

        for (int i = 0; i < n.length; i++) {// i will equal the length of the array
            System.out.println(n[i]);//print out each number
        }

    }

    public void bucketSort(int[] n) {
        int[] track = new int[101]; //creates new tracker array
        for (int i = 0; i <= 100; i++) { //gives each track value 0
            track[i] = 0;
        }

        for (int i = 0; i < n.length; i++) {

            int j = n[i]; //creates an int and puts a value into what ever position n is currently on

            track[j] += 1;//add 1 to the tracker position

        }

        int counter = 0;//variable for a position in the orginal array

        for (int i = 0; i <= 100; i++) {//run through each position in thew tracker array

            for (int g = track[i]; g > 0; g--) {//also run through spots in the tracker array that have values
                n[counter] = i;//fill original array with value of tracker
                counter++;//add 1 to counter so it will keep them in order
            }
        }
    }

}
