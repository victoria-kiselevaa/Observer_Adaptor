module com.example.adaptor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.adaptor to javafx.fxml;
    exports com.example.adaptor;
}