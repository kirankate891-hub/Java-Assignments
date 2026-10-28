class Time {
    int hr;
    int min;
    int sec;

    Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;

    }

    Time add(Time t) {
        int totalSec = this.sec + t.sec;
        int totalMin = this.min + t.min;
        int totalHr = this.hr + t.hr;

        totalMin += totalSec / 60;
        totalSec = totalSec % 60;

        totalHr += totalMin / 60;
        totalMin = totalMin % 60;

        totalHr = totalHr % 24;

        return new Time(totalHr, totalMin, totalSec);
    }

    Time add(int hours) {
        int totalhr = (this.hr + hours) % 24;

        return new Time(totalhr, this.min, this.sec);
    }

    void display() {
        System.out.printf("%02d:%02d:%02d%n", hr, min, sec);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(10, 45, 50);
        Time t2 = new Time(2, 30, 25);

        System.out.println("First Time: ");
        t1.display();

        System.out.println("second Time: ");
        t2.display();

        Time result1 = t1.add(t2);

        System.out.println("Addition of two times:");
        result1.display();

        Time result2 = t1.add(5);

        System.out.print("After adding 5 hours: ");
        result2.display();
    }
}
