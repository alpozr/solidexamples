package interfaceseg;

public class CarBooking implements Car {
    @Override
    public String bookingStatus() {
        return "Book id : CAR20002013 \n Book date : 12.07.2023\n Book from : BestCars.com\n Book Price : 25$/per month";
    }

    @Override
    public String carInformation() {
        return "Car Model : Ford Fiesta 1.2 TrendX \n Car Year : 2015 \n Car Color: White" ;
    }

    @Override
    public String bookCar() {
        return "Car has been booked";
    }

    @Override
    public String cancelCarBooking() {
        return "Car booking is cancelled";
    }
}
