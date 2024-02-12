package com.example.team4server.Opening;

import com.example.team4server.HelloApplication;
//import com.example.team4server.combobox.LanguageChooserComboBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Objects;

import static jdk.jpackage.main.Main.I18N;

//import static com.sun.javafx.css.StyleClassSet.getStyleClass;


public class FirstUseScreen extends VBox {

    public void start(Stage primaryStage) throws Exception {
        Image appIcon = new Image(Objects.requireNonNull(HelloApplication.class.getResourceAsStream("C:\\Users\\Froze\\IdeaProjects\\team4\\team-4 server\\src\\main\\resources\\com\\stream_pi\\server\\icons\\image.png")));
        ImageView appIconImageView = new ImageView(appIcon);
        VBox.setMargin(appIconImageView, new Insets(10, 0, 10, 0));
        appIconImageView.setFitHeight(128);
        appIconImageView.setFitWidth(128);


        Label welcomeLabel = new Label(I18N.getString("window.firsttimeuse.WelcomePane.welcome"));
        welcomeLabel.setWrapText(true);
        welcomeLabel.setAlignment(Pos.CENTER);
        welcomeLabel.getStyleClass().add("first_time_use_welcome_pane_welcome_label");

        //LanguageChooserComboBox languageChooserComboBox = new LanguageChooserComboBox();
        //languageChooserComboBox.getStyleClass().add("first_time_use_welcome_pane_language_chooser_combo_box");

        //languageChooserComboBox.getSelectionModel().select(I18N.getLanguage(Config.getInstance().getCurrentLanguageLocale()));


      //  getChildren().addAll(appIconImageView, welcomeLabel);

       // setVisible(false);

    }
}
