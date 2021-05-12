package filereaderCarManu;

import java.util.Date;

public class Contentdetails {

 protected String category ;	
 protected String sKU ;
 protected Date dateofManufacturer;
 protected String iSFragile ;	
 protected String modelNumber;
 protected String color;
 protected Float costStep;
 
public Contentdetails(String category, String sKU, Date dateofManufacturer, String iSFragile, String modelNumber,
        String color, Float costStep) {
   this. category = category;
    this.sKU = sKU;
   this. dateofManufacturer = dateofManufacturer;
    this.iSFragile = iSFragile;
    this.modelNumber = modelNumber;
    this.color = color;
    this.costStep = costStep;



}

public String getCategory() {
    return category;
}

public void setCategory(String category) {
    this.category = category;
}

public String getSKU() {
    return sKU;
}

public void setSKU(String sKU) {
    this.sKU = sKU;
}

public Date getDateofManufacturer() {
    return dateofManufacturer;
}

public void setDateofManufacturer(Date dateofManufacturer) {
    this.dateofManufacturer = dateofManufacturer;
}

public String getISFragile() {
    return iSFragile;
}

public void setISFragile(String iSFragile) {
    this.iSFragile = iSFragile;
}

public String getModelNumber() {
    return modelNumber;
}

public void setModelNumber(String modelNumber) {
    this.modelNumber = modelNumber;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}

public Float getCostStep() {
    return costStep;
}

public void setCostStep(Float costStep) {
   this. costStep = costStep;
}

@Override
public String toString() {
    return "Contentdetails [Category=" + category + ", Color=" + color + ", CostStep=" + costStep
            + ", DateofManufacturer=" + dateofManufacturer + ", ISFragile=" + iSFragile + ", ModelNumber=" + modelNumber
            + ", SKU=" + sKU + "]";
}
 
    
}
