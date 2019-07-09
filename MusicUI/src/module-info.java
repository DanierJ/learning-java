module MusicUI {
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.controls;
    requires java.sql;

    opens sample;
    opens sample.model;
}