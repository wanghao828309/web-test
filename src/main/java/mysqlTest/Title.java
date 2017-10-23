package mysqlTest;



public class Title {
         /**
　　　　　*下面这四个属性为数据库表中的四个属性
　　　　　*/
    private int id;   
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Title(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    
}