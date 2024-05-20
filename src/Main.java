//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book newBook1 = new Book();
        System.out.println(newBook1.author);
        System.out.println(newBook1.title);
        System.out.println(newBook1.isbn);

        Book newBook2 = new Book("It", "King", 111111);
        System.out.println(newBook2.author);
        System.out.println(newBook2.title);
        System.out.println(newBook2.isbn);

        Book newBook3 = new Book("Monte Cristo"," Dumas", 222222);
        System.out.println(newBook3.author);
        System.out.println(newBook3.title);
        System.out.println(newBook3.isbn);

        Book newBook4 = new Book("Harry Potter","Rowling");
        System.out.println(newBook4.author);
        System.out.println(newBook4.title);
        System.out.println(newBook4.isbn);

        Book newBook5 = new Book( "Peter Pan", "Barrie");
        System.out.println(newBook5.author);
        System.out.println(newBook5.title);
        System.out.println(newBook5.isbn);

        Book newBook6 = new Book("Alices");
        System.out.println(newBook6.author);
        System.out.println(newBook6.title);
        System.out.println(newBook6.isbn);




        }
    }
