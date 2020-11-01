package bd.edu.seu;import java.util.ArrayList;import java.util.List;public class Main {    public static void main(String[] args) {        int[] arr = {12,11,13,5,6,7,283,-989,3983893,-93939,0,389};        sort_function(arr,0,arr.length-1);        for (int value : arr) {            System.out.print(value + " ");        }    }    private static void sort_function(int[] arr, int left, int right) {        if(left<right){            int middle = (left+right)/2;            sort_function(arr,left,middle);            sort_function(arr,middle+1,right);            merge_function(arr,left,middle,right);        }    }    private static void merge_function(int[] arr, int left, int middle, int right) {        int i=left,j=middle+1;        List<Integer> temp = new ArrayList<>();        while (i<=middle && j<=right){            if(arr[i]<arr[j]){                temp.add(arr[i]);                i++;            }else{                temp.add(arr[j]);                j++;            }        }        while (i<=middle){            temp.add(arr[i]);            i++;        }        while (j<=right){            temp.add(arr[j]);            j++;        }        int k;        for(i=left,k=0;i<=right;i++,k++){            arr[i]=temp.get(k);        }    }}