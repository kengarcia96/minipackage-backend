package com.ita.minipackage.Service;

import com.ita.minipackage.Entity.BookPickup;
import com.ita.minipackage.Repository.BookPickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookPickupService {

    @Autowired
    private BookPickupRepository bookPickupRepository;

    public BookPickup createBooking(BookPickup bookPickup) {
            return bookPickupRepository.save(bookPickup);
    }

    public BookPickup getSpecificPackage(Integer packageNumber) {
        return bookPickupRepository.findbyPackageNumber(packageNumber);
    }
}
