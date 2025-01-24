package EducationalCourseHierarchy;

public class PaidOnlineCourse extends  OnlineCourse{
    private double fee;
    private double discount;
    private double feeAfterDiscount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    public double getFeeAfterDiscount(){
        return  feeAfterDiscount = fee- (discount*fee)/100;
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("fee for this coursse is "+ fee);
        System.out.println("Discount in percent is " + discount);
        System.out.println("discounted fee is " + getFeeAfterDiscount());
    }
}
