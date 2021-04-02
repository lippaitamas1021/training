package ioreadstring.transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private List<BankAccount> accountList = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    public List<BankAccount> getAccountList() {
        return accountList;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void uploadListFromFile(String fileName) {
        String line;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(";");
                String name = temp[0];
                String account = temp[1];
                int balance = Integer.parseInt(temp[2]);
                accountList.add(new BankAccount(name, account, balance));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read the file", e);
        }
    }

    public void makeTransactions(String fileName) {
        String line;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(fileName))) {
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(";");
                String account = temp[0];
                int amount = Integer.parseInt(temp[1]);
                transactions.add(new Transaction(account, amount));
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read the file", e);
        }
        transfer();
    }

    private void transfer() {
        for (BankAccount b : accountList) {
            for (Transaction t : transactions) {
                if (t.getAccountNumber().equals(b.getAccountNumber())) {
                    b.setBalance(t.getAmount());
                }
            }
        }
    }
}
