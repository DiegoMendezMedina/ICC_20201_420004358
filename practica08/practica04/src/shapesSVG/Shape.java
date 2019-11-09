package shapesSVG;
public abstract class Shape implements Comparable<Shape>{
    //implements Comparable<Shape>
    protected Vector2 punto;
    protected double mag1;
    protected double mag2;
    protected double perimetro;
    protected double area;
    public Shape(Vector2 p,double u,double d){
	this.punto=p;
	this.mag1=u;
	this.mag2=d;
	if(mag2==2*mag1){
	    this.area= Math.pow(this.mag1,2)*Math.PI;
	    this.perimetro=2*this.mag2*Math.PI;
	}
	else{
	    this.area=this.mag1*this.mag2;
	    this.perimetro= 2*this.mag1+2*this.mag2;
	}
    }
    public Shape(Vector2 u){
	this.punto=u;
    }
    @Override
    public abstract int compareTo(Shape s);
    public abstract String toSVG();
    public abstract String toString();
    @Override
    public abstract boolean equals(Object obj);
}
