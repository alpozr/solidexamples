package interfaceseg;

public class HotelBooking implements Hotel{
    @Override
    public String bookingStatus() {
        return "Book id : HTL1200924920 \n Book date : 15.07.2023\n Book from : Hotels.com\n Book Price : 35$/per night";
    }

    @Override
    public String hotelInformation() {
        return "Hotel name : Land Of Legends \n Place : Wildwood,NJ / USA \n Hotel Rating : 4.32/5";

    }

    @Override
    public String bookHotel() {
        return "Hotel has been booked";
    }

    @Override
    public String cancelHotelBooking() {
        return "Hotel booking is cancelled";
    }
}
