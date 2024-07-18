package dLinkedList;

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


public class LocationFx { //Class Fx for the Second screen(Locations_Screen).

	private BorderPane pane;
	private SLinkedList<LocationRecord> locations;
	String district;
	TextField loc;
	TextArea Result;

	public LocationFx() {

		Text text;
		Label lblInsertL, lblUpdateL, lblDeleteL, lblSearchL, lblInsertM, lblUpdateM, lblDeleteM, lblSearchM;
		TextField tfInsertL, tfDeleteL, tfUpdateL, tfSearchL, tfDeleteM, tfUpdateM, tfSearchM;
		Button btInsertL, btDeleteL,btUpdateL, btSearchL, btInsertM, btDeleteM,btUpdateM, btSearchM;

		locations=new SLinkedList<>();

//-------------------------------------------------------------------------------------------
	//This pane in the top of borderPane.

		StackPane pane1=new StackPane();
		pane1.setPadding(new Insets(11, 12, 13, 14));
		text=new Text("Location Screen");
		text.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 40));
		pane1.getChildren().add(text);

//------------------------------------------------------------------------------------------
	//This pane in the left of borderPane.

		GridPane gp1=new GridPane();
		gp1.setPadding(new Insets(11, 12, 13, 14));
		gp1.setHgap(10);
		gp1.setVgap(10);

		tfInsertL=new TextField();
		btInsertL=new Button("Insert");
		lblInsertL=new Label("Insert a new location:");
		lblInsertL.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp1.add(lblInsertL, 0, 0);
		gp1.add(tfInsertL, 0, 1);
		gp1.add(btInsertL, 1, 1);

		tfDeleteL=new TextField();
		btDeleteL=new Button("Delete");
		lblDeleteL=new Label("Delete a location:");
		lblDeleteL.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp1.add(lblDeleteL, 0, 2);
		gp1.add(tfDeleteL, 0, 3);
		gp1.add(btDeleteL, 1, 3);

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


		tfUpdateL=new TextField();
		btUpdateL=new Button("Update");
		lblUpdateL=new Label("Update a location:");
		lblUpdateL.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp1.add(lblUpdateL, 0, 4);
		gp1.add(tfUpdateL, 0, 5);
		gp1.add(btUpdateL, 1, 5);

		tfSearchL=new TextField();
		btSearchL=new Button("Search");
		lblSearchL=new Label("Search a location");
		lblSearchL.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp1.add(lblSearchL, 0, 6);
		gp1.add(tfSearchL, 0, 7);
		gp1.add(btSearchL, 1, 7);

		VBox pane2=new VBox(10);
		pane2.setPadding(new Insets(11, 12, 13, 14));
		pane2.getChildren().addAll(gp1,gp1_2);

//-----------------------------------------------------------------------------------------
	// This for insert a new martyr (pane in the right of the borderPane).

		GridPane gp2_2=new GridPane();
		gp2_2.setPadding(new Insets(11, 12, 13, 14));
		gp2_2.setAlignment(Pos.CENTER);
		gp2_2.setHgap(10);
		gp2_2.setVgap(10);


		Label lblName=new Label("Name: ");
		lblName.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfName=new TextField();
		gp2_2.add(lblName, 0, 0);
		gp2_2.add(tfName, 1, 0);

		Label lblDate=new Label("Date: ");
		lblDate.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfDate=new TextField();
		gp2_2.add(lblDate, 0, 1);
		gp2_2.add(tfDate, 1, 1);

		Label lblAge=new Label("Age: ");
		lblAge.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfAge=new TextField();
		gp2_2.add(lblAge, 0, 2);
		gp2_2.add(tfAge, 1, 2);

		Label lblLocation=new Label("Location: ");
		lblLocation.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfLocation=new TextField();
		gp2_2.add(lblLocation, 0, 3);
		gp2_2.add(tfLocation, 1, 3);

		Label lblDistrict=new Label("District: ");
		lblDistrict.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfDistrict=new TextField();
		gp2_2.add(lblDistrict, 0, 4);
		gp2_2.add(tfDistrict, 1, 4);

		Label lblGender=new Label("Gender: ");
		lblGender.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfGender=new TextField();
		gp2_2.add(lblGender, 0, 5);
		gp2_2.add(tfGender, 1, 5);

		Button btInsert=new Button("Insert_Martyr");
		btInsert.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gp2_2.add(btInsert, 1, 6);

