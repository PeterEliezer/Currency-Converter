USD ⇄ FRW Currency Converter (Java)

A simple Java application that converts United States Dollars (USD) to Rwandan Francs (FRW) and vice versa using a fixed exchange rate.

Exchange Rate Used:
1 USD = 1500 FRW

 Project Description:

This project demonstrates:

Java programming fundamentals

Conditional statements (if-else)

Event handling

GUI development using Swing

User input validation

The system allows users to:

Enter an amount

Select a currency (USD or FRW)

Click a convert button

Instantly see the converted result

 Technologies Used:

 java

 Java Swing (for GUI)

 Object-Oriented Programming Concepts

 Features:

✔ Convert USD → FRW
✔ Convert FRW → USD
✔ Simple and clean graphical interface
✔ Error handling for invalid input
✔ Fixed exchange rate logic

 Project Structure
CurrencyConverterUI.java
CurrencyConverter.java (console version)
README.md
 How to Run the Project:
 Using Command Line

Install Java (JDK 8 or higher)

Compile the file:

javac CurrencyConverterUI.java

Run the program:

java CurrencyConverterUI
 Using an IDE

You can use:

IntelliJ IDEA

VS Code (with Java extension)

NetBeans

Eclipse

Steps:

Create a new Java project

Add the CurrencyConverterUI.java file

Run the project

 Conversion Logic:
if (currency.equals("USD")) {
    result = amount * 1500;
} else {
    result = amount / 1500;
}
Future Improvements:

 Use live exchange rates API

 Improve UI styling

 Convert to JavaFX for modern UI

 Store conversion history

 add more currencies

 Author:

Peter Eliezer
Computer Science Student
Rwanda 🇷🇼

License:

This project is for educational purposes.


What level do you want — normal student README or professional portfolio README?

Is this conversation helpful so far?
