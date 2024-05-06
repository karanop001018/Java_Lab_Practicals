import java.util.ArrayList;
import java.util.Date;
class Circle{
    double r;
    Circle(double r){
        this.r=r;
    }
    public String toString(){
        return "Circle with radius:"+this.r;
    }
}
class loan{
    double amount;
    loan(double amount){
        this.amount=amount;
    }
    public String toString(){
        return "Loan with amount:"+this.amount;
    }
}
public class practical_34 {
    public static void main(String[] args) {
        ArrayList<Object> arr=new ArrayList<Object>();
        arr.add(new loan(5000));
        arr.add(new Date());
        arr.add(new String("Java Practical"));
        arr.add(new Circle(6.45));
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i).toString());
        }
    }
}