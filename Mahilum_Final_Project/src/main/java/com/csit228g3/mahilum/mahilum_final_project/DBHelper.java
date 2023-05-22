/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csit228g3.mahilum.mahilum_final_project;

import com.csit228g3.mahilum.mahilum_final_project.MySQLConnection.Query;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author karin
 */
public class DBHelper {
    public Query query;
    
    public DBHelper(){
        try {
            query = new MySQLConnection.Query();
        } catch (SQLException ex) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addItem(String category, String item, String supplier, String customer) throws SQLException {
        String values = String.format("NULL, '%s', '%s', '%s', '%s'", category, item, supplier, customer);
        query.update("INSERT INTO tblitem (id, category, item, supplier, customer) values (" + values + ")");
    }
    
    public ResultSet getItems() throws SQLException{
        return query.execute("SELECT * FROM tblitem");
    }
    
     public ResultSet getItemsByCategory(String category) throws SQLException{
        return query.execute("SELECT * FROM tblitem WHERE category = '" + category + "'");
    }
    public ResultSet getItemsBySupplier(String supplier) throws SQLException{
        return query.execute("SELECT * FROM tblitem WHERE supplier = '" + supplier + "'");
    }
  
    public ResultSet getItemsByCustomer(String customer) throws SQLException{
        return query.execute("SELECT * FROM tblitem WHERE customer = '" + customer + "'");
    }
        
    public ResultSet getItemsById(int id) throws SQLException{
        return query.execute("SELECT * FROM tblitem WHERE id = " + id);
    }
        
    public ResultSet getItemsByItems(String item) throws SQLException{
        return query.execute("SELECT * FROM tblitem WHERE item = '" + item+ "'");
    }
    
     public void editItemsByItems(String category, String item, String supplier, String customer) throws SQLException {
            String sql = "UPDATE tblitem SET category = '" + category + "', customer = '" + customer + "', supplier = '" + supplier + "' WHERE item = " + item;
            query.update(sql);
        
        }
     
     public void deleteItemsByItems(String category) throws SQLException{
            query.update("DELETE FROM tblitem WHERE category= " + category);
        }

    
    
    
    
  
    
    
 
    
    public void deleteProduct(int id) throws SQLException{
        query.update("DELETE FROM tblaccount WHERE id = " + id);
    }
    
    public ResultSet getUsersById(int id) throws SQLException{
        return query.execute("SELECT * FROM tblaccount WHERE id = " + id);
    }
    
    public ResultSet getUsersByFirstName(String firstname) throws SQLException{
        return query.execute("SELECT * FROM tblaccount WHERE firstname = '" + firstname + "'");
    }
    public ResultSet getUsersByLastName(String lastname) throws SQLException{
        return query.execute("SELECT * FROM tblaccount WHERE lastname = '" + lastname + "'");
    }
    public ResultSet getUsersByUsername(String username) throws SQLException{
        return query.execute("SELECT * FROM tblaccount WHERE username = '" + username + "'");
    }
    
    
    
    public void close() throws SQLException{
        query.close();
    }

    public void deleteItemsByItems(int id) throws SQLException {
        query.update("DELETE FROM tblitem WHERE id = " + id); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void connectdb() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void disconnected() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}

