import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main (String []args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("How many elements would you like to store?");
        int num = scan.nextInt();          

        int[] array = new int[num];
        System.out.print("Enter the elements you wish to store: ");
        for (int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }

        System.out.println("Please choose one of the following: [1]Integers sorted using .parallelSort  [2]Integers sorted manually");
        int choice = scan.nextInt();

        if (choice == 1) {
            //Part 1 using java.util.Arrays
            System.out.println();
            System.out.println("Your array elements have now been sorted in an ascending numerical order: ");
    
            Arrays.parallelSort(array);//https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Arrays.html#parallelSort(byte%5B%5D)
            System.out.println("The sorted array is: " + Arrays.toString(array));
            //Arrays.stream(array)//https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Arrays.html#stream(T%5B%5D)
            //    .forEach(n -> System.out.print(n + " "));//https://zetcode.com/java/foreach/ **I understood this explanation most for .forEach method**
        } else if (choice == 2) {
            //Part 2 using a manual way of sorting an array
            int[] manualSort = new int[array.length];
            int currLow;
            int prevLow = 0;

            for (int i = 0; i < manualSort.length; i++) {
                currLow = Integer.MAX_VALUE;
        
                for (int j = 0; j < array.length; j++) {
                    if (i > 0 && array[j]<currLow && array[j]>prevLow) {
                    currLow = array[j];
                

                    } else if (i == 0 && array[j]<currLow) {
                    currLow = array[j];
                    }
                }
                manualSort[i] = currLow;
                prevLow = currLow;
                
            }
            System.out.println("Your array elements have now been sorted manually in an ascending numerical order:  " + Arrays.toString(manualSort));
            //these for loops are comparing the first and second elements of the array to see which number is of lesser value
            //it takes the lesser of the two values and goes to each of the following array elements. it compares and keeps the lesser value from each comparison and ends with the smallest value of the array
            //this process is then repeated omitting the smallest value it just found
            //the following .gif helped me understand the process: https://en.wikipedia.org/wiki/Selection_sort#/media/File:Selection-Sort-Animation.gif
            //I had this working without hiccups but now it's repeating the array and print lines
        } else {
            System.out.println("Please input [1] or [2]");
        }

        //Part 3 sorting String arrays alphabetically and reverse alphabetically
        System.out.print("Please input your list of words: ");
        scan.nextLine();
        String[] phrase = scan.nextLine().split(" ");
        System.out.println(phrase[1]);
        int size = phrase.length;

        System.out.println("Please choose one of the following: [1]Sort alphabetically  [2]Sort reverse alphabetically");
        int sort = scan.nextInt();

        if (sort == 1) {
            //sorts the string alphabetically
            for (int i=0; i<size-1; i++) {
                for (int j=1+i; j<phrase.length-1; j++) {
                    if (phrase[i].compareTo(phrase[j])>0) {
                        String temp = phrase[i];
                        phrase[i] = phrase[j];
                        phrase[j] = temp;
                    }
                }
            }
            System.out.println("Here is your sorted phrase: " + Arrays.toString(phrase));
            /*comment for string array sorting
            -- the for loop compares the 
            */
        
        } else if (sort == 2{
            //sorts the string reverse alphabetically
            for (int i=0; i<size-1; i++) {
                for (int j=1+i; j<phrase.length-1; j++) {
                    if (phrase[i].compareTo(phrase[j])<0) {
                        String temp = phrase[i];
                        phrase[i] = phrase[j];
                        phrase[j] = temp;
                    }
                }
            }
            System.out.println("Reverse sorted array: " + Arrays.toString(phrase));
        }
        //the same sort of sorting is done with the above for loops. the loops take two elements and compares them, taking the lesser of the two and grabing the next array element to compare it to.
        //this process continues until the array is completely sorted
    }
} 