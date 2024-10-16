//File:LinearEquation.java
//
//LinearEquation Class
//Instance Variables to use:
//x1,y1,x2,y2,yInt
//Constructor
//  public linearEquation(double x1, double y1, double x2, double y2)
//     State variables here

//Methods

//public double calculateDistance()

//Returns the distance between the two points, rounded to the nearest hundredth.
//Distance formula sqrt (pow 2 (x2 - x1)  + pow 2 (y2 - y1))
//Math.sqrt(((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))

//public double slope()

//Returns: The slope of the line, rounded to the nearest hundredth.
//public double calculateYIntercept()

//Returns: The y-intercept of the line, rounded to the nearest hundredth.
// slope = (double) (y2 - y1)/ (x2 - x1)
// yInter = (slope * x1) - y1

//public String fractionFormSlope()
//convert slope into fraction form and use if statements to change signs

//conditions on fractions
//if numerator % denominator = 0; do numerator/denominator
//if numerator * denominator > 0 then pos; if not then negative


//public String toString()
//Prints out the following information:
//first pair, second pair, slope, y inter, equation of line, distance
//add extra conditional if extra "+" sign

//find y coordinate from x input:
//public String findY(double x)
//To find y value: slope * x + yIntercept() then return rounded version

//Runner class
//import scanner
//user enters first and second coordinates
//Uses substring and index of in order to separate values of x1,y1,x2,y2.
//Use variables into LinearEquation
//print out equation
//User inputs 3rd x coordinate
//Use findY method to find the y value that corresponds to the x value