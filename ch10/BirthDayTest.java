package ch10;

public class BirthDayTest {

    public static void main(String[] args) {

        BirthDay date = new BirthDay();

        // why we use private in BirthDay class?
        // we can avoid member variable's misuse
        // no private : date.month = 100; OOO
        // private : date.month = 100; XXX => protect member variable
        date.setYear(2019);
        date.setMonth(3);
        date.setDay(29);

        date.showDate();
    }
    
}