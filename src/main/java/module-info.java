module metroid.vania {

    requires javafx.controls;
    requires javafx.fxml;
    requires slf4j.api;
    requires commons.lang;
    exports org.pauseit.games;
    opens org.pauseit.games to javafx.graphics,javafx.fxml;
}