module com.example.midterm1 {
    requires javafx.controls;
    requires javafx.fxml;
        requires javafx.web;
            
            requires com.dlsc.formsfx;
            requires validatorfx;
            requires org.kordamp.ikonli.javafx;
            requires org.kordamp.bootstrapfx.core;
            requires eu.hansolo.tilesfx;
            requires com.almasb.fxgl.all;
    
    opens com.example.midterm1 to javafx.fxml;
    exports com.example.midterm1;
}