//-------------------------------------------------------------------------------
	// This pane in the right of the borderPane.

		GridPane pane3=new GridPane();
		pane3.setPadding(new Insets(11, 12, 13, 14));
		pane3.setHgap(10);
		pane3.setVgap(10);

		btInsertM=new Button("Insert");
		lblInsertM=new Label("Insert a new martyr:");
		lblInsertM.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		pane3.add(lblInsertM, 0, 0);
		pane3.add(btInsertM, 0, 1);

		tfDeleteM=new TextField();
		btDeleteM=new Button("Delete");
		lblDeleteM=new Label("Delete a martyr:");
		lblDeleteM.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		pane3.add(lblDeleteM, 0, 2);
		pane3.add(tfDeleteM, 0, 3);
		pane3.add(btDeleteM, 1, 3);



		tfSearchM=new TextField();
		btSearchM=new Button("Search");
		lblSearchM=new Label("Search a martyr");
		lblSearchM.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		pane3.add(lblSearchM, 0, 4);
		pane3.add(tfSearchM, 0, 5);
		pane3.add(btSearchM, 1, 5);

		tfUpdateM=new TextField();
		btUpdateM=new Button("Update");
		lblUpdateM=new Label("Update a martyr:");
		lblUpdateM.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		pane3.add(lblUpdateM, 0, 6);
		pane3.add(tfUpdateM, 0, 7);
		pane3.add(btUpdateM, 1, 7);

//-------------------------------------------------------
	// This for update a martyr (pane in the right of the borderPane).

		GridPane gpUpdate=new GridPane();
		gpUpdate.setPadding(new Insets(11, 12, 13, 14));
		gpUpdate.setAlignment(Pos.CENTER);
		gpUpdate.setHgap(10);
		gpUpdate.setVgap(10);

		Label up=new Label();
		up.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gpUpdate.add(up, 0, 0);


		Label lblNameU=new Label("Name: ");
		lblNameU.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfNameU=new TextField();
		gpUpdate.add(lblNameU, 0, 1);
		gpUpdate.add(tfNameU, 1, 1);

		Label lblDateU=new Label("Date: ");
		lblDateU.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfDateU=new TextField();
		gpUpdate.add(lblDateU, 0, 2);
		gpUpdate.add(tfDateU, 1, 2);

		Label lblAgeU=new Label("Age: ");
		lblAgeU.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfAgeU=new TextField();
		gpUpdate.add(lblAgeU, 0, 3);
		gpUpdate.add(tfAgeU, 1, 3);

		Label lblLocationU=new Label("Location: ");
		lblLocationU.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfLocationU=new TextField();
		gpUpdate.add(lblLocationU, 0, 4);
		gpUpdate.add(tfLocationU, 1, 4);

		Label lblDistrictU=new Label("District: ");
		lblDistrictU.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfDistrictU=new TextField();
		gpUpdate.add(lblDistrictU, 0, 5);
		gpUpdate.add(tfDistrictU, 1, 5);

		Label lblGenderU=new Label("Gender: ");
		lblGenderU.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		TextField tfGenderU=new TextField();
		gpUpdate.add(lblGenderU, 0, 6);
		gpUpdate.add(tfGenderU, 1, 6);

		Button btUpdateU=new Button("Update_Martyr");
		btUpdateU.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		gpUpdate.add(btUpdateU, 1, 7);


