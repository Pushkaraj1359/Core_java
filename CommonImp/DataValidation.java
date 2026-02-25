package CommonImp;

public class DataValidation {
    
    public static void main(String[] args) {
    
        int num = 10;
        int age = 25;
        int marks = 85;
        double salary = 20000;
        String name = "Pushkaraj";
        String email = "pushkaraj@gmail.com";
        String password = "Abc@123";
        String username = "Push123";
        String phone = "9876543210";
        String fileName = "photo.jpg";
        int year = 2024;
        boolean isActive = true;
    
        // ===== NUMBER VALIDATIONS =====
        if(num > 0) {}
        if(num < 0) {}
        if(num == 0) {}
        if(num != 0) {}
        if(num % 2 == 0) {}
        if(num % 2 != 0) {}
        if(num % 5 == 0) {}
        if(age >= 18 && age <= 60) {}
        if(marks >= 0 && marks <= 100) {}
        if(salary >= 0) {}
    
        // ===== STRING VALIDATIONS =====
        if(name != null) {}
        if(!name.isEmpty()) {}
        if(name != null && !name.trim().isEmpty()) {}
        if(name.length() >= 3) {}
        if(name.length() <= 20) {}
        if(username.matches("[a-zA-Z0-9]+")) {}
        if(name.matches("[a-zA-Z]+")) {}
        if(phone.matches("[0-9]+")) {}
        if(phone.startsWith("9")) {}
        if(fileName.endsWith(".jpg")) {}
    
        // ===== EMAIL VALIDATION =====
        if(email != null && email.contains("@") && email.contains(".")) {}
        if(email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {}
    
        // ===== PASSWORD VALIDATIONS =====
        if(password.length() >= 6) {}
        if(password.matches(".*\\d.*")) {}
        if(password.matches(".*[A-Z].*")) {}
        if(password.matches(".*[a-z].*")) {}
        if(password.matches(".*[@#$%^&+=!].*")) {}
    
        // ===== BOOLEAN VALIDATION =====
        if(isActive) {}
        if(!isActive) {}
    
        // ===== DATE / YEAR VALIDATION =====
        if(year >= 1900 && year <= 2026) {}
        if(year % 4 == 0) {}
    
    }
}




