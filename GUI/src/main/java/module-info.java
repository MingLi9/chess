module GUI {
    requires javafx.controls;
    requires javafx.fxml;

    opens Controller;
    exports Controller;
}