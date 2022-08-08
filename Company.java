import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Company {
    private String cname;
    private ArrayList<PayAble> payAbles=new ArrayList<>();

    public Company(String name) {
        this.cname = name;
    }

   public boolean add(PayAble p){
       return payAbles.add(p);
   }

    public double computeAmount() {
   double amount=0;
   for (int i=0;i<payAbles.size();i++) {
       amount+=payAbles.get(i).computeAmount();
   }
return amount;
    }

    @Override
    public String toString() {
        return "Company{" +
                "cname='" + cname + '\'' +
                ", payAbles=" + payAbles +
                '}';
    }
}
