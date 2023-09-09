/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Library;
import controller.SearchProgramming;
import model.Element;

/**
 *
 * @author quang
 */
public class Test {
    public static void main(String[] args) {
        Element element = new Element();
        Library lib  =new Library();
        
        element.setArr_size(lib.getInt("Enter a size of an array", 1, 100));
        element.setArr(lib.createArray(element.getArr_size()));
        new SearchProgramming(element).run();
    }
}