//-------------------------------------------------------------------------------
	//This pane in the center of the borderPane.

		StackPane pane4=new StackPane();
		pane4.setPadding(new Insets(11, 12, 13, 14));
		Result= new TextArea();
		Result.setEditable(false);
		Result.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		pane4.getChildren().add(Result);

//------------------------------------------------------------------------------
	//This pane in the bottom of the borderPane.

		HBox pane5=new HBox(10);
		pane5.setPadding(new Insets(11, 12, 13, 14));
		pane5.setAlignment(Pos.CENTER);
		Button right=new Button(">");
		loc=new TextField("Locations");
		loc.setFont(Font.font("Times New Roman", FontWeight.NORMAL, 20));
		loc.setEditable(false);
		pane5.getChildren().addAll(loc,right);

//-------------------------------------------------------------------------------
	//Add the all previous panes to borderPane(base pane).

		pane= new BorderPane();
		pane.setPadding(new Insets(11,12,13,14));
		pane.setTop(pane1);
		pane.setLeft(pane2);
		pane.setRight(pane3);
		pane.setCenter(pane4);
		pane.setBottom(pane5);

//-------------------------------------------------------------------------
	//This to insert a new Location (it must a not exist location to add it).

		btInsertL.setOnAction(e-> {

			System.out.println("Insert Location Button clicked !\n");
			LocationRecord location=new LocationRecord(tfInsertL.getText());
			if (locations.find(location)==null) {

				locations.insert(location);

				Result.setText("Added Successfully !!\n" +locations.toString());
				tfInsertL.clear();
			}else {

				Result.setText("This location is already exist!!");
				tfInsertL.clear();
			}
		});

//---------------------------------------------------------------------------
	//This to delete a Location (it must a exist location to delete it).

		btDeleteL.setOnAction(e-> {

			System.out.println("Delete Location Button clicked !\n");
			LocationRecord location=new LocationRecord(tfDeleteL.getText());

			if (locations.find(location)!=null) {

				locations.delete(location);

				Result.setText("Delete Successfully !!\n" +locations.toString());
				tfDeleteL.clear();
			}else {

				Result.setText("This location is not found to delete!!");
				tfDeleteL.clear();
			}
		});

//------------------------------------------------------------------------------
	//This to update a Location name (it must a exist location to update it).

		btUpdateL.setOnAction(e-> {

			System.out.println("Update Location Butoon clicked !\n");
			LocationRecord location=new LocationRecord(tfUpdateL.getText());
			if (locations.find(location)!=null) {

				lblnewName.setText("Update name for "+tfUpdateL.getText());
				gp1_2.setVisible(true); //--------------------------------------> this gridPane is not visible but when we click update button and the location is found it will visible to update.

				btnewName.setOnAction(eh-> {

					String name=tfnewName.getText();
					LocationRecord locationN=new LocationRecord(name);
					if (locations.find(locationN)==null) {

						SNode <LocationRecord> curr = locations.getHead().getNext();
						while (curr != null) {

							if (curr.getData().getLocationName().equalsIgnoreCase(location.getLocationName())) {

								curr.getData().setLocationName(name);
								locations.delete(curr.getData());
								locations.insert(curr.getData());
								break;
							}
							curr = curr.getNext();

						}

						Result.setText("Update Successfully !!\n" +locations.toString());
						tfnewName.clear();
						gp1_2.setVisible(false);  //-----------------------> when we finish updated the location and click update it will not visible again.

					}else {

						Result.setText("Not accept, This new name is already exist");
						tfnewName.clear();
						gp1_2.setVisible(false);
					}
				});

				tfUpdateL.clear();

			}else {

				Result.setText("This location is not found to update!!");
				gp1_2.setVisible(false);
				tfUpdateL.clear();
			}

		});

