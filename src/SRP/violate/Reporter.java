package SRP.violate;

public class Reporter {
    
    //Class with multiple responsibilities – violating SRP
    public void generateIncomeReports(){
        // uses income details from database
        // builds income relate report
        System.out.println("Generating Income Report..");
    }
    
    public void generatePaymentsReports(){
        // uses payment details from database
        // builds payment report
        System.out.println("Generating Payment Report..");
    }
    
    public void computeBalance(){
        // uses balance database
        // computes necessary info
        System.out.println("COmputing balance... well, it is " + Math.round(Math.random()*2000) + " INR");
    }
    
    public void printReport(){
        // code to print report
        System.out.println("Printing reports...");
    }
}
