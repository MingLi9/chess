package Controller;

//import LogicInterface.Gameable;
//import ClientFactory.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    //private Gameable game;

    private ArrayList<ImageView> imageViewsList;
    public ImageView lbl00;
    public ImageView lbl01;
    public ImageView lbl02;
    public ImageView lbl03;
    public ImageView lbl04;
    public ImageView lbl05;
    public ImageView lbl06;
    public ImageView lbl07;

    public ImageView lbl10;
    public ImageView lbl11;
    public ImageView lbl12;
    public ImageView lbl13;
    public ImageView lbl14;
    public ImageView lbl15;
    public ImageView lbl16;
    public ImageView lbl17;

    public ImageView lbl20;
    public ImageView lbl21;
    public ImageView lbl22;
    public ImageView lbl23;
    public ImageView lbl24;
    public ImageView lbl25;
    public ImageView lbl26;
    public ImageView lbl27;

    public ImageView lbl30;
    public ImageView lbl31;
    public ImageView lbl32;
    public ImageView lbl33;
    public ImageView lbl34;
    public ImageView lbl35;
    public ImageView lbl36;
    public ImageView lbl37;

    public ImageView lbl40;
    public ImageView lbl41;
    public ImageView lbl42;
    public ImageView lbl43;
    public ImageView lbl44;
    public ImageView lbl45;
    public ImageView lbl46;
    public ImageView lbl47;

    public ImageView lbl50;
    public ImageView lbl51;
    public ImageView lbl52;
    public ImageView lbl53;
    public ImageView lbl54;
    public ImageView lbl55;
    public ImageView lbl56;
    public ImageView lbl57;

    public ImageView lbl60;
    public ImageView lbl61;
    public ImageView lbl62;
    public ImageView lbl63;
    public ImageView lbl64;
    public ImageView lbl65;
    public ImageView lbl66;
    public ImageView lbl67;

    public ImageView lbl70;
    public ImageView lbl71;
    public ImageView lbl72;
    public ImageView lbl73;
    public ImageView lbl74;
    public ImageView lbl75;
    public ImageView lbl76;
    public ImageView lbl77;

    public TextField txbUsername;
    public TextField txbPassword;
    public TextField txbTo;
    public TextField txbFrom;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setImageViewsList();
        //game = new ClientFactory().GetGameable();
    }

    public void login(ActionEvent actionEvent) {
        //Todo: login part
        //while this is not functioning correctly it wil automatically connect with the server
        //game.JoinLobby();
    }

    public void register(ActionEvent actionEvent) {
    }

    private void setImageViewsList(){
        imageViewsList = new ArrayList<>(List.of(
                lbl00, lbl01, lbl02, lbl03, lbl04, lbl05, lbl06, lbl07,
                lbl10, lbl11, lbl12, lbl23, lbl14, lbl15, lbl16, lbl17,
                lbl20, lbl21, lbl22, lbl33, lbl24, lbl25, lbl26, lbl27,
                lbl30, lbl31, lbl32, lbl33, lbl34, lbl35, lbl36, lbl37,
                lbl40, lbl41, lbl42, lbl43, lbl44, lbl45, lbl46, lbl47,
                lbl50, lbl51, lbl52, lbl53, lbl54, lbl55, lbl56, lbl57,
                lbl60, lbl61, lbl62, lbl63, lbl64, lbl65, lbl66, lbl67,
                lbl70, lbl71, lbl72, lbl73, lbl74, lbl75, lbl76, lbl77));
    }

    public void Move(ActionEvent actionEvent) {
        if(txbFrom.getText().length() == 3 && txbTo.getText().length() == 3){
            //game.MovePiece(txbFrom.getText(), txbTo.getText());
        }
    }
}