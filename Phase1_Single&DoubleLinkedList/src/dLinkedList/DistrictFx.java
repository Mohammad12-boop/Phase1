package dLinkedList;


import dLinkedList.DLinkedList;

import dLinkedList.DNode;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class DistrictFx { //Class Fx for the Second screen(District_Screen).

	private BorderPane pane;
	private DLinkedList<DistrictRecord> districts;
///
	public DistrictFx() {

		Text text;
		Label lblInsert, lblUpdate, lblDelete, lblTotalNo, lblLoadLocation;
		TextField tfInsert, tfDelete, tfUpdate,  tfTotalNo, tfLoadLocation;
		Button btInsert, btDelete,btUpdate,  btTotalNo;
		TextArea Result;

		districts=new DLinkedList<>();

		LocationFx locationS=new LocationFx();
		Scene scene3=new Scene(locationS.getPane(),1100,600);

//-------------------------------------------------------------------
	//This pane in the top of borderPane.

		StackPane pane1=new StackPane();
		pane1.setPadding(new Insets(11, 12, 13, 14));
		text=new Text("District Screen");
		text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 40));
		pane1.getChildren().add(text);

//--------------------------------------------------------------------
	//This pane in the left of borderPane.

		GridPane gp1=new GridPane();
		gp1.setPadding(new Insets(11, 12, 13, 14));
		gp1.setHgap(10);
		gp1.setVgap(10);

		tfInsert=new TextField();
		btInsert=new Button("Insert");
		lblInsert=new Label("Insert a new district:");
		lblInsert.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp1.add(lblInsert, 0, 0);
		gp1.add(tfInsert, 0, 1);
		gp1.add(btInsert, 1, 1);

		tfDelete=new TextField();
		btDelete=new Button("Delete");
		lblDelete=new Label("Delete a district:");
		lblDelete.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp1.add(lblDelete, 0, 2);
		gp1.add(tfDelete, 0, 3);
		gp1.add(btDelete, 1, 3);

		GridPane gp1_2=new GridPane();
		gp1_2.setPadding(new Insets(11, 12, 13, 14));
		gp1_2.setAlignment(Pos.CENTER);
		gp1_2.setHgap(10);
		gp1_2.setVgap(10);
		gp1_2.setVisible(false);
		Label lblnewName=new Label();
		lblnewName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfnewName=new TextField();
		Button btnewName=new Button("Update");
		gp1_2.add(lblnewName, 0, 0);
		gp1_2.add(tfnewName, 0, 2);
		gp1_2.add(btnewName, 1, 2);



		tfUpdate=new TextField();
		btUpdate=new Button("Update");
		lblUpdate=new Label("Update a district:");
		lblUpdate.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp1.add(lblUpdate, 0, 4);
		gp1.add(tfUpdate, 0, 5);
		gp1.add(btUpdate, 1, 5);

		VBox pane2=new VBox(10);
		pane2.setPadding(new Insets(11, 12, 13, 14));
		pane2.getChildren().addAll(gp1,gp1_2);

//--------------------------------------------------------------
	//This pane in the right of borderPane.

		GridPane pane3=new GridPane();
		pane3.setPadding(new Insets(11, 12, 13, 14));
		pane3.setHgap(10);
		pane3.setVgap(10);

		tfTotalNo=new TextField();
		btTotalNo=new Button("Display");
		lblTotalNo=new Label("Insert a data:");
		lblTotalNo.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		pane3.add(lblTotalNo, 0, 0);
		pane3.add(tfTotalNo, 0, 1);
		pane3.add(btTotalNo, 1, 1);

		lblLoadLocation=new Label("Load a location in district:");
		lblLoadLocation.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		tfLoadLocation=new TextField();
		Button btLoadLocation=new Button("Load");
		pane3.add(lblLoadLocation, 0, 2);
		pane3.add(tfLoadLocation, 0, 3);
		pane3.add(btLoadLocation, 1, 3);

