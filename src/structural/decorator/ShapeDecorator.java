package structural.decorator;

public abstract class ShapeDecorator implements Shape {
    //shape object instance
    //can be inherit to sub class - protected
    protected Shape decoratorShape;

    //constructor
    public ShapeDecorator(Shape decoratorShape){
        //initiate shape object
        this.decoratorShape=decoratorShape;
    }
    //override method
    public void draw(){
        decoratorShape.draw();
    }
}