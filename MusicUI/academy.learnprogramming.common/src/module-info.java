module academy.learnprogramming.common {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires java.sql;

    exports academy.learnprogramming.ui to javafx.graphics, javafx.fxml;

    opens academy.learnprogramming.ui to javafx.fxml;
    opens academy.learnprogramming.common to javafx.base;
}