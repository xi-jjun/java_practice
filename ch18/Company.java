package ch18;

public class Company {
    
    private static Company instance = new Company(); // the only object

    private Company() {

    }

    public static Company getInstance() {
        if(instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
