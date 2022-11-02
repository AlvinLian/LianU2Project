public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    // constructor used to create LinearEquation objects
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // method that returns the distance between (x1, y1) and (x2, y2) to the nearest hundredth
    public double distance() {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return roundedToHundredth(distance);
    }

    // method that returns the y-intercept of the line between (x1, y1) and (x2, y2), rounded to the nearest hundredth
    public double yIntercept() {
        double yIntercept = (double) y1 - (slope() * x1);
        return roundedToHundredth(yIntercept);
    }

    // method that returns the slope of the line between (x1, y1) and (x2, y2), rounded to the nearest hundredth
    public double slope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        return roundedToHundredth(slope);
    }


    // Returns a String that represents the linear equation of the line through points
    //   (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form
    // The slopes are checked first if they are equal to 0, less than 0, or greater than 0
    // Slopes are then checked to see if they are equal to 1,
    // whole numbers with 0 after decimal point like 4.0, or decimals like 3.35
    // Slopes equal to 1 are not printed; slopes equal to whole numbers with 0 after decimal point are printed
    // as an integer; decimals are printed as fractions
    // Within each of those slope conditions above, the y-intercepts are also checked to see
    // if they are positive, negative, or zero
    public String equation() {
        String equation = "y = ";
        double slope = slope();
        double yIntercept = yIntercept();
        int changeInY = y2 - y1;
        int changeInX = x2 - x1;

        if (slope > 0) {
            if (slope == 1) {
                if (yIntercept > 0) {
                    equation += "x" + " + " + yIntercept;
                } else if (yIntercept < 0) {
                    equation += "x" + " - " + Math.abs(yIntercept);
                } else {
                    equation += "x";
                }
            } else if (slope % 1 == 0) {
                if (yIntercept > 0) {
                    equation += (int)slope + "x" + " + " + yIntercept;
                } else if (yIntercept < 0) {
                    equation += (int)slope + "x" + " - " + Math.abs(yIntercept);
                } else {
                    equation += (int)slope + "x";
                }
            } else if (slope % 1 != 0 ) {
                if (yIntercept > 0) {
                    equation += Math.abs(changeInY) + "/" + Math.abs(changeInX) + "x" + " + " + yIntercept;
                } else if (yIntercept < 0) {
                    equation += Math.abs(changeInY) + "/" + Math.abs(changeInX) + "x" + " - " + Math.abs(yIntercept);
                } else {
                    equation += Math.abs(changeInY) + "/" + Math.abs(changeInX) + "x";
                }
            }
        } else if (slope < 0) {
            if (slope == -1) {
                if (yIntercept > 0) {
                    equation += "-x" + " + " + yIntercept;
                } else if (yIntercept < 0) {
                    equation += "-x" + " - " + Math.abs(yIntercept);
                } else {
                    equation += "-x";
                }
            } else if (slope % 1 == 0) {
                if (yIntercept > 0) {
                    equation += (int)slope + "x" + " + " + yIntercept;
                } else if (yIntercept < 0) {
                    equation += (int)slope + "x" + " - " + Math.abs(yIntercept);
                } else {
                    equation += (int)slope + "x";
                }
            } else if (slope % 1 != 0 ) {
                if (yIntercept > 0) {
                    equation += "-"+ Math.abs(changeInY) + "/" + Math.abs(changeInX) + "x" + " + " + yIntercept;
                } else if (yIntercept < 0) {
                    equation += "-"+ Math.abs(changeInY) + "/" + Math.abs(changeInX) + "x" + " - " + Math.abs(yIntercept);
                } else {
                    equation += "-"+ Math.abs(changeInY) + "/" + Math.abs(changeInX) + "x";
                }
            }
        } else {
            equation += (yIntercept);
        }
        return equation;
    }

    // method that returns a coordinate with a given x value and the corresponding y value on the line, both values rounded to the nearest hundredth
    public String coordinateForX(double xValue) {
        double yValue = roundedToHundredth(slope() * xValue + yIntercept());
        String coordinate = "(" + xValue + ", " + yValue + ")";
        return coordinate;
    }


    // method that rounds a double input of parameter toRounded to the nearest hundredth
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }


    // method that returns the original points, equation in y = mx + b, slope, y-intercept, and distance regarding the points (x1, y1) and (x2, y2)
    public String lineInfo() {
        String str = "The Original points: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")\n";
        str += "The equation of the line between these points is: " + equation() + "\n";
        str += "The slope of this line is: " + slope() + "\n";
        str += "The y-intercept of the line is: " + yIntercept() + "\n";
        str += "The distance between the two points is: " + distance();
        return str;
    }
}



