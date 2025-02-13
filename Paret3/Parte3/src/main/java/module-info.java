module com.example.parte3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.logging;

    opens com.example.parte3 to javafx.fxml;
    exports com.example.parte3;
}