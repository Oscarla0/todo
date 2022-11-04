package basicoDinamico;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

public class PruebaController {
	@FXML
    private ChoiceBox<String> choice1;
	@FXML
    private ComboBox<String> combo1;
	@FXML
    private ListView<?> list1;
	@FXML
    private void initialize() {
		choice1.getItems().addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
        		"Choice6", "Choice7", "Choice8", "Choice9");
		ArrayList<String> arrayList1 = new ArrayList<String>();
		 arrayList1.add("Item1");
		 arrayList1.add("Item2");
		 
		 
		 ObservableList<String>list = FXCollections.observableList(arrayList1);
		 list.addAll("Choice1", "Choice2", "Choice3", "Choice4", "Choice5", 
	        		"Choice6", "Choice7", "Choice8", "Choice9");
		 choice1.setItems(list);
		 
		 combo1.getItems().addAll("Combo1", "Combo2", "Combo3", "Combo4", "Combo5", "Combo6",
	        		"Combo7", "Combo8", "Combo9");
		 
    }
}
