package com.driver.Services;

import com.driver.Repository.HotelManagementRepository;
import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;

import java.util.List;

public class HotelManagementService {
    HotelManagementRepository repository = new HotelManagementRepository();

    public String addHotel(Hotel hotel) {

        String ans = repository.addHotel(hotel);

        return ans;
    }

    public Integer addUser(User user) {

        int adharNo = repository.addUser(user);

        return adharNo;
    }

    public String getHotelWithMostFacility() {

        String hotelName = repository.getHotelWithMostFacilities();
        return hotelName;
    }

    public int bookARoom(Booking booking) {
        return repository.bookARoom(booking);
    }

    public int getBooking(Integer adharCard) {

        int count = repository.getBooking(adharCard);
        return count;
    }

    public Hotel updateFacility(List<Facility> newFacilities, String hotelName) {

        return repository.updateFacility(newFacilities, hotelName);
    }
}
