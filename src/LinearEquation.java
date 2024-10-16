public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private String yInt;

public LinearEquation(double x1, double y1, double x2, double y2){
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;

}

public double distance(){

    return Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow((y2 - y1), 2)));
}

public double slope() {
    return Math.round((y2 - y1) / (x2 - x1) * 100.0) / 100.0;
}

public double yIntercept() {
    double slope = slope();
    return Math.round((y1 - (slope * x1)) * 100.0) / 100.0;

}

//".0" Assures that there is no digits after the decimal point, while f represents floating point number.
public String fractionFormSlope() {
    double slope = slope();
    if (slope < 0.0){
        slope = Math.abs(slope());
        return String.format("- %.0f/1", slope);
    }
    if (slope > 0.0){
        return String.format("%.0f/1", slope);
    }
    return String.format("%.0f/1", slope);

}

//converts yIntercept into a decimal form.
public String decimalFormYInter(){
    if ((yIntercept()) > 0.0) {
        return String.format("+ %.2f", yIntercept());
    }

    else if ((yIntercept()) < 0.0){
        return String.format("- %.2f", Math.abs(yIntercept()));
    }
    return "";
}

//calculate y base of x input from user.
public double findY(double x){
    return slope() * x + yIntercept();
}

public String toString(){
    String yInter = decimalFormYInter();
//in case yInter equals to 0 it wouldn't just be blank
    if (yInter.equals("")){
        yInt = "0";
    }
    else {
        yInt = yInter;
    }

    //removes extra case for "+"
    if (yInter.indexOf("+") == 0){
        yInter = yInter.substring(1);
    }
    String slope = fractionFormSlope();

    return  "First Point: (" + x1 + ", " + y1 + ")\n" +
            "Second Point: (" + x2 + ", " + y2 + ")\n" +
            "Slope: " + slope + "x \n" +
            "Equation: y = " + fractionFormSlope() + "x " + yInt + "\n" +
            "Y-Intercept: " + yInter + "\n" +
            "Distance: " + distance();
}
}