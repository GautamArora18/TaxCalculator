import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**Tax Calculator As Per Indian Tax Slabs**");
        System.out.println("Enter Your income in LAKHS");
        float income = sc.nextFloat();
        float tax=0;
        if(income <= 2.5f){
            tax = tax + 0;
        }else if(income > 2.5f && income <= 5.0f){
            tax = tax + 0.05f*(income - 2.5f);
        } else if(income > 5.0f && income <= 7.5f) {
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.10f*(income - 5.0f);
        }else if(income > 7.5f && income <= 10.0f){
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.10f*(7.5f - 5.0f);
            tax = tax + 0.15f*(income - 7.5f);
        }else if(income > 10.0f && income <= 12.5f){
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.10f*(7.5f - 5.0f);
            tax = tax + 0.15f*(10.0f - 7.5f);
            tax = tax + 0.20f*(income - 10.0f);
        }else if(income > 12.5f && income <= 15.0f){
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.10f*(7.5f - 5.0f);
            tax = tax + 0.15f*(10.0f - 7.5f);
            tax = tax + 0.20f*(12.5f - 10.0f);
            tax = tax + 0.25f*(income - 12.5f);
        }else{
            tax = tax + 0.05f*(5.0f - 2.5f);
            tax = tax + 0.10f*(7.5f - 5.0f);
            tax = tax + 0.15f*(10.0f - 7.5f);
            tax = tax + 0.20f*(12.5f - 10.0f);
            tax = tax + 0.25f*(15.0f - 12.5f);
            tax = tax + 0.30f*(income - 15.0f);
        }
        System.out.println("Your final tax which has to be paid is: "+tax+" Lakhs");
        float taxInRupees = tax * 100;
        System.out.println("Or");
        System.out.println("Your final tax which has to be paid is: "+taxInRupees+" Thousand");
    }
}
