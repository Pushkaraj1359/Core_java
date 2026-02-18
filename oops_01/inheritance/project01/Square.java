package opps.inheritance.project01;

public class Square extends Rectangle {

    public Square(){}

    public Square(double side){
        width=side;
        length=side;
    }

    public Square(double side,String color, boolean filled){
        width=side;
        length=side;
        this.color=color;
        this.filled=filled;
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side){
        width=side;
        width=side;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width=width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double lenght){
        this.length=length;
    }



    public String toString(){
        // return "width = "+width+", length = "+length+", color= "+color+" ,filled ="+filled;
        return "square["+super.toString()+"]";
    }
}
