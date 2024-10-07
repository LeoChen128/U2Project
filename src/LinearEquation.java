public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    double slope;

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
    return Math.round((y2 - y1) / (x2 - x1));
}

public double yIntercept() {
    return Math.round((y1 - slope * x1));

}

//".0" Assures that there is no digits after the decimal point, while f represents floating point number.
public String fractionForm() {
    return String.format("%.0f/1", slope);

}

//This would
public String toString(){
    if ((yIntercept()) > 0) {
        String formatYInter = String.format("+ %.2f", yIntercept());
        return String.format("y = " + fractionForm() + " " + yIntercept());
    }

    else if ((yIntercept()) < 0){
        Math.abs(yIntercept());
        String formatYInter = String.format("- %.2f", yIntercept());
        return String.format("y = " + fractionForm() + " " + yIntercept());
    }


    return String.format("y = " + fractionForm() + " " + yIntercept());
}







}