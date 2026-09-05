/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevin
 */
public class MyProg {
    public static void main(String[] args) {
        MyArrayList<Student> mal = new MyArrayList<>();
        mal.insertFirst(new Student(1, "John"));
        mal.insertFirst(new Student(2, "Mary"));
        mal.insertLast(new Student(3, "Mike"));
        mal.show();
        mal.deleteLast();
        mal.show();       
        mal.deleteFirst();
        mal.show();
    }
    
}
