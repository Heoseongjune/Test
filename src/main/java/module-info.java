module kroryi.test {
    requires javafx.controls;
    requires javafx.fxml;


    opens kroryi.test to javafx.fxml;
    exports kroryi.test;
}