package com.ita.minipackage.Controller;

import com.ita.minipackage.Entity.BookPickup;
import com.ita.minipackage.Service.BookPickupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "package/bookpickup" )
public class BookPickupController {

    @Autowired
    private BookPickupService bookPickupService;

    @PostMapping(produces={"application/json"})
    @ResponseStatus(code= HttpStatus.CREATED)
    public BookPickup createBooking(@RequestBody BookPickup bookPickup) {
        return bookPickupService.createBooking(bookPickup);
    }

    @GetMapping(path="/{packageNumber}", produces={"application/json"})
    @ResponseStatus(code = HttpStatus.OK)
    public BookPickup getSpecificPackageNumber(@PathVariable Integer packageNumber) {
        return bookPickupService.getSpecificPackage(packageNumber);
    }





}
