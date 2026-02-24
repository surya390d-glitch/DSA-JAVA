public class Circle_R {
    public static void main(String []args){
        circle A = new circle(23);
        A.DisplayAns();
    }
}
class circle {
    double r;

    circle(double r) {
        this.r = r;
    }

    double Area() {
        double ans = (Math.PI * r * r);
        return ans;
    }

    double Circumference() {
        double ans = (2 * Math.PI * r);
        return ans;
    }

    void DisplayAns() {
        System.out.println("Circumference: " + Circumference());
        System.out.println("Area: " + Area());
    }
}
