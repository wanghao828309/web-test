package mysqlTest;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class TitleDAO {
    public List readFirstTitle(){
        List<Title> list =new ArrayList<Title>();
        Connection con=null;
        PreparedStatement psmt=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        try {
            con=DriverManager.getConnection("jdbc:mysql://wangMysql/mysql","root","123456");
            String sql="SELECT * from wang_test";
            psmt=con.prepareStatement(sql);
            rs=psmt.executeQuery();
            
            while(rs.next())
            {
                int id=rs.getInt("id");
                String name=rs.getString("name");
                Title tl=new Title(id, name);
                list.add(tl);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally
        {
            try {
                if(rs!=null)
                {
                    rs.close();
                }
                if(psmt!=null)
                {
                    psmt.close();
                }
                if(con!=null)
                {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    
}