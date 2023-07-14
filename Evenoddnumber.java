package Workshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Evenoddnumber {
    public void checkoddeven(int n,int arr[]){
        int i,counteven=0,countodd=0;
        ArrayList<Integer> arreven = new ArrayList<>();
        ArrayList<Integer> arrodd = new ArrayList<>();
        for (i = 0;i<n;i++){
            if (arr[i]%2==0){
                arreven.add(arr[i]);
                counteven++;
            }else if (arr[i]%2!=0){
                arrodd.add(arr[i]);
                countodd++;
            }
        }
        System.out.println("Even numbers present in the array are:"+arreven+" and count is: "+counteven);
        System.out.println("Even numbers present in the array are:"+arrodd+" and count is: "+countodd);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i;
        System.out.println("Enter how many numbers do you want in an array:");
        n=scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in an array:");
        for (i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        Evenoddnumber obj = new Evenoddnumber();
        obj.checkoddeven(n,arr);
    }}

