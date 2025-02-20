module com.example.repaso {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.repaso to javafx.fxml;
    exports com.example.repaso;
    exports com.example.repaso.controller;
    opens com.example.repaso.controller to javafx.fxml;
}