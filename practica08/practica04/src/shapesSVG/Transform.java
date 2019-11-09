package shapesSVG;
/**
/*Interfaz Transform que transforma un triangulo
/* @author chubak
**/
	@FunctionalInterface
	public interface Transformable(){
	    Shape transform(Vector2...posiciones);
	}
