import db.SqlRunner;

public class Department {
    private int id;
    private String title;

    public Department(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void save() {
        String sql = String.format("INSERT INTO department (Title, id) Values ('%s',  %d );", this.title,id );
        this.id = SqlRunner.executeUpdate(sql);
       SqlRunner.closeConnection();
    }
    public void update() {
        String sql = String.format("UPDATE department SET name = '%s' WHERE id =  %d;",this.title, this.id);
        SqlRunner.executeUpdate(sql);
    }

    public static void deleteALL(){
        String sql = "DELETE FROM department;";
        SqlRunner.executeUpdate(sql);
    }
    }
