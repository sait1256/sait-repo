package test;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tr.edu.istiklal.HesapMakinesi;


public class Main extends Application {

    @Override
    public void start(Stage stage) {

        TextField txtSayi1 = new TextField();
        txtSayi1.setPromptText("1. Sayı");

        TextField txtSayi2 = new TextField();
        txtSayi2.setPromptText("2. Sayı");

        TextField txtSonuc = new TextField();
        txtSonuc.setEditable(false);

        Button btnTopla = new Button("Topla");
        Button btnCikar = new Button("Çıkar");
        Button btnCarp = new Button("Çarp");
        Button btnBol = new Button("Böl");

        btnTopla.setOnAction(e -> {
            HesapMakinesi h = new HesapMakinesi(
                    Double.parseDouble(txtSayi1.getText()),
                    Double.parseDouble(txtSayi2.getText())
            );
            txtSonuc.setText(String.valueOf(h.getTopla()));
        });

        btnCikar.setOnAction(e -> {
            HesapMakinesi h = new HesapMakinesi(
                    Double.parseDouble(txtSayi1.getText()),
                    Double.parseDouble(txtSayi2.getText())
            );
            txtSonuc.setText(String.valueOf(h.getCikar()));
        });

        btnCarp.setOnAction(e -> {
            HesapMakinesi h = new HesapMakinesi(
                    Double.parseDouble(txtSayi1.getText()),
                    Double.parseDouble(txtSayi2.getText())
            );
            txtSonuc.setText(String.valueOf(h.getCarp()));
        });

        btnBol.setOnAction(e -> {
            HesapMakinesi h = new HesapMakinesi(
                    Double.parseDouble(txtSayi1.getText()),
                    Double.parseDouble(txtSayi2.getText())
            );
            txtSonuc.setText(String.valueOf(h.getBol()));
        });

        VBox kutu = new VBox(10);
        kutu.getChildren().addAll(
                txtSayi1, txtSayi2,
                btnTopla, btnCikar, btnCarp, btnBol,
                txtSonuc
        );

        Scene scene = new Scene(kutu, 250, 350);
        stage.setTitle("JavaFX Hesap Makinesi");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
