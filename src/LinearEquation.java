public class LinearEquation {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    double slope;
    double yIntercept;
    double distance;

public LinearEquation(double x1, double x2, double y1, double y2){
    this.x1 = x1;
    this.x2 = x2;
    this.y1 = y1;
    this.y2 = y2;
    calculateDistance();
    calculateSlope();
    calculateYIntercept();
    fractionForm();

}

public double calculateDistance(){
    return Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow((y2 - y1), 2)));
}

public double calculateSlope() {
    return Math.round((y2 - y1) / (x2 - x1));
}

public double calculateYIntercept() {
    return Math.round((y1 - slope * x1));

}

public String fractionForm() {
    return String.format("%.0f/1", slope);

}

public String toString(){
    return String.format("y = " + fractionForm() + "");
}

//public int fractionCheck(){
//    String str = fractionForm();
//    String splitStr = str.split(",");
//    if str.
//}
}