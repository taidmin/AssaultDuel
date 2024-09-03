module com.example.assaultduel {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assaultduel to javafx.fxml;//加包则加这两行代码
    exports com.example.assaultduel;
}