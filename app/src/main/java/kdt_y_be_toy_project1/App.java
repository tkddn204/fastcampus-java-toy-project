/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kdt_y_be_toy_project1;

import java.util.Scanner;
import kdt_y_be_toy_project1.view.AppConsole;

public class App {
    public static void main(String[] args) {
        AppConsole appConsole = new AppConsole();
        run(appConsole);
    }

    private static void run(AppConsole appConsole) {
        Scanner sc = new Scanner(System.in);

        while (!appConsole.isShutdown()) {
            System.out.print(appConsole.flush());
            appConsole.processInput(sc.nextLine());
        }
    }

}