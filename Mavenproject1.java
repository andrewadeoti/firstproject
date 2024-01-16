/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ntu-user
 */
public class Mavenproject1 {
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

    public static void main(String[] args) throws IOException {
        //Ls();
        //Tree();
        //Mv("a","b");
        Mv("a","b");
        
    }
    
    public static void Ls() throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("ls");
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}
public static void Tree() throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("tree");
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}

public static void Mv(String source, String destination) throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("mv", source ,destination  );
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}

public static void cp() throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("cp");
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}
public static void mkdir() throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("mkdir");
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}

public static void ps(String source, String destination) throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("ps", source ,destination  );
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}

 public static void whoami() throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("whoami");
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}
public static void nano() throws IOException{
                
        var processBuilder = new ProcessBuilder();

        processBuilder.command("nano");
        

        var process = processBuilder.start();

        try (var reader = new BufferedReader(
            new InputStreamReader(process.getInputStream()))) {

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
    }}}

}