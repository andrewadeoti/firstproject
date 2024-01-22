/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.javafxapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ntu-user
 */
public class ConsoleInput {

    /*
- makeFile
- mv
- cp
- ls
- mkdir
- ps
- whoami
- tree
- nano
     */
    public static String MakeFile(String source) throws IOException
    {
               
        String output = "File Exists";
        String newLine = System.getProperty("line.separator");
        
        String temp = Ls();
        String[] fileList = temp.split(newLine, -1);
        
        boolean create = true;
        for (String i : fileList) {
            if(i==source)
            {
                create = false;
                break;
            }
        }
        if(create==true)
        {
            try {
                var processBuilder = new ProcessBuilder();

                processBuilder.command("touch", source);

                var process = processBuilder.start();
                output="File "+source+" created";
            } catch (Exception e) {
                output="File "+source+" could not be created";
            }
        }
        return output;
    }

    public static String Ls() throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("ls");

        var process = processBuilder.start();
        
        String output = "No files";
        String newLine = System.getProperty("line.separator");

        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;
            output = "";
            while ((line = reader.readLine()) != null) {
                output=line+newLine+output;
            }
        }
        
        return output;
        
    }

    public static String Tree() throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("tree");
        
        var process = processBuilder.start();
        
        String output = "No files";
        String newLine = System.getProperty("line.separator");

        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;
            output = "";
            while ((line = reader.readLine()) != null) {
                output=line+newLine+output;
            }
        }
        
        return output;
    }

    public static String Mv(String source, String destination) throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("mv", source, destination);
        
        var process = processBuilder.start();

        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        catch(Exception e)
        {
            output = "No files";
        }
        return output;
    }

    public static String cp(String source, String destination) throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("cp", source, destination);
        
        var process = processBuilder.start();

        String output = ""; 
           
        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        catch(Exception e)
        {
            output = "No files";
        }
        return output;
    }

    public static String mkdir(String directory) throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("mkdir",directory);
        
        var process = processBuilder.start();

        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        catch(Exception e)
        {
            output = "No files";
        }
        return output;
    }

    public static String ps(String source, String destination) throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("ps", source, destination);

        var process = processBuilder.start();

        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        catch(Exception e)
        {
            output = "No files";
        }
        return output;
    }

    public static String whoami(String source) throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("whoami",source);

        var process = processBuilder.start();

        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        catch(Exception e)
        {
            output = "No files";
        }
        return output;
    }

    public static String nano() throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("nano");

        var process = processBuilder.start();

        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        catch(Exception e)
        {
            output = "No files";
        }
        return output;
    }

}
