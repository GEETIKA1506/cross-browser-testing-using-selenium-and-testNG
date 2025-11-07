# cross-browser-testing-using-selenium-and-testNG
# 🧠 Parallel Browser Automation using Selenium and TestNG

## 📌 Project Overview
This project demonstrates **Parallel Testing using Selenium WebDriver and TestNG**.  
It launches **three different browsers (Chrome, Brave, and Edge)** simultaneously, navigates to **Amazon**, searches for a laptop, and opens a specific product page — all running **in parallel threads**.

This automation helps in **cross-browser testing** by validating the same functionality across multiple browsers at the same time.

---

## 🚀 Features
- Parallel execution of multiple browsers  
- Automated navigation to [Amazon.in](https://www.amazon.in)  
- Laptop search automation  
- Product selection and delay for validation  
- Smooth browser closing after execution  
- Uses parameterization via **TestNG @Parameters**  
- Avoids hardcoding — configurable through `testng.xml`

---

## 🧩 Technologies Used
| Component | Purpose |
|------------|----------|
| **Java** | Core programming language for automation |
| **Selenium WebDriver** | Automates browser actions (open site, search, click, etc.) |
| **TestNG** | Provides annotations (`@Test`, `@Parameters`) and supports parallel testing |
| **WebDriverManager** | Manages browser drivers automatically |
| **ChromeOptions / EdgeOptions** | Used to configure custom browser settings (e.g., Brave browser binary) |

---

## 🧠 Architecture
ParallelTestingProject/
│
├── src/
│ └── test/
│ └── java/
│ └── parallelTesting/
│ ├── ChromeTest.java
│ ├── EdgeTest.java
│ └── BraveTest.java
│
├── testng.xml
└── README.md

---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites
- Install **Java JDK (17 or above)**
- Install **Eclipse or IntelliJ IDEA**
- Install **Maven**
- Install latest versions of:
  - Chrome
  - Microsoft Edge
  - Brave Browser

---

### 2️⃣ Install Required Libraries
Make sure your `pom.xml` has these dependencies:
```xml

###AUTHOR

Geetika Srivastava
Software Engineering Student
Project: Web Automation and Parallel Browser Testing using Selenium and TestNG
