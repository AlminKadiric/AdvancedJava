import java.util.Iterator;

public class Container <E> implements Iterable<E>{
    private int capacity=0;
    private E[]numbers = (E[]) new Object[capacity];


    private E polje;
    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public E getPolje() {
        return polje;
    }

    public void setPolje(E polje) {
        this.polje = polje;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
