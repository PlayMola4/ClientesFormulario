module com.example.clientesformulario {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clientesformulario to javafx.fxml;
    exports com.example.clientesformulario;
}