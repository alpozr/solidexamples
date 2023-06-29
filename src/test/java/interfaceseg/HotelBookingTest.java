package interfaceseg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class HotelBookingTest {

    HotelBooking hotelBooking=new HotelBooking();
    @Test
    void bookingStatus() {
        //GWT
        String expected = "Book id : HTL1200924920 \n Book date : 15.07.2023\n Book from : Hotels.com\n Book Price : 35$/per night";
        assertEquals(hotelBooking.bookingStatus(),expected);
    }

    @Test
    void hotelInformation() {
        //GWT
        String expected = "Hotel name : Land Of Legends \n Place : Wildwood,NJ / USA \n Hotel Rating : 4.32/5";
        assertEquals(hotelBooking.hotelInformation(),expected);
    }

    @Test
    void bookHotel() {
        //GWT
        String expected = "Hotel has been booked";
        assertEquals(hotelBooking.bookHotel(),expected);
    }

    @Test
    void cancelHotelBooking() {
        String expected = "Hotel booking is cancelled";
        assertEquals(hotelBooking.cancelHotelBooking(),expected);
    }
}