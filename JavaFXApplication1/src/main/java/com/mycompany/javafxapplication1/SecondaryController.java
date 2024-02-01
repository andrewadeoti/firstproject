package com.mycompany.javafxapplication1;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;



public class SecondaryController {
    
    ///////Console area playground/////////
    
   
    @FXML
    private TextField Source;
    
    @FXML
    private TextField Destination;
    
    @FXML
    private TextArea textOutput;
    
    ///////Console area playground/////////
    
    
    @FXML
    private TextField userTextField;
    
    @FXML
    private TableView dataTableView;

    @FXML
    private Button secondaryButton;
    
    @FXML
    private Button refreshBtn;
    
    @FXML
    private TextField customTextField;
    
    @FXML
    private void RefreshBtnHandler(ActionEvent event){
        Stage primaryStage = (Stage) customTextField.getScene().getWindow();
        customTextField.setText((String)primaryStage.getUserData());
    }
        
    @FXML
    private void switchToPrimary(){
        Stage secondaryStage = new Stage();
        Stage primaryStage = (Stage) secondaryButton.getScene().getWindow();
        try {
            
        
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("primary.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 640, 480);
            secondaryStage.setScene(scene);
            secondaryStage.setTitle("Login");
            secondaryStage.show();
            primaryStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //console functions
    
    @FXML
    private void lsConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.ls("");
        textOutput.setText("Output: "+output);
        Source.setText("");
        Destination.setText("");
    }
    
    @FXML
    private void treeConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.tree();
        textOutput.setText("Output: "+output);
        Source.setText("");
        Destination.setText("");
    }
    
    
    //system function
    @FXML
    private void whoAmIConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.whoami();
        textOutput.setText("Output: "+output);
    }
    
    @FXML
    private void psConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.ps();
        textOutput.setText("Output: "+output);
    }
    
    
    
    //file funcitons

    
    
    
    @FXML
    private void createFileConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.makeFile(Source.getText());  
        textOutput.setText("Output: "+output);
        Destination.setText("");
    }
    
    @FXML
    private void deleteFileConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.deleteFile(Source.getText());
        textOutput.setText("Output: "+output);
        Destination.setText("");
    }
    
    @FXML
    private void retriveFileConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.retriveFile(Source.getText());
        textOutput.setText(output);
        Destination.setText("");
    }
    
    @FXML
    private void updateFileConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.updateFile(Source.getText(),textOutput.getText());
        textOutput.setText(output);
        Destination.setText("");
    }
    
    
    @FXML
    private void moveFileConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.mv(Source.getText(),Destination.getText());
        textOutput.setText("Output: "+output);
    }
    
    @FXML
    private void copyFileConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.cp(Source.getText(),Destination.getText());
        textOutput.setText("Output: "+output);
    }
    
    @FXML
    private void makeFolderConsole(ActionEvent event) throws IOException, InterruptedException
    {
        var console = new ConsoleInput();
        String output = console.mkdir(Source.getText());  
        textOutput.setText("Output: "+output);
        Destination.setText("");
    }
    
    

    public void initialise(String[] credentials) {
        userTextField.setText(credentials[0]);
        DB myObj = new DB();
        ObservableList<User> data;
        try {
            data = myObj.getDataFromTable();
            TableColumn user = new TableColumn("User");
        user.setCellValueFactory(
        new PropertyValueFactory<>("user"));

        TableColumn pass = new TableColumn("Pass");
        pass.setCellValueFactory(
            new PropertyValueFactory<>("pass"));
        dataTableView.setItems(data);
        dataTableView.getColumns().addAll(user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SecondaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
