public class StorageFacility {
    private int facilityId;
    private int availableCapacity;
    private String managerName;
    private String managerEmail;
    private String managerPhoneNumber;

    // Constructor
    public StorageFacility(int facilityId, int availableCapacity, String managerName, String managerEmail, String managerPhoneNumber) {
        this.facilityId = facilityId;
        this.availableCapacity = availableCapacity;
        this.managerName = managerName;
        this.managerEmail = managerEmail;
        this.managerPhoneNumber = managerPhoneNumber;
    }

    // Getters and Setters
    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getManagerPhoneNumber() {
        return managerPhoneNumber;
    }

    public void setManagerPhoneNumber(String managerPhoneNumber) {
        this.managerPhoneNumber = managerPhoneNumber;
    }

    // Method to add goods
    public void storeGoods(int units) {
        if (units <= availableCapacity) {
            availableCapacity -= units;
            System.out.println("Stored " + units + " units of goods. Remaining facility capacity: " + availableCapacity + " units.");
        } else {
            System.out.println("Not enough capacity in the facility. Remaining facility capacity: " + availableCapacity + " units.");
        }
    }

    // Method to remove goods
    public void retrieveGoods(int units) {
        if (units <= (5000 - availableCapacity)) {
            availableCapacity += units;
            System.out.println("Retrieved " + units + " units of goods. Remaining facility capacity: " + availableCapacity + " units.");
        } else {
            System.out.println("Not enough goods in the facility to retrieve " + units + " units.");
        }
    }

    // Method to check occupancy
    public void checkCapacity() {
        int occupiedCapacity = 5000 - availableCapacity;
        System.out.println("Occupied facility capacity: " + occupiedCapacity + " units.");
        System.out.println("Available facility capacity: " + availableCapacity + " units.");
    }

    // Method to update contact details
    public void updateContactDetails(String newEmail, String newPhoneNumber) {
        this.managerEmail = newEmail;
        this.managerPhoneNumber = newPhoneNumber;
        System.out.println("Manager's contact details updated.");
        System.out.println("New email: " + newEmail);
        System.out.println("New phone number: " + newPhoneNumber);
    }

    // Main method for testing
    public static void main(String[] args) {
        StorageFacility facility = new StorageFacility(1, 5000, "Manager", "manager@example.com", "+48 123 456 789");

        facility.storeGoods(3000);
        facility.retrieveGoods(1000);
        facility.storeGoods(2500);
        facility.checkCapacity();
        facility.updateContactDetails("manager@storage.pl", "+48 987 654 321");
        facility.storeGoods(600);
    }
}