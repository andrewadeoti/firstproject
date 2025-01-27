/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ntu-user
 */
public class ConsoleController{

    /**
     * Initializes the controller class.
     */
    ///////Console area playground/////////
    
   
    @FXML
    private TextField Source;
    
    @FXML
    private TextField Destination;
    
    @FXML
    private TextArea textOutput;
    
    ///////Console area playground/////////
    
    
    @FXML
    private Button returnToMainBtn;
    
    //console functions
    //each function useds the ConsoleInput file to run functions running console commands
     @FXML
    private Button nanoBtn;
    
    @FXML
    private Button consoleNanoBtn;
    
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
    
    
    @FXML
    private void nanoConsole(ActionEvent event) throws IOException, InterruptedException
    {
//        var console = new ConsoleInput();
//        String output = console.nano();
//        textOutput.setText("Output: "+output);
        String terminal = "terminator";
        String nanoCmd = "nano";
        var processBuilder = new ProcessBuilder(terminal, "-e", nanoCmd);
        processBuilder.start();
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
    
    
   
    //Returns view to main scene (secondary view)
    
    @FXML
    private void openMainBtnHandler(ActionEvent event) {
        Stage secondaryStage = new Stage();
        Stage primaryStage = (Stage) returnToMainBtn.getScene().getWindow();
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("secondary.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root, 640, 480);
            secondaryStage.setScene(scene);
            secondaryStage.setTitle("Console");
            secondaryStage.show();
            primaryStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
