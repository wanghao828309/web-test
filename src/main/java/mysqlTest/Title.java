package mysqlTest;



public class Title {
         /**
����������*�������ĸ�����Ϊ���ݿ���е��ĸ�����
����������*/
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