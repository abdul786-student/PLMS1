module com.plms.plms1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.plms.modules to javafx.fxml;
    exports com.plms.modules;
}