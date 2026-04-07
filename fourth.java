package com.mycompany.assignments;

import java.io.*;
import java.util.Scanner;

public class fourth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int c;
        String filename = "bank.txt";
        do {
            System.out.println("\nanking System");
            System.out.println("1. Create Account");
            System.out.println("2. Display Records");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            c= sc.nextInt();
            sc.nextLine();
            
            switch (c) {

                case 1:
                    try {
                        FileWriter fw = new FileWriter(filename, true);
                        System.out.print("Enter CID (1-20): ");
                        int cid = sc.nextInt();
                        sc.nextLine();
                        if (cid < 1 || cid > 20)
                            throw new Exception("CID in range 1-20");
                        
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Amount: ");
                        double amt = sc.nextDouble();

                        if (amt < 1000)
                            throw new Exception("Minimum balance is 1000");

                        fw.write(cid + " " + name + " " + amt + "\n");
                        fw.close();
                        System.out.println("Account Created!");

                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        FileReader fr = new FileReader(filename);
                        BufferedReader br = new BufferedReader(fr);
                        String line;
                        System.out.println("\nRecords:");
                        while ((line = br.readLine()) != null) {
                            System.out.println(line);
                        }
                        br.close();
                    } catch (IOException e) {
                        System.out.println("Error reading file");
                    }
                    break;

                case 3:
                    try {
                        System.out.print("Enter CID: ");
                        int cid = sc.nextInt();

                        System.out.print("Enter withdraw amount: ");
                        double w = sc.nextDouble();
                        if (w <= 0)
                            throw new Exception("Amount must be greater than 0");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (c != 4); 
        sc.close();
    }
}