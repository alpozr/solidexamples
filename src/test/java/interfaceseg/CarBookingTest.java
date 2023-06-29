package interfaceseg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class CarBookingTest {


    CarBooking carBooking = new CarBooking();
    @Test
    void bookingStatus() {
        //GWT
        String expected = "Book id : CAR20002013 \n Book date : 12.07.2023\n Book from : BestCars.com\n Book Price : 25$/per month";
        assertEquals(carBooking.bookingStatus(),expected);
    }

    @Test
    void carInformation() {
        //GWT
        String expected = "Car Model : Ford Fiesta 1.2 TrendX \n Car Year : 2015 \n Car Color: White";
        assertEquals(carBooking.carInformation(),expected);
    }

    @Test
    void bookCar() {
        //GWT
        String expected = "Car has been booked";
        assertEquals(carBooking.bookCar(),expected);
    }

    @Test
    void cancelCarBooking() {
        //GWT
        String expected = "Car booking is cancelled";
        assertEquals(carBooking.cancelCarBooking(),expected);
    }
}