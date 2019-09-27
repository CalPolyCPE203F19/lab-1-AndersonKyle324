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
        double newY = y;
        if (y < 0){
            newY = -y;
        }
        return Math.atan(newY / x);
    }

    public Point rotate90(){
        return new Point(y * -1, x);
    }
}