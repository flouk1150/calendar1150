import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Table {

    private  final SimpleIntegerProperty rID;
    private  final SimpleStringProperty rName;
    private  final SimpleStringProperty rDate;
    private  final SimpleStringProperty rPlace;
    private  final SimpleStringProperty rYearXX;


    public Table(int sID, String sName, String sDate, String sPlace, String rYearXX){

        this.rID = new SimpleIntegerProperty(sID);
        this.rName = new SimpleStringProperty(sName);
        this.rDate = new SimpleStringProperty(sDate);
        this.rPlace = new SimpleStringProperty(sPlace);

        this.rYearXX = new SimpleStringProperty(rYearXX);
    }



    public int getRID() {
        return rID.get();
    }

    public String getRName() {
        return rName.get();
    }

    public String getRDate() {
        return rDate.get();
    }

    public String getRPlace() {
        return rPlace.get();
    }

    public String getRYearXX(){
        return rYearXX.get();
    }
    public  void setrYearXX(String v){
        rYearXX.set(v);
    }
    public void setRID(int v) {
        rID.set(v);
    }

    public void setRName(String v) {
        rName.set(v);
    }

    public void setRDate(String v) {
        rDate.set(v);
    }

    public void setRPlace(String v) {
        rPlace.set(v);
    }
}