//--------------------------------------------------------------
	//This pane in the bottom of borderPane.

		HBox pane4=new HBox(10);
		pane4.setPadding(new Insets(11, 12, 13, 14));
		pane4.setAlignment(Pos.CENTER);
		Button right=new Button(">");
		TextField dis=new TextField("Districts");
		dis.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		dis.setEditable(false);
		Button lift=new Button("<");
		pane4.getChildren().addAll(lift,dis,right);

//---------------------------------------------------------------
	//This pane in the center of borderPane.

		StackPane pane5=new StackPane();
		pane5.setPadding(new Insets(11, 12, 13, 14));
		Result= new TextArea();
		Result.setEditable(false);
		Result.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		pane5.getChildren().add(Result);

//----------------------------------------------------------------
	//Add the all previous panes to borderPane(base pane).

		pane= new BorderPane();
		pane.setPadding(new Insets(11,12,13,14));
		pane.setTop(pane1);
		pane.setLeft(pane2);
		pane.setRight(pane3);
		pane.setBottom(pane4);
		pane.setCenter(pane5);

//-------------------------------------------------------------------------------------
	//This to insert a new District (it must a not exist district to add it).

		btInsert.setOnAction(e-> {

			System.out.println("Insert District Button clicked !\n");
			DistrictRecord district=new DistrictRecord(tfInsert.getText());
			if (districts.find(district)==null) {

				districts.insert(district);

				Result.setText("Added Successfully !!\n" +districts.toString()); //it will show the list of district after we added.
				tfInsert.clear();
			}else {

				Result.setText("This district is already exist!!");
				tfInsert.clear();
			}
		});

//--------------------------------------------------------------------------------------
	//This to delete a District (it must a exist district to delete it).

		btDelete.setOnAction(e-> {

			System.out.println("Delete District Button clicked !\n");
			DistrictRecord district=new DistrictRecord(tfDelete.getText());

			if (districts.find(district)!=null) {

				districts.delete(district);

				Result.setText("Delete Successfully !!\n" +districts.toString()); //it will show the list of district after we deleted.
				tfDelete.clear();
			}else {

				Result.setText("This district is not found to delete!!");
				tfDelete.clear();
			}
		});

//----------------------------------------------------------------------------------------
	//This to update a District name (it must a exist district to update it).

		btUpdate.setOnAction(e-> {

			System.out.println("Update District Butoon clicked !\n");
			DistrictRecord district=new DistrictRecord(tfUpdate.getText());
			if (districts.find(district)!=null) {

				lblnewName.setText("Update name for "+tfUpdate.getText());
				gp1_2.setVisible(true); //--------------------------------------> this gridPane is not visible but when we click update button and the district is found it will visible to update.

				btnewName.setOnAction(eh-> {

					String name=tfnewName.getText();
					DistrictRecord districtN=new DistrictRecord(name);
					if (districts.find(districtN)==null) {

						DNode <DistrictRecord> curr = districts.getHead().getNext();
						while (curr != null) {

							if (curr.getData().getDistrictName().equalsIgnoreCase(district.getDistrictName()) ) {

								curr.getData().setDistrictName(name);
								districts.delete(curr.getData());
								districts.insert(curr.getData());
								break;
							}
							curr = curr.getNext();

						}

						Result.setText("Update Successfully !!\n" +districts.toString());
						tfnewName.clear();
						gp1_2.setVisible(false); //-----------------------> when we finish updated the district and click update it will not visible again.

					}else {

						Result.setText("Not accept, This new name is already exist");
						tfnewName.clear();
						gp1_2.setVisible(false);
					}
				});

				tfUpdate.clear();

			}else {

				Result.setText("This district is not found to update!!");
				gp1_2.setVisible(false);
				tfUpdate.clear();
			}

		});

