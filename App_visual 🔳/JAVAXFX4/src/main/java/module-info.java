module com.example.javaxfx4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.javaxfx4 to javafx.fxml;
    exports com.example.javaxfx4;
}