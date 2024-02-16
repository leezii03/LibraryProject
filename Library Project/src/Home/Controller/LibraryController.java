package Home.Controller;

import Component.AlertMessage;
import Database.DBConnector;
import Home.Model.LibraryModel;
import java.sql.*;
import java.util.*;

public class LibraryController extends DBConnector {

    PreparedStatement ps;
    ResultSet rs;

    public Collection<LibraryModel> getData() {
        List<LibraryModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `table_guess`";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                LibraryModel LM = new LibraryModel(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("gender"),
                        rs.getString("bookname"),
                        rs.getString("contact"),
                        rs.getString("loandate"),
                        rs.getString("duedate"),
                        rs.getString("image")
                );
                list.add(LM);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void addGuessToDB(LibraryModel LM){
        try {
            String sql = "INSERT INTO `table_guess`(`name`, `gender`, `bookname`, `contact`, `loandate`, `duedate`, `image`) VALUES (?,?,?,?,?,?,?)";
            ps = connector().prepareStatement(sql);
            ps.setString(1, LM.getName());
            ps.setString(2, LM.getGender());
            ps.setString(3, LM.getBookname());
            ps.setString(4, LM.getContact());
            ps.setString(5, LM.getLoandate());
            ps.setString(6, LM.getDuedate());
            ps.setString(7, LM.getImage());
            
            int i = ps.executeUpdate();
            if(i > 0){
                System.out.println("Guess Data Add To Database Successfully");
            }else{
                AlertMessage.Error("Guess Can't Add To Database");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void updateGuessToDB(LibraryModel LM){
        try {
            String sql = "UPDATE `table_guess` SET `name`=?,`gender`=?,`bookname`=?,`contact`=?,`loandate`=?,`duedate`=?,`image`=? WHERE id = ?";
            ps = connector().prepareStatement(sql);
            ps.setString(1, LM.getName());
            ps.setString(2, LM.getGender());
            ps.setString(3, LM.getBookname());
            ps.setString(4, LM.getContact());
            ps.setString(5, LM.getLoandate());
            ps.setString(6, LM.getDuedate());
            ps.setString(7, LM.getImage());
            ps.setInt(8, LM.getId());
            
            int i = ps.executeUpdate();
            if(i > 0){
                AlertMessage.Success("Update Successfully");
            }else{
                AlertMessage.Error("Update Error");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteGuess(int id){
        try {
            String sql = "DELETE FROM `table_guess` WHERE `id` = ?";
            ps = connector().prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if(i > 0){
                AlertMessage.Success("Delete Successfully");
            }else{
                AlertMessage.Error("Delete Fail");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public int getTotalEmp(){
        int count = 0 ;
        try {
            String sql = "SELECT `id` FROM `table_guess`";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                count ++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public int getTotalMale(){
        int count = 0 ;
        try {
            String sql = "SELECT `id` FROM `table_guess` WHERE `gender` = \"Male\"";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                count ++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    
    public int getTotalFemale(){
        int count = 0 ;
        try {
            String sql = "SELECT `id` FROM `table_guess` WHERE `gender` = \"Female\"";
            ps = connector().prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                count ++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
}
