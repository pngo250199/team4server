package com.example.team4server;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
//import com.example.team4server.Main;
import com.example.team4server.combobox.LanguageChooserComboBox;
import com.stream_pi.server.controller.ServerListener;
//import com.example.team4server.i18n.I18N;
//import com.example.team4server.config.Config;
//import com.example.team4server.ExceptionAndAlertHandler;
//import com.example.team4server.util.exception.SevereException;
import java.util.Objects;

//import static com.sun.javafx.css.StyleClassSet.getStyleClass;


public class FIrstUseScreen  {


    public WelcomePane(ExceptionAndAlertHandler exceptionAndAlertHandler, ServerListener serverListener)
    {
        getStyleClass().add("first_time_use_welcome_pane");

        Image appIcon = new Image(Objects.requireNonNull(Main.class.getResourceAsStream("icons/image.png")));
        ImageView appIconImageView = new ImageView(appIcon);
        VBox.setMargin(appIconImageView, new Insets(10, 0, 10, 0));
        appIconImageView.setFitHeight(128);
        appIconImageView.setFitWidth(128);


        Label welcomeLabel = new Label(I18N.getString("window.firsttimeuse.WelcomePane.welcome"));
        welcomeLabel.setWrapText(true);
        welcomeLabel.setAlignment(Pos.CENTER);
        welcomeLabel.getStyleClass().add("first_time_use_welcome_pane_welcome_label");

        com.stream_pi.server.combobox.LanguageChooserComboBox languageChooserComboBox = new LanguageChooserComboBox();
        languageChooserComboBox.getStyleClass().add("first_time_use_welcome_pane_language_chooser_combo_box");

        languageChooserComboBox.getSelectionModel().select(I18N.getLanguage(Config.getInstance().getCurrentLanguageLocale()));


    /*    languageChooserComboBox.valueProperty().addListener((observableValue, oldVal, newVal) ->
        {
            try
            {
                if(oldVal!=newVal && newVal!=null)
                {
                    Config.getInstance().setCurrentLanguageLocale(newVal.getLocale());
                    Config.getInstance().save();
                    serverListener.restart();
                }
            }
            catch (SevereException e)
            {
                exceptionAndAlertHandler.handleSevereException(e);
            }
       }); */


        getChildren().addAll(appIconImageView, welcomeLabel, languageChooserComboBox);

        setVisible(false);
    }
}
