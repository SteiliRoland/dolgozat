/*
 * File: App.java
 * Created Date: 2021-09-24 22:13:27
  * Author: Steili Roland
 * Original: Sallai Andras
 * Github: https://github.com/andteki
 * -----
 * Last Modified: 2021-10-16
 * Modified By: Steili Roland
 * -----
 * Copyright (c) 2021 Steili Roland
 * 
 * GNU GPL v2
 */

import controllers.MainController;
import views.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        MainWindow mainWindow = new MainWindow();
        new MainController(mainWindow);
        mainWindow.setVisible(true);
    }
}
