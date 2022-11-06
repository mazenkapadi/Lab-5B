module com.mycompany.lab5b {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens com.mycompany.lab5b to javafx.fxml;
    exports com.mycompany.lab5b;
}
