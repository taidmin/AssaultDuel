module com.example.assaultduel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assaultduel to javafx.fxml;//加包则加这两行代码
    opens com.example.assaultduel.controller to javafx.fxml;
    exports com.example.assaultduel;
    exports com.example.assaultduel.controller;
}