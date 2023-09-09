/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Algorithm;
import common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author quang
 */
public class SearchProgramming extends Menu<String> {

    static String options[] = {"Linear Search", "Binary Search"};
    protected Library lib;
    protected Algorithm algorithm;
    protected int[] arr;
    protected int arr_size;

    public SearchProgramming(Element element) {
        super("SEARCH ALGORITHM", options);
        lib = new Library();
        algorithm = new Algorithm();
        arr = element.getArr();
        arr_size = element.getArr_size();
    }

    @Override
    public void excute(int n) {
        System.out.print("Array: ");
        lib.displayArr(arr);
        int k, pos;
        switch (n) {
            case 1:
                 k = lib.getInt("Enter a number that you want to seek ", Integer.MIN_VALUE, Integer.MAX_VALUE);
                 pos = algorithm.linearSearch(arr, k);
                
                if (pos >= 0) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not found");
                }
                
                break;
            case 2:
                 k = lib.getInt("Enter a number that you want to seek ", Integer.MIN_VALUE, Integer.MAX_VALUE);
                 pos = algorithm.binarySearch(arr, k);
                
                if (pos >= 0) {
                    System.out.println("Found");
                } else {
                    System.out.println("Not found");
                }
                break;
        }
    }

}


/*
- Khởi tạo git
git init
- Tạo nhánh
git checkout -b develop
- Kiểm tra trạng thái
git status
- Thêm tất cả các file
git add .
- Commit lần chuẩn bị để đẩy code
git commit -m "nội dung"
- Kiểm tra đã remote chưa
git remote -v
- Thực hiện việc add remote
git remote add origin git@.....
- Đẩy code
git push origin develop


*/
