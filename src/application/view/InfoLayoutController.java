package application.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class InfoLayoutController {
	
	
	@FXML
	private TextArea infoArea;
	
	@FXML
	public void initialize() {
		infoArea.setEditable(false);
		infoArea.setText("Szia, üdv az alkalmazásban!");
	}
	

}
