#! /bin/bash
cd src/main/java
javac -cp ".:core.jar" gui/ChessGUI.java
java -cp ".:core.jar" gui/ChessGUI