//--------------------------------------------------------------------------------------------------------------------------
	//This to navigate throw locations to the right and if it reach the last location it will return to 1st location.

		right.setOnAction(e-> {

			LocationRecord l=new LocationRecord(loc.getText());
			int totalM=0,totalMm=0,totalMf=0,avgAge=0;
			Martyr old=new Martyr();

			if (loc.getText().equalsIgnoreCase("Locations")) {

				loc.setText(locations.getHead().getNext().getData().getLocationName()); //If the word is Locations(default) it will transport to the first location in the list.

				Result.setText(locations.getHead().getNext().getData().getLocationName());
				SNode <Martyr> currM=locations.getHead().getNext().getData().getMartyrs().getHead().getNext();
				while (currM!=null) {

					totalM++; //--------> This to count total number of martyrs in specific location.
					avgAge+=Integer.parseInt(currM.getData().getAge()); //-------------------> This for count the average of ages in specific location.


					if (currM.getNext()==null) {

						old=currM.getData(); //---------> This to get the oldest martyr (because we sort the martyrs by age the oldest martyr in the last).
					}

					if (currM.getData().getGender().equalsIgnoreCase("M")) {

						totalMm++; //--------> This to count total number of male martyrs in specific location.
					}else if (currM.getData().getGender().equalsIgnoreCase("F")){

						totalMf++; //--------> This to count total number of female martyrs in specific location.
					}
					currM=currM.getNext();
				}


				avgAge/=totalM;
				Result.setText(Result.getText()+" in "+district+" statistics: \n 1) Total number of martyrs: "+totalM+"\n "
						+ "2) Total number of male martyrs: "+totalMm+"\n "
						+ "3) Total number of female martyrs: "+totalMf+"\n "
						+ "4) Average martyrs ages: "+avgAge+"\n "
						+ "5) The youngest martyr: \n"+locations.getHead().getNext().getData().getMartyrs().getHead().getNext().getData().toString()+"\n" //--> This to get the youngest martyr (because we sort the martyrs by age the oldest martyr in the first).
						+ "6) oldest martyr: \n"+old.toString());

			}else {

				if (locations.find(l)!=null) {

					if (locations.find(l).getData().getLocationName().equalsIgnoreCase(loc.getText())) {

						if (locations.find(l).getNext()!=null) {

							loc.setText(locations.find(l).getNext().getData().getLocationName());

							SNode <Martyr> currM=locations.find(l).getNext().getData().getMartyrs().getHead().getNext();
							while (currM!=null) {

								totalM++;
								avgAge+=Integer.parseInt(currM.getData().getAge());


								if (currM.getNext()==null) {

									old=currM.getData();
								}

								if (currM.getData().getGender().equalsIgnoreCase("M")) {

									totalMm++;
								}else if (currM.getData().getGender().equalsIgnoreCase("F")){

									totalMf++;
								}
								currM=currM.getNext();
							}

							avgAge/=totalM;
							Result.setText(locations.find(l).getNext().getData().getLocationName()+" in "+district
								+" statistics: \n 1) Total number of martyrs: "+totalM+"\n "
								+ "2) Total number of male martyrs: "+totalMm+"\n "
								+ "3) Total number of female martyrs: "+totalMf+"\n "
								+ "4) Average martyrs ages: "+avgAge+"\n "
								+ "5) The youngest martyr: \n"+locations.find(l).getNext().getData().getMartyrs().getHead().getNext().getData().toString()+"\n"
								+ "6) oldest martyr: \n"+old.toString());

						}else {

							loc.setText(locations.getHead().getNext().getData().getLocationName());

							Result.setText(locations.getHead().getNext().getData().getLocationName());
							SNode <Martyr> currM=locations.getHead().getNext().getData().getMartyrs().getHead().getNext();
							while (currM!=null) {

								totalM++;
								avgAge+=Integer.parseInt(currM.getData().getAge());


								if (currM.getNext()==null) {

									old=currM.getData();
								}

								if (currM.getData().getGender().equalsIgnoreCase("M")) {

									totalMm++;
								}else if (currM.getData().getGender().equalsIgnoreCase("F")){

									totalMf++;
								}
								currM=currM.getNext();
							}


							avgAge/=totalM;
							Result.setText(Result.getText()+" in "+district+" statistics: \n 1) Total number of martyrs: "+totalM+"\n "
									+ "2) Total number of male martyrs: "+totalMm+"\n "
									+ "3) Total number of female martyrs: "+totalMf+"\n "
									+ "4) Average martyrs ages: "+avgAge+"\n "
									+ "5) The youngest martyr: \n"+locations.getHead().getNext().getData().getMartyrs().getHead().getNext().getData().toString()+"\n"
									+ "6) oldest martyr: \n"+old.toString());

						}
					}
				}
			}

		});

