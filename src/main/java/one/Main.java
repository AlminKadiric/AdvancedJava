package one;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Eldar");
        p1.setGender(Gender.MALE);

        Person p2 = new Person();
        p2.setSurname("Greta");
        p2.setGender(Gender.FEMALE);


        Box kutija1 = new Box();
        kutija1.setPolje(23);

        Box <Integer> kutija = new Box<>();


    }
}
