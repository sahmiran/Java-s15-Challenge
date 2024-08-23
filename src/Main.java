import org.challenge.s15.enums.Status;
import org.challenge.s15.humans.Author;
import org.challenge.s15.humans.Librarian;
import org.challenge.s15.humans.Person;
import org.challenge.s15.humans.Reader;
import org.challenge.s15.props.*;

public class Main {
    public static void main(String[] args) {
        Reader ali = new Reader("ali");
        Author veli = new Author("Veli");
        Author Ayşe = new Author("Ayşe");
        Author Mahmut = new Author("Mahmut");
        Book studyBook = new StudyBooks("1",veli,"İzi Java",60.99,"2.edition");
        Book journal = new Journals("2",Ayşe,"journal1",80.99,"1.edition");
        Book magazine = new Magazines("3",Mahmut,"magazine1",90.99,"6.edition");
        Book journal2 = new Journals("4",Ayşe,"journal2",50.99,"1.edition");
        Book studyBook2 = new Journals("5",veli,"izi Java 2",150.99,"1.edition");

        ali.getBooks().add(studyBook);
        ali.getBooks().add(journal);
        ali.getBooks().add(magazine);

        ali.purchase_book(journal2);
        ali.borrow_book(studyBook2);
        ali.show_book();
        System.out.println("------------------------------------------");
        journal2.display();
        ali.return_book(journal2);
        journal2.display();
        System.out.println("-------------------------------------------");
        ali.show_book();
        ali.purchase_book(magazine);
        ali.purchase_book(magazine);
        ali.purchase_book(magazine);
        ali.borrow_book(magazine);
        System.out.println("-------------------------------------------");

        Library merkezKutuphane= new Library();
        merkezKutuphane.new_book(1,studyBook);
        merkezKutuphane.new_book(2,journal);
        merkezKutuphane.new_book(3,magazine);
        merkezKutuphane.new_book(4,journal2);

        Librarian librarian = new Librarian("Kütüphaneci","123456",merkezKutuphane);
        librarian.calculate_fine(studyBook);
        System.out.println("*******");
        librarian.create_bill(studyBook);
        System.out.println("-----------------------------------------------");
        studyBook.update_status(Status.BAD_CONDITION);

        librarian.calculate_fine(studyBook);
        System.out.println("*******");
        librarian.create_bill(studyBook);

        System.out.println("--------------------------------------");
        merkezKutuphane.show_book();

        Reader beli = new Reader("beli");
        Reader deli = new Reader("deli");
        Reader zeli = new Reader("zeli");
        Reader keli = new Reader("keli");
        System.out.println("----------------------------------------");
        System.out.println(merkezKutuphane.getReaders());
        librarian.verify_member(1,beli);
        librarian.verify_member(2,deli);
        librarian.verify_member(3,zeli);
        librarian.verify_member(4,keli);
        System.out.println(merkezKutuphane.getReaders());


    }
}