
package b7.b7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class B7 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMENU\n1.Insert some Elements at the Specified Position \n2.Swap two elements in a linked list\n3.Iterate a LinkedList in Reverse Order\n4.Compare Two LinkedList\n5.Convert a LinkedList to ArrayList\n6.Exit\n\nEnter your choice: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("Enter the element to be inserted: ");
                    int ele = sc.nextInt();
                    System.out.printf("Enter the position from 0 to %d: ", list.size());
                    int indx = sc.nextInt();
                    if (indx < 0 || indx > list.size()) {
                        System.out.println("Invalid index");
                    } else {
                        list.add(indx, ele);
                        System.out.printf("List after insertion: %s", list);
                    }
                }
                case 2 -> {
                    if (list.size() < 2) {
                        System.out.println("Insuficient elements\n");
                    } else {
                        System.out.println("Enter first and second element: ");
                        int indx1 = list.indexOf(sc.nextInt());
                        int indx2 = list.indexOf(sc.nextInt());
                        if (indx1 == -1 || indx2 == -1) {
                            System.out.println("Element not found to swap\n");
                        } else {
                            Collections.swap(list, indx1, indx2);
                            System.out.printf("List after swapping: %s", list);
                        }
                    }
                }
                case 3 -> {
                    if (list.size() <= 0) {
                        System.out.println("List is empty");
                    } else {
                        System.out.println("List in reverse order: \n");
                        Iterator itr = list.descendingIterator();
                        while (itr.hasNext()) {
                            System.out.printf("%d ", itr.next());
                        }
                    }
                }
                case 4 -> {
                    LinkedList<Integer> temp = new LinkedList<>();
                    sc.nextLine();
                    System.out.println("Enter new list elements separated by space: ");
                    Scanner nsc = new Scanner(sc.nextLine());
                    while (nsc.hasNextInt()) {
                        temp.add(nsc.nextInt());
                    }
                    System.out.printf("Contents of original list: %s\nTemp list: %s\n", list, temp);
                    if (list.equals(temp)) {
                        System.out.println("Both the list are same ");
                    } else {
                        System.out.println("linked lists are not same");
                    }
                }
                case 5 -> {
                    if (list.size() <= 0) {
                        System.out.println("List is empty");
                    } else {
                        ArrayList<Integer> alist = new ArrayList<>(list);
                        System.out.printf("Converted array list: %s", alist);
                    }
                }
                case 6 -> {
                    return;
                }
            }
        }
    }
}
