# Tourism Management System

## Project Overview

The **Tourism Management System** is designed to simplify and automate the management of travel details, including hotel bookings, package bookings, and tourism place information. This system is built with the goal of reducing manual workload, offering an easy-to-use interface for tourists to manage their trips, and providing up-to-date information for travel agencies. The system is primarily administered by an administrator who has exclusive access to the backend database, ensuring that all information is accurate and up-to-date.

---

## Key Features

- **User Registration**: Tourists can register by providing personal details to create their accounts.
- **Hotel Booking**: Tourists can browse available hotels, select one, and proceed with booking.
- **Package Booking**: Tourists can view available travel packages and book the desired one.
- **Cancellation**: Users can easily cancel their bookings with a simple interface.
- **User Management**: Administrators can manage tourist accounts, including updating or deleting user information.
- **Payment**: Secure payment integration for booking confirmations.
- **Booking Confirmation**: Automated notifications are sent to users upon successful booking or cancellation.

---

## Architecture

### Layered Architecture (2-tier)

1. **Presentation Layer (Java Swing UI)**: 
   - This layer handles all the user interactions and GUI rendering. Classes like `UpdateCustomer`, `ViewCustomer`, `ViewPackage`, and `ViewBookedHotel` manage the display of information and user inputs.
   
2. **Data Access Layer (via JDBC)**: 
   - The system interacts directly with the database using JDBC. It performs SQL queries to retrieve and update data without a separate business logic layer, combining both data access and UI logic.

---

## Design Principles

### Single Responsibility Principle (SRP)

- The system partially follows SRP. Each form (e.g., `UpdateCustomer` and `ViewCustomer`) is responsible for a specific task (such as updating or viewing data).
- However, there is some violation of SRP as database and UI logic are combined within the same classes.

---

## Design Patterns

### 1. **Prototype of MVC** 
   - Although not fully implemented, the system follows a basic **MVC**-like structure:
     - **View**: Classes like `ViewCustomer`, `UpdateCustomer` serve as the view, handling GUI components.
     - **Controller + Model**: The system doesn’t fully separate controller and model, as both database interaction and business logic are integrated directly into the view classes.

### 2. **Builder Pattern (via Swing Layouts)**
   - The UI is built in a **builder-style** approach, where Swing components are added incrementally using commands like:
     ```java
     JLabel label = new JLabel("Username");
     label.setBounds(30, 50, 100, 30);
     add(label);
     ```
   - While this mimics the Builder Pattern, it is not the formal implementation but rather a simple incremental approach to constructing the user interface.

---

## Installation

1. Clone the repository:
   ```bash
   git clone <repo_url>
   cd TourismManagementSystem
## Guide :
Dr. Bhargavi Mokashi

## Authors :
1) Nandakumar T - PES1UG22CS375

2) P. Ashish - PES1UG22CS404

3) Prajwal N. P - PES1UG22CS423

4) Pavan T. R - PES1UG22CS411
