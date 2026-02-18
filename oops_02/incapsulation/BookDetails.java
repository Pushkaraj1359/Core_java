/*Problem 2: 
Book
Create a class Book with:
private String title
private String author
private double price

Tasks:
Add getter and setter
Print book details */

package oops_02.incapsulation;
class Book{
    private String title;
    private String author;
    private double price;

    public void setTitle(String title){
        if(title != null && !title.trim().isEmpty()){
            this.title=title;
        }
        else{
            System.out.println("inValid title");
        }
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        if(author !=null && !author.trim().isEmpty()){
            this.author=author;
        }
        else{
            System.out.println("inValid author name : ");
        }
    }
    public String getAuthor(){
        return author;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price=price;
        }
        else{
            System.out.println("inValid Price");
        }
    }
    public double getPrice(){
        return price;
    }


}

public class BookDetails {
    public static void main(String[] args){
        Book b1=new Book();
        b1.setTitle("Ego");
        b1.setAuthor("Pushkaraj");
        b1.setPrice(33.33);

        System.out.println("book title : "+b1.getTitle());
        System.out.println("book author : "+b1.getAuthor());
        System.out.println("book price : "+b1.getPrice());
    }
}
