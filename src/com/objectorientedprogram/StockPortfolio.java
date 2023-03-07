package com.objectorientedprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio extends Stock {
    static ArrayList<Stock> arrayList = new ArrayList<>();


    public static void main(String[] args) {

        StockPortfolio stockPortfolio = new StockPortfolio();

        Stock stock = new Stock();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stock");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter Company" + i + "name");
            stock.setCompanyName(sc.next());
            System.out.println("Enter Stock price");
            stock.setPrice(sc.nextInt());
            System.out.println("Enter number of share");
            stock.setNumberOfShares(sc.nextInt());
            arrayList.add(stock);
            stockPortfolio.valueOfEachStock();
            stockPortfolio.valueOfTotalStock();
            stockPortfolio.printStockPortfolio();

        }
        System.out.println("Total value of stock " + totalValue);
        System.out.println();
        System.out.println("enter the value you want to withdraw");
        withdrawBalance = sc.nextInt();
        debitBalance();


        System.out.println("Total value of stock after debit " + totalValue);
    }

    public static void valueOfEachStock() {

        value = numberOfShares * price;
    }

    public static void valueOfTotalStock() {

        totalValue += value;
    }

    public static void debitBalance() {
        if (withdrawBalance > totalValue) {
            System.out.println("―Debit amount exceeded account balance.");
        } else {
            totalValue = totalValue - withdrawBalance;

        }

    }
    public static void printStockPortfolio() {
        System.out.println("Report for stock");
        System.out.println("Name =" + companyName);
        System.out.println("Stock price =" + price);
        System.out.println("Number of share =" + numberOfShares);
        System.out.println("value of stock =" + value);
        System.out.println();
    }
}
