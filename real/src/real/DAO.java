package real;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DAO {
    private Connection myConn;
    private Statement myStmt;
    private PreparedStatement preStmt = null;
    private ResultSet myRs = null;
    int rowsAff;
    public DAO(){
        try{
            myConn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            System.out.println("DB connection succesful");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean addFarmer(String name,String number,String address,double farm,String crop){
        try{
            System.out.println("ACCESED DAO");
            preStmt = myConn.prepareStatement("INSERT INTO farmers(name,Contact_Number,Address,Farm_Size,Crop_Details) VALUES(?,?,?,?,?)");
            preStmt.setString(1,name);
            preStmt.setString(2,number);
            preStmt.setString(3,address);
            preStmt.setDouble(4,farm);
            preStmt.setString(5,crop);
            
            rowsAff = preStmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    public boolean addPaddy(int farmerId,double quantity,Date dateofarrival,double moisture,String quality,String storage){
        try{
            System.out.println("ACCESED DAO");
            preStmt = myConn.prepareStatement("INSERT INTO paddy(FarmerID,Quantity,Date_of_Arrival,Moisture_Level,Quality_Parameters,Storage_Location) VALUES(?,?,?,?,?,?)");
            preStmt.setInt(1,farmerId);
            preStmt.setDouble(2,quantity);
            preStmt.setDate(3,dateofarrival);
            preStmt.setDouble(4,moisture);
            preStmt.setString(5,quality);
            preStmt.setString(6,storage);
            
            rowsAff = preStmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    public boolean addMilling(int paddyId,Date dateOfMilling,String millingOperator,String millingMachine,int duration,double brokenRiceParcentage,double bran,String quality){
        try{
            System.out.println("ACCESED DAO");
            preStmt = myConn.prepareStatement("INSERT INTO Milling(PaddyID, Date_of_Milling, Milling_Operator, Milling_Machine, Milling_Duration, Broken_Rice_Percentage, Bran_Percentage, Rice_Quality_Parameters) VALUES(?,?,?,?,?,?,?,?)");
            preStmt.setInt(1,paddyId);
            preStmt.setDate(2,dateOfMilling);
            preStmt.setString(3,millingOperator);
            preStmt.setString(4,millingMachine);
            preStmt.setInt(5,duration);
            preStmt.setDouble(6,brokenRiceParcentage);
            preStmt.setDouble(7,bran);
            preStmt.setString(8,quality);
            
            rowsAff = preStmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    public boolean addInventory(int paddyId,Double riceQuantity,Double brokenRiceQuantity,Double branQuantity,String storageLocation){
        try{
            System.out.println("ACCESED DAO");
            preStmt = myConn.prepareStatement("INSERT INTO Inventory(PaddyID,Rice_Quantity,Broken_Rice_Quantity,Bran_Quantity,Storage_Location) VALUES(?,?,?,?,?)");
            preStmt.setInt(1,paddyId);
            preStmt.setDouble(2,riceQuantity);
            preStmt.setDouble(3,brokenRiceQuantity);
            preStmt.setDouble(4,branQuantity);
            preStmt.setString(5,storageLocation);
            
            rowsAff = preStmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    public boolean addShop(int inventoryId,String name,String address,String contractNumber){
        try{
            System.out.println("ACCESED DAO");
            preStmt = myConn.prepareStatement("INSERT INTO Shop(InventoryID,Name,Address,Contract_Number) VALUES(?,?,?,?)");
            preStmt.setInt(1,inventoryId);
            preStmt.setString(2,name);
            preStmt.setString(3,address);
            preStmt.setString(4,contractNumber);
            
            rowsAff = preStmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    public boolean addSales(int ShopID,Double riceQuantity,Double brokenRiceQuantity,Double branQuantity,Date saleDate){
        try{
            System.out.println("ACCESED DAO");
            preStmt = myConn.prepareStatement("INSERT INTO Sales(ShopID,Rice_Quantity,Broken_Rice_Quantity,Bran_Quantity,Sale_Date) VALUES(?,?,?,?,?)");
            preStmt.setInt(1,ShopID);
            preStmt.setDouble(2,riceQuantity);
            preStmt.setDouble(3,brokenRiceQuantity);
            preStmt.setDouble(4,branQuantity);
            preStmt.setDate(5,saleDate);
            
            rowsAff = preStmt.executeUpdate();
            return true;
        }catch(Exception e){
            System.out.println(e);
        }
        return false;
    }
    public void getFarmer(DefaultTableModel model){
        try{
            preStmt = myConn.prepareStatement("SELECT * FROM farmers");
            myRs = preStmt.executeQuery();
            while(myRs.next()){
                model.addRow(new Object[] {myRs.getInt("FarmerID"),myRs.getString("Name"),myRs.getString("Contact_Number"),myRs.getString("Address"),myRs.getDouble("Farm_Size"),myRs.getString("Crop_Details")});
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void getPaddy(DefaultTableModel model){
        try{
            preStmt = myConn.prepareStatement("SELECT * FROM Paddy");
            myRs = preStmt.executeQuery();
            while(myRs.next()){
                model.addRow(new Object[] {myRs.getInt("PaddyID"),myRs.getInt("FarmerID"),myRs.getDouble("Quantity"),myRs.getDate("Date_of_Arrival"),myRs.getDouble("Moisture_Level"),myRs.getString("Quality_Parameters"),myRs.getString("Storage_Location")});
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void getMilling(DefaultTableModel model){
        try{
            preStmt = myConn.prepareStatement("SELECT * FROM Milling");
            myRs = preStmt.executeQuery();
            while(myRs.next()){
                model.addRow(new Object[] {myRs.getInt("MillingID"),myRs.getInt("PaddyID"),myRs.getDate("Date_of_Milling"),myRs.getString("Milling_Operator"),myRs.getString("Milling_Machine"),myRs.getInt("Milling_Duration"),myRs.getDouble("Broken_Rice_Percentage"),myRs.getDouble("Bran_Percentage"),myRs.getString("Rice_Quality_Parameters")});
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void getInventory(DefaultTableModel model){
        try{
            preStmt = myConn.prepareStatement("SELECT * FROM Inventory");
            myRs = preStmt.executeQuery();
            while(myRs.next()){
                model.addRow(new Object[] {myRs.getInt("InventoryID"),myRs.getInt("PaddyID"),myRs.getDouble("Rice_Quantity"),myRs.getDouble("Broken_Rice_Quantity"),myRs.getDouble("Bran_Quantity"),myRs.getString("Storage_Location")});
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void getShop(DefaultTableModel model){
        try{
            preStmt = myConn.prepareStatement("SELECT * FROM Shop");
            myRs = preStmt.executeQuery();
            while(myRs.next()){
                model.addRow(new Object[] {myRs.getInt("ShopID"),myRs.getInt("InventoryID"),myRs.getString("Name"),myRs.getString("Address"),myRs.getInt("Contract_Number")});
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void getSales(DefaultTableModel model){
        try{
            preStmt = myConn.prepareStatement("SELECT * FROM Sales");
            myRs = preStmt.executeQuery();
            while(myRs.next()){
                model.addRow(new Object[] {myRs.getInt("SaleID"),myRs.getInt("ShopID"),myRs.getDouble("Rice_Quantity"),myRs.getDouble("Broken_Rice_Quantity"),myRs.getDouble("Bran_Quantity"),myRs.getDate("Sale_Date")});
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}