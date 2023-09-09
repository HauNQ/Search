/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Arrays;

/**
 *
 * @author quang
 */
public class Algorithm {

   public int  linearSearch(int [] arr, int k){
       for(int i = 0; i < arr.length; i++){
            if(arr[i] == k ) return i;
       } 
       
       return -1;
   }
   
   public void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

   public int binarySearch(int [] arr, int k){
       int tempArr[] = Arrays.copyOf(arr, arr.length);
       bubbleSort(tempArr);
       
       int l = 0;
       int r = tempArr.length-1;
       
       while(l <= r){
           int mid = (l+r)/2;
           if(tempArr[mid] == k) return mid;
           else if(tempArr[mid] > k) r = mid-1;
           else l = mid+1;
       }
       
       return -1;
   }
   
   

}
