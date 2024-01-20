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
-mv
- cp
- ls
- mkdir
- ps
- whoami
- tree
- nano
     */

    public static String Ls() throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("ls");

        var process = processBuilder.start();
        
        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        finally
        {
            output = "No files";
        }
        return output;
        
    }

    public static String Tree() throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("tree");
        
        var process = processBuilder.start();
        
        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        finally
        {
            output = "No files";
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
        finally
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
        finally
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
        finally
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
        finally
        {
            output = "No files";
        }
        return output;
    }

    public static String whoami() throws IOException {

        var processBuilder = new ProcessBuilder();

        processBuilder.command("whoami");

        var process = processBuilder.start();

        String output = ""; 
           
        try (var reader = new BufferedReader(
                new InputStreamReader(process.getInputStream()))) {

            String line;

            
            while ((line = reader.readLine()) != null) {
                output += line + " ";
            }
        }
        finally
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
        finally
        {
            output = "No files";
        }
        return output;
    }

}
