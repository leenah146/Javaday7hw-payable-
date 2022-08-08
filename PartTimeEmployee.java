public  class PartTimeEmployee extends Employee{
    private int WorkHours;
    private int wage;


    public PartTimeEmployee(int id, String name, int workHours, int wage) {
        super(id, name);
        WorkHours = workHours;
        this.wage = wage;
    }


    public double computeAmount() {
        return WorkHours*wage;
    }
}
