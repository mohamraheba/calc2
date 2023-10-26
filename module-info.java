module com.example.myfirstfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.myfirstfx to javafx.fxml;
    exports com.example.myfirstfx;
}