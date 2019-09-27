class Point
{
    private double x;
    private double y;
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){ return x; }
    public double getY(){ return y; }

    public double getRadius(){
        return Math.sqrt(x*x + y*y);
    }

    public double getAngle(){
        // double angle = Math.atan(y / x);
        // if (90.0 < angle < 180.0){

        // }
        return Math.atan(y / x) * Math.PI / 180;
    }

    public Point rotate90(){
        return Point(y * -1, x);
    }
}