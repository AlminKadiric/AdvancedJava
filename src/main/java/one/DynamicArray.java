package one;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray implements Iterable<Integer> {
    private int capacity = 0;

    private int [] numbers = new int[capacity];
    public DynamicArray(){
        super();
    }

    public void add(int number){
        capacity++;
        numbers = Arrays.copyOf(numbers,capacity);
        numbers[capacity-1] = number;
    }

    public void remove(int index){
        if(index <0 || index >=capacity){
            System.err.println("Index out of range!!!");

        }else {
            for (int i = index; i <capacity-1 ; i++) {
                numbers[i]=numbers[i+1];



            }
            Arrays.copyOfRange(numbers,0,capacity-1);
            capacity--;


        }
    }

    @Override
    public Iterator<Integer> iterator() {
        Iterator<Integer> iterator = (Iterator<Integer>) new IntegerIterator();
        return iterator;
    }
    private class IntegerIterator implements Iterator<Integer>{
     private int nextIndex =0;


        @Override
        public boolean hasNext() {
            return (nextIndex <= capacity-1);
        }

        @Override
        public Integer next() {
            int number = numbers[nextIndex];
            nextIndex++;
            return number;
        }
    }
}
