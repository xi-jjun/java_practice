package ch14;

public class TakeTransTest {
    
    public static void main(String[] args) {

        Student studentJun = new Student("xi-jjun", 5000);
        Student studentKim = new Student("ki-jun", 10000);

        Bus bus100 = new Bus(100);
        Subway subway2 = new Subway(2);

        studentJun.takeBus(bus100);
        studentKim.takeSubway(subway2);

        studentJun.showInfo();
        studentKim.showInfo();

        bus100.showBusInfo();
        subway2.showSubwayInfo();
    }
}
