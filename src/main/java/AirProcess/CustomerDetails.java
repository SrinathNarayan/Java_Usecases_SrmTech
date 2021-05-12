package AirProcess;

public class CustomerDetails {
	protected Integer customerId;
	protected String customerName;
	protected String baseCountry;
	protected String address;
	protected boolean isActive;
	protected String phoneNumber;
	protected String avlCredits;
	protected String is4g;
	protected Integer billAmount;
	protected String description;
	
	
	public CustomerDetails(Integer customerId, String customerName, String baseCountry, String address, 
			boolean isActive, String phoneNumber, String avlCredits, String is4g, Integer billAmount,
			String description) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.baseCountry = baseCountry;
		this.address = address;

		this.isActive = isActive;
		this.phoneNumber = phoneNumber;
		this.avlCredits = avlCredits;
		this.is4g = is4g;
		this.billAmount = billAmount;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", baseCountry=" + baseCountry
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", avlCredits=" + avlCredits + ", is4g="
				+ is4g + ", billAmount=" + billAmount + ", description=" + description +  ", isActive="
				+ isActive + "]";
	}

	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getBaseCountry() {
		return baseCountry;
	}


	public void setBaseCountry(String baseCountry) {
		this.baseCountry = baseCountry;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAvlCredits() {
		return avlCredits;
	}


	public void setAvlCredits(String avlCredits) {
		this.avlCredits = avlCredits;
	}


	public String getIs4g() {
		return is4g;
	}


	public void setIs4g(String is4g) {
		this.is4g = is4g;
	}


	public Integer getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(Integer billAmount) {
		this.billAmount = billAmount;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	

	

	
}
