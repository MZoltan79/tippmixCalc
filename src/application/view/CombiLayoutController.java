package application.view;

import java.util.ArrayList;
import java.util.Arrays;

import application.Odds;
import application.model.Ticket;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CombiLayoutController {
	
	@FXML
	Button addOddsButton;
	@FXML
	Button countButton;
	@FXML
	TextField oddsField;
	@FXML
	TextField betField;
	@FXML
	ComboBox<String> combinations;
	@FXML
	Label prizeLabel;
	@FXML
	Label odds1Label;
	@FXML
	Label odds2Label;
	@FXML
	Label odds3Label;
	@FXML
	Label odds4Label;
	@FXML
	Label odds5Label;
	@FXML
	Label odds6Label;
	@FXML
	Label odds7Label;
	@FXML
	Label odds8Label;
	@FXML
	Label odds9Label;
	@FXML
	Label odds10Label;
	@FXML
	Label odds11Label;
	@FXML
	Label odds12Label;
	@FXML
	Label odds13Label;
	@FXML
	Label odds14Label;
	@FXML
	Label odds15Label;
	@FXML
	Label odds16Label;
	@FXML
	Label odds17Label;
	@FXML
	Label odds18Label;
	@FXML
	Label odds19Label;
	@FXML
	Label odds20Label;
	@FXML
	Label odds1IndicatorLabel;
	@FXML
	Label odds2IndicatorLabel;
	@FXML
	Label odds3IndicatorLabel;
	@FXML
	Label odds4IndicatorLabel;
	@FXML
	Label odds5IndicatorLabel;
	@FXML
	Label odds6IndicatorLabel;
	@FXML
	Label odds7IndicatorLabel;
	@FXML
	Label odds8IndicatorLabel;
	@FXML
	Label odds9IndicatorLabel;
	@FXML
	Label odds10IndicatorLabel;
	@FXML
	Label odds11IndicatorLabel;
	@FXML
	Label odds12IndicatorLabel;
	@FXML
	Label odds13IndicatorLabel;
	@FXML
	Label odds14IndicatorLabel;
	@FXML
	Label odds15IndicatorLabel;
	@FXML
	Label odds16IndicatorLabel;
	@FXML
	Label odds17IndicatorLabel;
	@FXML
	Label odds18IndicatorLabel;
	@FXML
	Label odds19IndicatorLabel;
	@FXML
	Label odds20IndicatorLabel;
	
	private Label[] oddsLabels;
	private Label[] oddsIndicatorLabels;
	private ArrayList<Odds> odds;
	private Ticket ticket;
	private ArrayList<String[]> combinationTypes;
	
	private String[] one = 		{};
	private String[] two = 		{};
	private String[] three = 	{"2/3"};
	private String[] four = 	{"2/4","3/4"};
	private String[] five = 	{"2/5","3/5","4/5"};
	private String[] six = 		{"2/6","3/6","4/6","5/6"};
	private String[] seven = 	{"2/7","3/7","4/7","5/7","6/7"};
	private String[] eight = 	{"2/8","3/8","4/8","5/8","6/8","7/8"};
	private String[] nine = 	{"2/9","3/9","4/9","5/9","6/9","7/9","8/9"};
	private String[] ten = 		{"2/10","3/10","4/10","5/10","6/10","7/10","8/10","9/10"};
	private String[] eleven = 	{"2/11","3/11","4/11","5/11","6/11","7/11","8/11","9/11","10/11"};
	private String[] twelve = 	{"2/12","3/12","4/12","5/12","6/12","7/12","8/12","9/12","10/12","11/12"};
	private String[] thirteen = {"2/13","3/13","4/13","5/13","6/13","7/13","8/13","9/13","10/13","11/13","12/13"};
	private String[] fourteen = {"2/14","3/14","4/14","5/14","6/14","7/14","8/14","9/14","10/14","11/14","12/14",
								"13/14"};
	private String[] fifteen = 	{"2/15","3/15","4/15","5/15","6/15","7/15","8/15","9/15","10/15","11/15","12/15"
								,"13/15","14/15"};
	private String[] sixteen = 	{"2/16","3/16","4/16","5/16","6/16","7/16","8/16","9/16","10/16","11/16","12/16",
								"13/16","14/16","15/16"};
	private String[] seventeen = {"2/17","3/17","4/17","5/17","6/17","7/17","8/17","9/17","10/17","11/17","12/17",
								"13/17","14/17","15/17","16/17"};
	private String[] eighteen = {"2/18","3/18","4/18","5/18","6/18","7/18","8/18","9/18","10/18","11/18","12/18",
								"13/18","14/18","15/18","16/18","17/18"};
	private String[] nineteen = {"2/19","3/19","4/19","5/19","6/19","7/19","12/19","13/19","14/19",
								"15/19","16/19","17/19","18/19"};
	private String[] twenty = 	{"2/20","3/20","4/20","5/20","6/20","14/20","15/20","16/20","17/20",
								"18/20","19/20"};
	@FXML
	private void initialize() {
		odds = new ArrayList<>();
		combinationTypes  = new ArrayList<>();
		combinationTypes.add(one);
		combinationTypes.add(two);
		combinationTypes.add(three);
		combinationTypes.add(four);
		combinationTypes.add(five);
		combinationTypes.add(six);
		combinationTypes.add(seven);
		combinationTypes.add(eight);
		combinationTypes.add(nine);
		combinationTypes.add(ten);
		combinationTypes.add(eleven);
		combinationTypes.add(twelve);
		combinationTypes.add(thirteen);
		combinationTypes.add(fourteen);
		combinationTypes.add(fifteen);
		combinationTypes.add(sixteen);
		combinationTypes.add(seventeen);
		combinationTypes.add(eighteen);
		combinationTypes.add(nineteen);
		combinationTypes.add(twenty);
		oddsLabels = new Label[20];
		oddsIndicatorLabels = new Label[20];
		oddsLabels[0] = odds1Label;
		oddsLabels[1] = odds2Label;
		oddsLabels[4] = odds5Label;
		oddsLabels[2] = odds3Label;
		oddsLabels[3] = odds4Label;
		oddsLabels[5] = odds6Label;
		oddsLabels[6] = odds7Label;
		oddsLabels[7] = odds8Label;
		oddsLabels[8] = odds9Label;
		oddsLabels[9] = odds10Label;
		oddsLabels[10] = odds11Label;
		oddsLabels[11] = odds12Label;
		oddsLabels[12] = odds13Label;
		oddsLabels[13] = odds14Label;
		oddsLabels[14] = odds15Label;
		oddsLabels[15] = odds16Label;
		oddsLabels[16] = odds17Label;
		oddsLabels[17] = odds18Label;
		oddsLabels[18] = odds19Label;
		oddsLabels[19] = odds20Label;
		oddsIndicatorLabels[0] = odds1IndicatorLabel;
		oddsIndicatorLabels[1] = odds2IndicatorLabel;
		oddsIndicatorLabels[2] = odds3IndicatorLabel;
		oddsIndicatorLabels[3] = odds4IndicatorLabel;
		oddsIndicatorLabels[4] = odds5IndicatorLabel;
		oddsIndicatorLabels[5] = odds6IndicatorLabel;
		oddsIndicatorLabels[6] = odds7IndicatorLabel;
		oddsIndicatorLabels[7] = odds8IndicatorLabel;
		oddsIndicatorLabels[8] = odds9IndicatorLabel;
		oddsIndicatorLabels[9] = odds10IndicatorLabel;
		oddsIndicatorLabels[10] = odds11IndicatorLabel;
		oddsIndicatorLabels[11] = odds12IndicatorLabel;
		oddsIndicatorLabels[12] = odds13IndicatorLabel;
		oddsIndicatorLabels[13] = odds14IndicatorLabel;
		oddsIndicatorLabels[14] = odds15IndicatorLabel;
		oddsIndicatorLabels[15] = odds16IndicatorLabel;
		oddsIndicatorLabels[16] = odds17IndicatorLabel;
		oddsIndicatorLabels[17] = odds18IndicatorLabel;
		oddsIndicatorLabels[18] = odds19IndicatorLabel;
		oddsIndicatorLabels[19] = odds20IndicatorLabel;
		ticket = new Ticket();
	}
	
	
	private boolean isNumberInputValid(String num) {
		if(num != null && (num.matches("-?[0-9]+\\.?[0-9]*"))) return true;
		if(num != null && (num.matches("-?[0-9]+,?[0-9]*"))) return true;
		return false;
	}
	
	private String decimalConverter(String num) {
		if(num.contains(",")) num = num.replace(',', '.');
		return num;
	}
	
	@FXML
	private void handleAddOddsButton() {
		
		if(oddsField.getText() != null) {
			if(isNumberInputValid(oddsField.getText())) {
				double temp = Double.parseDouble(decimalConverter(oddsField.getText()));
				odds.add(new Odds(temp));
				oddsIndicatorLabels[odds.size()-1].setVisible(true);
				oddsLabels[odds.size()-1].setVisible(true);
				oddsLabels[odds.size()-1].setText(oddsField.getText());
			}
		}
		combinations.getItems().clear();
		int numberOfOddses = odds.size();
		System.out.println(Arrays.asList(combinationTypes.get(numberOfOddses-1)));
		combinations.getItems().addAll(Arrays.asList(combinationTypes.get(numberOfOddses-1)));
		
	}
	
	@FXML
	private void handleCountButton() {
		ticket.addAllOdds(odds);
		double bet = Double.parseDouble(betField.getText());
		ticket.setBet(bet);
		String type = combinations.getValue().split("/")[0];
		System.out.println(type);
		Integer result = ticket.calculate(Integer.parseInt(type));
		if(result == null) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Hiba!");
			alert.setHeaderText("Túl magas a tét!");
			alert.setContentText("Próbáld meg alacsonyabb téttel!");
			
			alert.showAndWait();
		} else {
			prizeLabel.setVisible(true);
			prizeLabel.setText(result.toString());
		}
	}
}
