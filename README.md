# 🎬 Ticket Management Application

A simple **Command Line Interface (CLI)**-based Java application for managing movie theater tickets. This project demonstrates fundamental Java Object-Oriented Programming concepts through a practical ticket management system.

## 📋 Table of Contents

- [Features](#-features)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Usage](#-usage)
- [Classes Overview](#-classes-overview)
- [Example Output](#-example-output)
- [Future Enhancements](#-future-enhancements)
- [Contributing](#-contributing)
- [License](#-license)
- [Author](#-author)

## ✨ Features

- ✅ **Movie Management**: Create and manage movie objects with details
- ✅ **Theater Management**: Create and manage theater entities
- ✅ **Console Interface**: Simple CLI for user interaction
- ✅ **OOP Implementation**: Demonstrates Java fundamentals including:
  - Classes and Objects
  - Encapsulation
  - Basic flow control
  - Method implementation

## 📁 Project Structure

```
ticket_management_application_CLI_based/
│
├── 📄 Main.java           # Entry point and CLI handler
├── 📄 Movie.java          # Movie entity class
├── 📄 Theater.java        # Theater entity class
├── 📄 README.md           # Project documentation
└── 📁 docs/               # Additional documentation (optional)
```

## 🚀 Getting Started

### Prerequisites

Before running this application, ensure you have:

- ☑️ **Java Development Kit (JDK) 8 or higher**
- ☑️ **Command Line Interface** (Terminal/Command Prompt)
- ☑️ **IDE** (Optional: Eclipse, IntelliJ IDEA, VS Code)

### Installation & Setup

#### Method 1: Command Line

```bash
# 1. Clone the repository
git clone https://github.com/karimullashaikdev/ticket_management_application_CLI_based.git

# 2. Navigate to project directory
cd ticket_management_application_CLI_based

# 3. Compile all Java files
javac *.java

# 4. Run the application
java Main
```

#### Method 2: IDE Setup

1. **Import Project**: Open your IDE and import the project folder
2. **Locate Main.java**: Find the main class file
3. **Run Application**: Right-click on `Main.java` → Run

## 🎯 Usage

1. **Start the Application**
   ```bash
   java Main
   ```

2. **Follow Interactive Prompts**
   - Add new movies to the system
   - Create theater entries
   - View current data
   - Navigate through menu options

3. **Example Workflow**
   ```
   Welcome to Ticket Management System
   ===================================
   1. Add Movie
   2. Add Theater
   3. View Movies
   4. View Theaters
   5. Exit
   
   Enter your choice: 1
   ```

> **⚠️ Note**: Data is stored in memory only. All information will be lost when the program exits.

## 🏗️ Classes Overview

| Class | Responsibility | Key Methods |
|-------|---------------|-------------|
| **Main** | Application entry point and CLI management | `main()`, user interaction methods |
| **Movie** | Movie data representation | Getters, setters, movie-related operations |
| **Theater** | Theater data representation | Getters, setters, theater-related operations |

### Class Details

#### 🎭 Movie.java
```java
// Represents movie entities with attributes like:
- Title
- Duration  
- Genre
- Rating (optional)
```

#### 🏛️ Theater.java
```java
// Represents theater entities with attributes like:
- Theater name
- Capacity
- Location
- Available shows
```

## 📊 Example Output

```
=== Ticket Management System ===
Current Movies: 2
Current Theaters: 1

Movies Available:
1. "Avengers: Endgame" - Action (180 min)
2. "The Lion King" - Animation (118 min)

Theaters:
1. "Cineplex Downtown" - Capacity: 200
```

## 🔮 Future Enhancements

### Phase 1: Core Features
- [ ] **Ticket Booking System**: Implement seat selection and reservation
- [ ] **Cancellation Feature**: Allow users to cancel bookings
- [ ] **Show Scheduling**: Add movie showtimes

### Phase 2: Data & Persistence
- [ ] **File Storage**: Save data to files (JSON/CSV)
- [ ] **Database Integration**: MySQL/PostgreSQL support
- [ ] **Data Validation**: Input verification and error handling

### Phase 3: Advanced Features
- [ ] **Pricing System**: Dynamic pricing based on seats/shows
- [ ] **User Authentication**: Login/registration system
- [ ] **Reports**: Generate booking and revenue reports

### Phase 4: Interface Upgrades
- [ ] **GUI Version**: JavaFX or Swing implementation
- [ ] **Web Interface**: Spring Boot web application
- [ ] **Mobile App**: Android/iOS companion

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/AmazingFeature`)
3. **Commit** your changes (`git commit -m 'Add some AmazingFeature'`)
4. **Push** to the branch (`git push origin feature/AmazingFeature`)
5. **Open** a Pull Request

### Guidelines
- Follow Java naming conventions
- Add comments for complex logic
- Test your changes before submitting
- Update documentation as needed

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**Karimulla Shaik**
- 🐙 GitHub: [@karimullashaikdev](https://github.com/karimullashaikdev)
- 📧 Email: [Contact](shaikkarimulladev@gmail.com)
- 💼 LinkedIn: [Shaik Karimulla](www.linkedin.com/in/karimulla-shaik-140798183)

---

### 🌟 Show Your Support

If you found this project helpful, please consider:
- ⭐ **Starring** the repository
- 🍴 **Forking** for your own modifications  
- 🐛 **Reporting** any issues you find
- 💡 **Suggesting** new features

---

**Happy Coding! 🚀**
