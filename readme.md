# 🎮 Java Tic Tac Toe (OOP Lab Project)

A simple **2-player Tic Tac Toe** desktop game built with **Java Swing (AWT + JFrame)** during my **Object-Oriented Programming Lab (December 2022)** using **Eclipse IDE**.

---

## 🧩 Overview

This project demonstrates the fundamentals of **Object-Oriented Programming (OOP)** through a Java GUI-based game. Although developed as a single-class application, it follows OOP principles like **encapsulation** and **event-driven programming**, making it an ideal beginner-level OOP practice project.

---

## 🔧 Key Features

* Classic **3×3 Tic Tac Toe** gameplay
* **Two-player** turn-based logic (X vs O)
* Real-time **score counter** for both players
* **Reset** and **Exit** button controls
* Built with **Java Swing** for GUI components
* Fully runnable from Eclipse or as a standalone `.jar`

---

## 🧪 OOP Concepts Used

| Concept            | Usage | Description                                          |
| ------------------ | ----- | ---------------------------------------------------- |
| **Class & Object** | ✅     | Entire game encapsulated within `ProjecTicToe` class |
| **Encapsulation**  | ✅     | All attributes are private and accessed internally   |
| **Abstraction**    | ⚠️    | GUI & logic combined; partially abstracted           |
| **Inheritance**    | ❌     | Not implemented (single-class design)                |
| **Polymorphism**   | ❌     | Not implemented; possible extension in future        |

> This project is *object-oriented in structure*, focusing on encapsulation and modular logic but not a fully modular multi-class OOP system. For educational purposes, it effectively demonstrates GUI programming and OOP fundamentals.

---

## 💻 Tech Stack

* **Language:** Java SE 18
* **Framework:** Java Swing / AWT
* **IDE:** Eclipse IDE for Java Developers
* **Platform:** Windows Desktop

---

## 🗂️ Folder Structure

```
Game01/
├── src/
│   └── ProjecTicToe.java
├── bin/
│   └── ProjecTicToe.class
├── .classpath
└── .project
```

---

## ▶️ How to Run

### Option 1: From Eclipse

1. Open **Eclipse IDE**
2. Go to `File → Import → Existing Projects into Workspace`
3. Select the `Game01` folder
4. Run `ProjecTicToe.java` as **Java Application**

### Option 2: From Command Line

1. Compile and run:

   ```bash
   javac src/ProjecTicToe.java -d bin
   java -cp bin ProjecTicToe
   ```

### Option 3: Runnable JAR (Optional)

* Export via **File → Export → Runnable JAR file** in Eclipse

---

## 👤 Author

**Shahriar Hossain**
🎓 DIU CSE | L2T1 (OOP Lab 2022)
🌐 [shahriarbd.com](https://shahriarbd.com)
💻 [GitHub](https://github.com/shahriarbd10)

---

## 🌐 GitHub Repository Description

> Simple 2-player Tic Tac Toe game built using Java Swing (AWT + JFrame) during my Object-Oriented Programming Lab in December 2022. Demonstrates encapsulation and event-driven GUI logic in Eclipse IDE.
