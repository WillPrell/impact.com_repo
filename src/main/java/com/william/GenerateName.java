package com.william;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name="printCompanyName", mixinStandardHelpOptions = true, version="1.0")
public class GenerateName implements Runnable {

    public static void main(String[] args) {
        int exit = new CommandLine(new GenerateName()).execute(args);
        System.exit(exit);
    }
    @Override
    public void run() {
        System.out.println("impact.com");
    }

}