module com.example.events {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.events to javafx.fxml;
    exports com.example.events;
}