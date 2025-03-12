# taxi-booking-system



# 🚖 Taxi Booking System

## 📌 Overview
The **Taxi Booking System** is a web-based application developed using **Spring Boot 3.2.5, Java 17, and Jakarta API**. This system allows users to book taxis, manage bookings, and view services. It also includes an admin panel for managing users, bookings, and vehicles. The application uses **MySQL** as its database, **Thymeleaf** for the frontend, and runs on an **Apache Tomcat Server**. **Lombok** is integrated to reduce boilerplate code.

## 🛠️ Technologies Used
- **Backend**: Spring Boot 3.2.5, Java 17, Hibernate, Jakarta API
- **Frontend**: Thymeleaf, HTML, CSS, JavaScript
- **Database**: MySQL
- **Server**: Apache Tomcat
- **IDE**: Spring Tool Suite (STS)
- **Build Tool**: Maven
- **Other**: Lombok

## 🚀 Features
### 1️⃣ Admin Panel
- Admin can manage **users, bookings, and cars**.
- **Controllers**:
  - `AdminController.java` → Handles admin-related operations.
- **Views**:
  - Thymeleaf templates for admin operations: `src/main/resources/templates/admin/`.

### 2️⃣ Admin Authentication (Login/Logout)
- Admin can **register, log in, and log out** securely.
- **Views**:
  - Login/Logout: `src/main/resources/templates/admin/`.

### 3️⃣ File Uploading
- Admin can **upload files** related to their profile or booking details.
- **Controllers**:
  - `FileUploadController.java` → Handles file uploads.
- **Views**:
  - File Upload: `src/main/resources/templates/`.

### 4️⃣ Contact Form
- Users can **reach out to the admin** via a contact form.
- **Controllers**:
  - `ContactController.java` → Manages form submissions.
- **Views**:
  - Contact Page: `src/main/resources/templates/contact.html`.

### 5️⃣ Car Booking
- Users can **select cars and book rides**.
- **Controllers**:
  - `BookingController.java` → Handles booking operations.
- **Views**:
  - Booking Page: `src/main/resources/templates/booking.html`.

### 6️⃣ About Page
- Displays information about the **taxi booking service**.
- **Controllers**:
  - `AboutController.java` → Manages the about page.
- **Views**:
  - About Page: `src/main/resources/templates/about.html`.

### 7️⃣ Services Page
- Lists all **taxi services** provided.
- **Controllers**:
  - `ServicesController.java` → Handles service-related requests.
- **Views**:
  - Services Page: `src/main/resources/templates/services.html`.

## 📂 Project Structure
```
taxi-booking-system/
│── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── controllers/       # Controllers for handling requests
│   │   │   ├── models/            # Java Beans (POJOs)
│   │   │   ├── services/          # Business logic
│   │   │   ├── repositories/      # Database interactions (JPA repositories)
│   │   ├── resources/
│   │   │   ├── templates/         # Thymeleaf templates (HTML views)
│   │   │   ├── static/            # CSS, JS, Images
│   │   │   ├── application.properties # Database config
│── database.sql                     # Database schema
│── README.md                         # Project documentation
│── pom.xml                            # Maven dependencies
```

## ⚙️ Installation & Setup
### Prerequisites
1. **JDK 17** installed
2. **MySQL Workbench** installed
3. **Spring Tool Suite (STS) IDE** installed
4. **Lombok configured** in your IDE

### Steps to Run
1. **Clone the repository**:
   ```sh
   git clone https://github.com/YOUR_USERNAME/taxi-booking-system.git
   cd taxi-booking-system
   ```
2. **Set up the database**:
   - Create a **MySQL database** and import `database.sql`.
   - Update database credentials in `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/taxi_booking_db
     spring.datasource.username=root
     spring.datasource.password=your_password
     ```
3. **Run the Spring Boot application**:
   ```sh
   mvn spring-boot:run
   ```
4. **Access the application**:
   - Open `http://localhost:8080` in a web browser.

## 🎯 Project Documentation
[📄 Taxi Booking System Documentation]( https://docs.google.com/document/d/e/2PACX-1vS3Us_KJs_nyNqz-yf9tJkTUmxIGW5Y9PaoUQ-sP6sdCqDxAwniYElgKT3qi4-gPCvaVCESfqhPpAWZ/pub)

## 🌐 Live Demo (If Deployed)
[🔗 Live Taxi Booking System]

## 💡 Contributing
If you'd like to contribute:
1. **Fork the repository**
2. **Create a new branch** (`git checkout -b feature-branch`)
3. **Make changes & commit** (`git commit -m "Added new feature"`)
4. **Push changes** (`git push origin feature-branch`)
5. **Submit a Pull Request (PR)**



---