//----------------------------------------------------------------------------------------------------------------------------------------------
	//This to search a location and display his statistic.

		btSearchL.setOnAction(e-> {

			System.out.println("Search Location Butoon clicked !\n");
			int totalM=0,totalMm=0,totalMf=0,avgAge=0;
			Martyr old=new Martyr();

			LocationRecord l=new LocationRecord(tfSearchL.getText());
			if (locations.find(l)!=null) {


				SNode <Martyr> currM=locations.find(l).getData().getMartyrs().getHead().getNext();
				while (currM!=null) {

					totalM++;
					avgAge+=Integer.parseInt(currM.getData().getAge());


					if (currM.getNext()==null) {

						old=currM.getData();
					}

					if (currM.getData().getGender().equalsIgnoreCase("M")) {

						totalMm++;
					}else if (currM.getData().getGender().equalsIgnoreCase("F")){

						totalMf++;
					}
					currM=currM.getNext();
				}

				avgAge/=totalM;
				Result.setText("Search successfully!!\n"+locations.find(l).getData().getLocationName()
					+" statistics: \n 1) Total number of martyrs: "+totalM+"\n "
					+ "2) Total number of male martyrs: "+totalMm+"\n "
					+ "3) Total number of female martyrs: "+totalMf+"\n "
					+ "4) Average martyrs ages: "+avgAge+"\n "
					+ "5) The youngest martyr: \n"+locations.find(l).getData().getMartyrs().getHead().getNext().getData().toString()+"\n"
					+ "6) oldest martyr: \n"+old.toString());

				tfSearchL.clear();
			}else {

				Result.setText("This location not found");
				tfSearchL.clear();

			}

		});

//--------------------------------------------------------------------------------------------------
	//This to insert a new Martyr (it must a not exist martyr to add it).

		Stage InsertMscene=new Stage();
		Scene InsertMs=new Scene(gp2_2,400,350);
		btInsertM.setOnAction(e-> {

			System.out.println("Insert Martyr Button clicked !\n");
			InsertMscene.setTitle("Insert_Martyr_Screen");
			InsertMscene.setScene(InsertMs);
			InsertMscene.show();

			btInsert.setOnAction(eh-> {

				String name=tfName.getText();
				String date=tfDate.getText();
				String age=tfAge.getText();
				String location=tfLocation.getText();
				String district=tfDistrict.getText();
				String gender=tfGender.getText();

				LocationRecord l=new LocationRecord(location);

				Martyr martyr=new Martyr(name,date,age,location,district,gender);


				if (locations.find(l)!=null) {


					if (locations.find(l).getData().getMartyrs().find(martyr)==null) {

						locations.find(l).getData().getMartyrs().insert(martyr);
						Result.setText("Added Martyr successfully !\n"+locations.find(l).getData().getMartyrs().toString());
					}else {

						Result.setText("This martyr is already exist !!");
					}
				}

				tfName.clear();
				tfDate.clear();
				tfAge.clear();
				tfLocation.clear();
				tfDistrict.clear();
				tfGender.clear();

				InsertMscene.close();
			});
		});

