package ch18;

public class CompanyTest {
    
    public static void main(String[] args) {

        Company company1 = Company.getInstance(); // 유일한 객체를 제공할 때 이렇게 한다.
        Company company2 = Company.getInstance();

        // Company company1 = new Company();
        // Company company2 = new Company();

        System.out.println(company1);
        System.out.println(company2);
        // 원래 생성된 instance의 주소는 각각 다르다.
        // 그러나 유일한 instance하나만 만들 수 있게 했기에 주소값이 같게 나온다.
    }
}
