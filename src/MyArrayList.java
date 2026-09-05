
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kevin
 */

// ***  MyArrayList is limited to 100 elements.  ***
public class MyArrayList<E> extends ArrayList<E> {
    
    private final int no = 100;

    public MyArrayList() {
        super();
        // assert postcondition
        // new list should start empty
        assert super.isEmpty();
    }

    @Override
    public int size() {
        //need to call parent size method, so not calling self 
        int s = super.size();
        // assert postcondition
        assert s >= 0 && s <= no;
        
        return s;
    }

    // Insert e as a new first element to mal
    public void insertFirst(E e) {
        // assert precondition
        assert e != null;
        assert size() < no : "ArrayList is full";
        
        //code
        //save size
        int size = size();
        add(0,e);
        
        // assert postcondition
        assert get(0).equals(e);
        assert size()== size + 1; 
        //check no of elements increase by one
    }

    // Insert e as a new last element
    public void insertLast(E e) {
        // assert precondition
        assert e != null;
        assert size() < no : "ArrayList is full";
        
        // code
        //save size
        int size = size();
        add(e);
        
        // assert postcondition
        assert get(size()-1).equals(e);
        assert size()== size + 1;       
        // check no of elements increase by one
    }

    // Delete my first element
    public void deleteFirst() {
        // assert precondition
        assert !isEmpty(): "ArrayList is empty";
        // code
        int size = size();
        remove(0);
        // assert postcondition
        assert size()== size - 1; 
    }

    // Delete my last element
    public void deleteLast() {
        // assert precondition
        assert !isEmpty(): "ArrayList is empty";
        // code
        int size = size();
        remove(size()-1);
        // assert postcondition
        assert size()== size - 1; 
    }

    public void show() {
        for (E e : this) {
            System.out.println(e);
        }
    }
}

