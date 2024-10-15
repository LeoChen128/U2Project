public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

public LinearEquation(double x1, double x2, double y1, double y2){
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;

}

public double distance(){

    return Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow((y2 - y1), 2)));
}

public double slope() {
    return Math.round((y2 - y1) / (x2 - x1) * 100) / 100.0;
}

public double yIntercept() {
    double slope = slope();
    return Math.round(((slope * x1) - y1) * 100) / 100.0;

}

//".0" Assures that there is no digits after the decimal point, while f represents floating point number.
public String fractionFormSlope() {
    double slope = slope();
    if (slope < 0){
        Math.abs(slope());
        return String.format("- %.0f/1", slope);
    }
    if (slope > 0){
        return String.format("+ %.0f/1", slope);
    }
    return String.format("%.0f/1", slope);

}
public String decimalFormYInter(){
    if ((yIntercept()) > 0) {
        return String.format("+ %.2f", yIntercept());
    }

    else if ((yIntercept()) < 0){
        Math.abs(yIntercept());
        return String.format("- %.2f", yIntercept());
    }
    return String.format("%.2f", yIntercept());
}

public String toString(){
    String yInter = decimalFormYInter();
    String slope = fractionFormSlope();

    return "y = " + fractionFormSlope() + "x " + yInter + "/n"
            + "Slope: " + slope + "x /n";
}







}