//----------------------------------------------------------------------------------------
	//This to delete a Martyr (it must a exist martyr to delete it).

		btDeleteM.setOnAction(e-> {

			System.out.println("Delete Martyr Button clicked !\n");
			String name=tfDeleteM.getText();
			boolean on=true;

			SNode<LocationRecord>currL=locations.getHead().getNext();
			while (currL!=null) {

				SNode<Martyr>currM=currL.getData().getMartyrs().getHead().getNext();
				while (currM!=null) {

					if (currM.getData().getName().equalsIgnoreCase(name)) {

						currL.getData().getMartyrs().delete(currM.getData());
						Result.setText("Delete Martyr successfully !\n"+currL.getData().getMartyrs().toString());
						on=true;
						break;

					}else {

						on=false;
					}

					currM=currM.getNext();
				}

				if (on==true) {

					break;
				}

				currL=currL.getNext();
			}

			tfDeleteM.clear();
		});

//---------------------------------------------------------------------
	//This to update a Martyr (it must a exist martyr to update it).

		Stage DeleteMscene=new Stage();
		Scene DeleteMs=new Scene(gpUpdate,400,350);
		btUpdateM.setOnAction(e-> {

			System.out.println("Update Martyr Button clicked !\n");
			String name=tfUpdateM.getText();
			boolean on=true;

			SNode<LocationRecord>currL=locations.getHead().getNext();
			while (currL!=null) {

				SNode<Martyr>currM=currL.getData().getMartyrs().getHead().getNext();
				while (currM!=null) {

					if (currM.getData().getName().equalsIgnoreCase(name)) {

						up.setText("Update for "+currM.getData().getName());
						DeleteMscene.setTitle("Update_Martyr_Screen");
						DeleteMscene.setScene(DeleteMs);
						DeleteMscene.show();

						Martyr martyr=currM.getData();
						LocationRecord l=new LocationRecord(currL.getData().getLocationName());
						on=true;

						btUpdateU.setOnAction(eh-> {

							String nameU=tfNameU.getText();
							String dateU=tfDateU.getText();
							String ageU=tfAgeU.getText();
							String locationU=tfLocationU.getText();
							String districtU=tfDistrictU.getText();
							String genderU=tfGenderU.getText();

							LocationRecord lU=new LocationRecord(locationU);

							Martyr martyrU=new Martyr(nameU,dateU,ageU,locationU,districtU,genderU);

							if (locations.find(lU)!=null) {

								locations.find(l).getData().getMartyrs().delete(martyr);
								locations.find(lU).getData().getMartyrs().insert(martyrU);
								Result.setText("Update Martyr successfully !\n"+locations.find(lU).getData().getMartyrs().toString());
							}

							tfNameU.clear();
							tfDateU.clear();
							tfAgeU.clear();
							tfLocationU.clear();
							tfDistrictU.clear();
							tfGenderU.clear();

							DeleteMscene.close();
						});

						break;
					}else {

						on=false;
					}

					currM=currM.getNext();
				}

				if (on==true) {

					break;
				}
				currL=currL.getNext();
			}

			tfUpdateM.clear();
		});

//---------------------------------------------------------------------------------------
	//This to search a martyr by part of his name and display his information.

		btSearchM.setOnAction(e-> {

			System.out.println("Search Martyr Button clicked !\n");
			String name =tfSearchM.getText();
			boolean on=false;

			SNode<LocationRecord>currL=locations.getHead().getNext();
			while (currL!=null) {

				SNode<Martyr>currM=currL.getData().getMartyrs().getHead().getNext();
				while (currM!=null) {

					if (currM.getData().getName().toUpperCase().contains(name.toUpperCase())) {

						Result.setText("Search martyr successfully !!\n"+currM.getData().toString());
						on=true;
						break;
					}

					currM=currM.getNext();
				}

				if (on==true) {

					break;
				}

				currL=currL.getNext();
			}

			if (on==false) {

				Result.setText("This martyr not found!!");
			}

			tfSearchM.clear();

		});

	}

	public void setLocations(SLinkedList<LocationRecord> locations) {
		this.locations = locations;
	}

	public BorderPane getPane() {
		return pane;
	}

	public SLinkedList<LocationRecord> getLocations() {
		return locations;
	}
}
