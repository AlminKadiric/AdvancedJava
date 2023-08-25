package kolekcije;

import one.Gender;

import java.util.List;

public class CsvDemo {
    public static void main(String[] args) {
        PersonCsvReader personCsvReader = new PersonCsvReader("persons.csv");
        List<Person> personList = personCsvReader.readPersonList();
        Person person = new Person();
        person.setGender(Gender.MALE);
        PersonTester personTester = (p)  -> p.getGender().equals(Gender.FEMALE);
        personTester.test(person);

        //printPerson(personList);
        //printFemalePerson(personList);
        //printMalePerson(personList);
       // printPersonsOlderThan(personList,20);
       // printPersonsYoungerThan(personList,20);
       // printPerson(personList,p->true);
        //printPerson(personList,p->p.getGender().equals(Gender.FEMALE));
       //printPerson(personList,p -> person.getGender().equals(Gender.MALE));
        printPerson(personList,p->p.getAge()>=20);

    }

    static void printPerson(List<Person> personList,PersonTester personTester) {
        for (Person person :personList) {
            if (personTester.test(person)) {
                System.out.println(person);

            }
        }
        personList.
                stream().
                filter(p->personTester.test(p)).
                forEach(p -> System.out.println(p));
    }

    static void printPerson(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            System.out.println(person);

        }
    }

    static void printFemalePerson(List<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getGender().equals(Gender.FEMALE)) {
                System.out.println(person);

            }


        }
    }
        static void printMalePerson (List < Person > personList) {
            for (int i = 0; i < personList.size(); i++) {
                Person person = personList.get(i);
                if (person.getGender().equals(Gender.MALE)) {
                    System.out.println(person);

                }


            }
        }
    static void printPersonsOlderThan(List<Person> personList,int age) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getAge() >= age) {
                System.out.println(person);

            }
        }

    }
    static void printPersonsYoungerThan(List<Person> personList,int age) {
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            if (person.getAge() <= age) {
                System.out.println(person);

            }
        }
    }

    }


