# 🎮 Java Tic Tac Toe (OOP Lab Project)

A simple **2-player Tic Tac Toe** desktop game built with **Java Swing (AWT + JFrame)** during my **Object-Oriented Programming Lab (December 2022)** using **Eclipse IDE**.

---

## 🧩 Overview

This project demonstrates the fundamentals of **Object-Oriented Programming (OOP)** through a Java GUI-based game. Although developed as a single-class application, it follows OOP principles like **encapsulation** and **event-driven programming**, making it an ideal beginner-level OOP practice project.

---

## 🧱 Features

* Classic **3×3 Tic Tac Toe** board
* **Two-player** (X vs O) gameplay
* Real-time **score tracking**
* **Reset** and **Exit** buttons
* Built with **Java Swing** for GUI components
* Exported runnable `.jar` version: **`ProjectTicGameToeFinal.jar`**

---

## 🧠 OOP Concepts Used

| Concept            | Usage | Description                                       |
| ------------------ | ----- | ------------------------------------------------- |
| **Class & Object** | ✅     | Entire game encapsulated in `ProjecTicToe` class  |
| **Encapsulation**  | ✅     | All attributes are private and managed internally |
| **Abstraction**    | ⚠️    | GUI and logic combined, but clearly structured    |
| **Inheritance**    | ❌     | Not applied (single-class design)                 |
| **Polymorphism**   | ❌     | Not implemented, possible for future expansion    |

> This project uses OOP structure with encapsulation and modular event-driven logic, suitable for academic and learning purposes.

---

## ⚙️ Tech Stack

* **Language:** Java SE 18
* **Framework:** Swing / AWT
* **IDE:** Eclipse IDE for Java Developers
* **Platform:** Desktop (Windows)

---

## 📂 Project Structure

```
Game01/
├── src/
│   └── ProjecTicToe.java
├── bin/
│   └── ProjecTicToe.class
├── .classpath
├── .project
├── LICENSE
├── ProjectTicGameToeFinal.jar
└── readme.md
```

---

## ▶️ How to Run

### Option 1 — Run via Eclipse

1. Open **Eclipse IDE**
2. `File → Import → Existing Projects into Workspace`
3. Select the `Game01` folder
4. Run `ProjecTicToe.java` as **Java Application**

### Option 2 — Run the JAR Directly

1. Double-click `ProjectTicGameToeFinal.jar`
2. Or run via command line:

   ```bash
   java -jar ProjectTicGameToeFinal.jar
   ```

### Option 3 — Compile Manually

```bash
javac src/ProjecTicToe.java -d bin
java -cp bin ProjecTicToe
```

---

## 📜 License

This project is licensed under the **MIT License** — see the [LICENSE](./LICENSE) file for details.

---

## 🧑‍💻 Author

**Shahriar Hossain**
🎓 DIU CSE | L2T1 (OOP Lab 2022)
🌐 [shahriarbd.com](https://shahriarbd.com)
💻 [GitHub](https://github.com/shahriarbd10)

---

## 🏷 GitHub Repository Description

> 🎮 Simple 2-player Tic Tac Toe game built in **Java Swing (AWT + JFrame)** using **Eclipse IDE** as part of an **Object-Oriented Programming Lab Project (Dec 2022)**. Demonstrates **Encapsulation** and **Event-driven GUI Design** principles. Includes a runnable **.jar** file.
