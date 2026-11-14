interface Payment {

    void pay();
}

class GooglePay implements Payment {

    public void pay() {
        System.out.println("Payment using Google Pay");
    }
}

class PhonePe implements Payment {

    public void pay() {
        System.out.println("Payment using PhonePe");
    }
}

public class Main {
    public static void main(String[] args) {

        GooglePay g = new GooglePay();
        PhonePe p = new PhonePe();

        g.pay();
        p.pay();
    }
}