//-----------------------------------------------------------------------------------
	//This to count the total number of martyrs for the given date.

		btTotalNo.setOnAction(e-> {

			System.out.println("Display total_martyrs Button clicked !\n");
			String date =tfTotalNo.getText();

			int count=0;

			DNode <DistrictRecord> currD = districts.getHead().getNext();
			while (currD != null) {

				SNode <LocationRecord> currL=currD.getData().getLocations().getHead().getNext();
				while (currL!=null) {

					SNode <Martyr> currM=currL.getData().getMartyrs().getHead().getNext();
					while (currM!=null) {

						if (currM.getData().getDate().equalsIgnoreCase(date)) {

							count++;
						}
						currM=currM.getNext();
					}

					currL = currL.getNext();
				}

				currD = currD.getNext();
			}

			Result.setText("The Total number of martyrs in '"+date+"' is : "+count);
			tfTotalNo.clear();
		});

//--------------------------------------------------------------------------------
	//This to navigate throw districts to the right.

		right.setOnAction(e-> {

			String d=dis.getText();
			int totalM=0,totalMm=0,totalMf=0,avgAge=0,max=0,noM=0;
			String date="";

			if (dis.getText().equalsIgnoreCase("Districts")) {

				dis.setText(districts.getHead().getNext().getData().getDistrictName()); //If the word is Districts(default) it will transport to the first district in the list.

				SNode <LocationRecord> currL=districts.getHead().getNext().getData().getLocations().getHead().getNext();
				while (currL!=null) {

					Result.setText(districts.getHead().getNext().getData().getDistrictName());
					SNode <Martyr> currM=currL.getData().getMartyrs().getHead().getNext();
					while (currM!=null) {

						totalM++; //--------> This to count total number of martyrs in specific district.
						avgAge+=Integer.parseInt(currM.getData().getAge()); //-------------------> This for count the average of ages in specific district.
						noM=totalMdate(currM.getData().getDate(),districts.getHead().getNext()); //--------> This to output the date that has the maximum number of martyrs in specific district.
						if (max<noM) {

							max=noM;
							date=currM.getData().getDate();
						}
						if (currM.getData().getGender().equalsIgnoreCase("M")) {

							totalMm++; //--------> This to count total number of male martyrs in specific district.
						}else if (currM.getData().getGender().equalsIgnoreCase("F")){

							totalMf++; //--------> This to count total number of female martyrs in specific district.
						}
						currM=currM.getNext();
					}

					currL = currL.getNext();
				}

				avgAge/=totalM;
				Result.setText(Result.getText()+" statistics: \n 1) Total number of martyrs: "+totalM+"\n "
						+ "2) Total number of male martyrs: "+totalMm+"\n "
						+ "3) Total number of female martyrs: "+totalMf+"\n "
						+ "4) Average martyrs ages: "+avgAge+"\n "
						+ "5) The date that has the maximum number of martyrs: "+date+" is "+max+" martyrs");

			}else {


				DNode <DistrictRecord> currD = districts.getHead().getNext();
				while (currD!=null && currD.getNext()!=null) {

					if (currD.getData().getDistrictName().equalsIgnoreCase(d)) {

						dis.setText(currD.getNext().getData().getDistrictName());

						SNode <LocationRecord> currL=currD.getNext().getData().getLocations().getHead().getNext();
						while (currL!=null) {

							SNode <Martyr> currM=currL.getData().getMartyrs().getHead().getNext();
							while (currM!=null) {

								totalM++; //--------> This to count total number of martyrs in specific district.
								avgAge+=Integer.parseInt(currM.getData().getAge()); //-------------------> This for count the average of ages in specific district.

								noM=totalMdate(currM.getData().getDate(),currD.getNext()); //--------> This to output the date that has the maximum number of martyrs in specific district.
								if (max<noM) {

									max=noM;
									date=currM.getData().getDate();
								}
								if (currM.getData().getGender().equalsIgnoreCase("M")) {

									totalMm++; //--------> This to count total number of male martyrs in specific district.
								}else if (currM.getData().getGender().equalsIgnoreCase("F")){

									totalMf++; //--------> This to count total number of female martyrs in specific district.
								}
								currM=currM.getNext();
							}

							currL = currL.getNext();
						}

						avgAge/=totalM;
						Result.setText(currD.getNext().getData().getDistrictName()
								+" statistics: \n 1) Total number of martyrs: "+totalM+"\n "
								+ "2) Total number of male martyrs: "+totalMm+"\n "
								+ "3) Total number of female martyrs: "+totalMf+"\n "
								+ "4) Average martyrs ages: "+avgAge+"\n "
								+ "5) The date that has the maximum number of martyrs: "+date+" is "+max+" martyrs");
						break;
					}
					currD=currD.getNext();
				}
			}
		});

	//This to navigate throw districts to the left.

		lift.setOnAction(e-> {

			String d=dis.getText();
			int totalM=0,totalMm=0,totalMf=0,avgAge=0,max=0,noM=0;
			String date="";

			if (districts.getHead().getNext().getData().getDistrictName().equalsIgnoreCase(d)) {

				dis.setText("Districts");
				Result.clear();
			}else {

				DNode <DistrictRecord> currD = districts.getHead().getNext();
				while (currD!=null && currD.getNext()!=null) {

					if (currD.getNext().getData().getDistrictName().equalsIgnoreCase(d)) {

						dis.setText(currD.getData().getDistrictName());

						SNode <LocationRecord> currL=currD.getData().getLocations().getHead().getNext();
						while (currL!=null) {

							SNode <Martyr> currM=currL.getData().getMartyrs().getHead().getNext();
							while (currM!=null) {

								totalM++;
								avgAge+=Integer.parseInt(currM.getData().getAge());

								noM=totalMdate(currM.getData().getDate(),currD);
								if (max<noM) {

									max=noM;
									date=currM.getData().getDate();
								}
								if (currM.getData().getGender().equalsIgnoreCase("M")) {

									totalMm++;
								}else if (currM.getData().getGender().equalsIgnoreCase("F")){

									totalMf++;
								}
								currM=currM.getNext();
							}

							currL = currL.getNext();
						}

						avgAge/=totalM;
						Result.setText(currD.getData().getDistrictName()
								+" statistics: \n 1) Total number of martyrs: "+totalM+"\n "
								+ "2) Total number of male martyrs: "+totalMm+"\n "
								+ "3) Total number of female martyrs: "+totalMf+"\n "
								+ "4) Average martyrs ages: "+avgAge+"\n "
								+ "5) The date that has the maximum number of martyrs: "+date+" is "+max+" martyrs");
						break;
					}
					currD=currD.getNext();
				}
			}
		});

