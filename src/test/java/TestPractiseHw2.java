import org.junit.jupiter.api.Test;

public class TestPractiseHw2 {
    @Test
    public void workWithBook () {
        Book firstBook = new Book();
        firstBook.setPagesNumber(230);
        firstBook.setPrice(15.40);

        System.out.println(firstBook.getPagesNumber());
        System.out.println(firstBook.getPrice());
    }
    @Test
    public void workWithBus () {
        Bus firstBus = new Bus();
        firstBus.setBusNumber(19);
        firstBus.setColor("red");

        System.out.println(firstBus.getBusNumber());
        System.out.println(firstBus.getColor());
    }
    @Test
    public void workWithCity() {
        City firstCity = new City();
        firstCity.setName("Paris");
        firstCity.setPopulation(2.14);

        System.out.println(firstCity.getName());
        System.out.println(firstCity.getPopulation());
    }
    @Test
    public void workWithCreditCard() {
        CreditCard firstCreditCard = new CreditCard();
        firstCreditCard.setLimit(10000);
        firstCreditCard.setHolderName("Anna Lovcinovska");

        System.out.println(firstCreditCard.getLimit());
        System.out.println(firstCreditCard.getHolderName());
    }
    @Test
    public void workWithDelivery() {
        Delivery firstDelivery = new Delivery();
        firstDelivery.setDeliveryPrice(2.50);
        firstDelivery.setAdress("Riga,Lomonosova 12-19");

        System.out.println(firstDelivery.getDeliveryPrice());
        System.out.println(firstDelivery.getAdress());
    }
    @Test
    public void workWithEducation() {
        Education firstEducation = new Education();
        firstEducation.setYears(4);
        firstEducation.setForm("full-time");

        System.out.println(firstEducation.getYears());
        System.out.println(firstEducation.getForm());
    }
    @Test
    public void workWithHouse() {
        House firstHouse = new House();
        firstHouse.setFloors(2);
        firstHouse.setRooms(6);

        System.out.println(firstHouse.getFloors());
        System.out.println(firstHouse.getRooms());
    }
    @Test
    public void workWithJob() {
        Job firstJob = new Job();
        firstJob.setBruttoSalary(1.500);
        firstJob.setPosition("junior qa");

        System.out.println(firstJob.getBruttoSalary());
        System.out.println(firstJob.getPosition());
    }
    @Test
    public void workWithMobilePhone() {
       MobilePhone firstMobilePhone =  new MobilePhone();
       firstMobilePhone.setManufacturer("Huawei");
       firstMobilePhone.setColor("grey");

        System.out.println(firstMobilePhone.getManufacturer());
        System.out.println(firstMobilePhone.getColor());
    }
    @Test
    public void workWithTravelByPlane() {
        TravelByPlane firstTravelByPlane = new TravelByPlane();
        firstTravelByPlane.setDays(14);
        firstTravelByPlane.setCountry("Greece");

        System.out.println(firstTravelByPlane.getDays());
        System.out.println(firstTravelByPlane.getCountry());
    }


}
