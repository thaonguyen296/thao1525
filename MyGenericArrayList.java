package JV2_Session2;

import java.util.ArrayList;
import java.util.Scanner;

public class MyGenericArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
            for (int i=1; i<=10; i++){
                System.out.println("Nhap so"+i+ ":");
                Scanner nhap = new Scanner(System.in);
                i=nhap.nextInt();
                myList.add(i);
            }
            System.out.println(myList);
    }
}