//-----------------------------------------------------------------------------------------------
	//This to load the all locations that in the given district to the locations_screen.

		btLoadLocation.setOnAction(e-> {

			System.out.println("Load Location Button clicked !\n");
			String d=tfLoadLocation.getText();

			DNode <DistrictRecord> currD = districts.getHead().getNext();
			while (currD!=null) {

				if (currD.getData().getDistrictName().equalsIgnoreCase(d)) {

					locationS.setLocations(currD.getData().getLocations());
					locationS.district=currD.getData().getDistrictName();
					locationS.loc.setText("Locations");
					locationS.Result.clear();
					break;
				}
				currD=currD.getNext();
			}

			Stage primaryStage=new Stage();
			primaryStage.setTitle("Location_Screen");
			primaryStage.setScene(scene3);
			primaryStage.show();

			tfLoadLocation.clear();
		});

	}


	public int totalMdate(String date ,DNode<DistrictRecord> district) { //This method to return the number of martyrs in specific district for output the date that has the maximum number of martyrs.

		int count=0;

		SNode <LocationRecord> currL=district.getData().getLocations().getHead().getNext();
		while (currL!=null) {

			SNode <Martyr> currM=currL.getData().getMartyrs().getHead().getNext();
			while (currM!=null) {

				if (currM.getData().getDate().equalsIgnoreCase(date)) {

					count++;
				}
				currM=currM.getNext();
			}

			currL = currL.getNext();
		}


		return count;

	}

	public BorderPane getPane() {

		return pane;
	}

	public DLinkedList<DistrictRecord> getDistricts() {
		return districts;
	}

}