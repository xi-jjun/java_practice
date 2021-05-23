package ch09;

public class StudentTest {
    
    public static void main(String[] args) {

        Student studentKim = new Student(2016111952,"xi-Jun");
        studentKim.setKoreaSubject("Korean", 65);
        studentKim.setMathSubject("Math", 99);

        Student studentSung = new Student(2019111446, "KSY");
        studentSung.setKoreaSubject("Korean", 100);
        studentSung.setMathSubject("Math", 100);

        studentKim.showScoreInfo();
        studentSung.showScoreInfo();
    }
}