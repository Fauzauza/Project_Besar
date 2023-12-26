module com.example.program {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.program to javafx.fxml;
    exports com.example.program;
}