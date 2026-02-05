package class_objects;
class Id{
    String name;
    int id ;
    String batch;

    public Id(){
        name = "pushkaraj";
        id = 50;
        batch = "JAP";
    }

    public void setDetails(String name, int id, String batch){
        this.name=name;
        this.id=id;
        this.batch=batch;
    }
    String getname(){
        return name;
    }
    
    int getId(){
        return id;
    }
    
    String getBatch(){
        return batch;
    }
    
    void setId(int id){
        this.id=id;
    }
    
    void setName(){
        this.name=name;
    }
    
    void setBatch(){
        this.batch=batch();
    }

    void showDetails(){
        System.out.println(" name : "+name);
        System.out.println(" id : "+id);
        System.out.println(" batch : "+batch);
    }
}

public class F_demo {
    public static void main(String[] args) {
        Id r=new Id();
        r.setDetails("pushu",01,"jap86");
        r.showDetails();
        System.out.println(r.getBatch());
    }
}
