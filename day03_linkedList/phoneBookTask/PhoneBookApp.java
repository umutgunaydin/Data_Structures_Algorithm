package day03_linkedList.phoneBookTask;

public class PhoneBookApp {
    public static void main(String[] args) {

        MyPhoneBookSLL list = new MyPhoneBookSLL();
        list.insert(new PhoneNode("mikel", "jackson", "mike@gmail.com", 1234567));
        list.insert(new PhoneNode("john", "kennedy", "john@gmail.com", 1234567));
        list.insert(new PhoneNode("obi", "mikel", "obi@gmail.com", 1234567));
        list.insert(new PhoneNode("mikel", "jackson", "mike@gmail.com", 1234567));

        list.printPhoneBook();

        System.out.println();
        System.out.println(list.isEmpty());

        // list.deleteAllMatchingLastName("jackson");
        // list.printPhoneBook();

//        list.deleteByName("mikel");
//        list.printPhoneBook();


        System.out.println(list.findAll());

        System.out.println(list.findAllByLastName("jackson"));


    }
}
