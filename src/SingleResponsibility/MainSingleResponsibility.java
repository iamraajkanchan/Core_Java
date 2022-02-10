package SingleResponsibility;

public class MainSingleResponsibility {
    public static void main(String[] args) {
        Calculation rajCalculation = new Calculation(1, 25.25, "Java Book", "Raaj Kanchan");
        rajCalculation.showDetails();
        Email.sendEmail();
        rajCalculation.printBalance();
    }
}
