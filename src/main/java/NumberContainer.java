import one.DynamicArray;

import java.util.Arrays;
import java.util.Iterator;

public class NumberContainer<E extends Number> implements Iterable {
    private E polje;

    private int capacity = 0;
    private E[] numbers = (E[]) new Object[capacity];

    public E getPolje() {
        return polje;
    }

    public void setPolje(E polje) {
        this.polje = polje;
    }



    public void add(E number){
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
    public Iterator iterator() {
        return new NumberIterator();
    }

    private class NumberIterator implements Iterator<E>{
        private int nextIndex =0;


        @Override
        public boolean hasNext() {
            boolean imaJos =(nextIndex <= capacity -1);
            return imaJos;
        }

        @Override
        public E next() {
            E number = numbers[nextIndex];
            nextIndex++;
            return number;
        }
    }
}

