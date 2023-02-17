import java.io.*;
import java.lang.*;
import java.util.*;

class Main{
    public static boolean check(String a,String b){
        for (int i=0;i<Math.min(a.length(),b.length());i++){
            if (a.charAt(i) != b.charAt(i)){
                if (a.charAt(i) > b.charAt(i)) return true;
                else{
                    return false;
                }
            }
        }
        return false;
    }
    public static void swap(String[] names, int[] marks,int i,int j){
        int temp = marks[i];
        marks[i] = marks[j];
        marks[j] = temp;

        String temp1 = names[i];
        names[i] = names[j];
        names[j] = temp1;
    }
    public static void sortNames(String[] names,int[] marks){
        for (int i=0;i<names.length-1;i++){
            for (int j=0;j<names.length-i-1;j++){
                if (check(names[j],names[j+1])){
                    swap(names,marks,j,j+1);
                }
            }
        }
    }
    public static void sortMarks(String[] names,int[] marks){
        for (int i=0;i<marks.length-1;i++){
            for (int j=0;j<marks.length-i-1;j++){
                if (marks[j] < marks[j+1]) swap(names,marks,j,j+1);
            }
        }
    }
    public static void display(String[] names,int[] marks){
        int prev = -1;
        int rank = 1;
        int count = 0;
        for (int i=0;i<names.length;i++){
            if (marks[i] == prev){
                System.out.println(rank + " " + names[i]);
            }else{
                rank += count;
                System.out.println(rank + " " + names[i]);
                count = 0;
            }
            count++;
            prev = marks[i];
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];
        for (int i=0;i<n;i++){
            names[i] = s.next();
            marks[i] = s.nextInt();
        }
        sortNames(names,marks);
        sortMarks(names,marks);
        display(names,marks);
    }
}